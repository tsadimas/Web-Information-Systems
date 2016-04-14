/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rg
 */
public class ActorManager {
        
    
    private Connection connection;

    
    List<Actor> allusers;
     
    public ActorManager() {
        connection = Database.getConnection();
    }
    
      
    public List<Actor> getAllUsers() {
        List<Actor> emps = new ArrayList<Actor>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from actor order by actor_id desc limit 50");
            while (rs.next()) {
                Actor user = new Actor();
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                emps.add(user);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
        this.allusers=emps;
        return emps;
    }
    
    public boolean createActor(Actor actor){
        Boolean b=false;
              
        try {
            System.out.println("add user start");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into actor(first_name, last_name) values (?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, actor.getFirstName());
            preparedStatement.setString(2, actor.getLastName());
            preparedStatement.executeUpdate();
             System.out.println("add user end");
             b=true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return b;
    }
                
    
}


