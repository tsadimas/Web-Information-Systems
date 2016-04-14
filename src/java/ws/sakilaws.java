/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.Actor;
import model.ActorManager;

/**
 *
 * @author rg
 */
@WebService(serviceName = "sakilaws")
public class sakilaws {
    
        ActorManager am=new ActorManager();


    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
     @WebMethod(operationName = "actors")
    public List<Actor> employees() {
        List<Actor> actors=am.getAllUsers();
        System.out.println("Size "+actors.size());
    return actors;
    }
    
    
     @WebMethod(operationName = "createactor")
    public Boolean createactor(@WebParam(name = "firstname") String firstname,@WebParam(name = "lastname") String lastname) {
        Actor a=new Actor();
        a.setFirstName(firstname);
        a.setLastName(lastname);
        Boolean result=am.createActor(a);
        System.out.println("Result "+result);
    return result;
    }
    
    
    
}
