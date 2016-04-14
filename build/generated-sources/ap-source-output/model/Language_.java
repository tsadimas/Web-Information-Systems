package model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Film;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-14T15:58:23")
@StaticMetamodel(Language.class)
public class Language_ { 

    public static volatile SingularAttribute<Language, Date> lastUpdate;
    public static volatile ListAttribute<Language, Film> filmList;
    public static volatile SingularAttribute<Language, Short> languageId;
    public static volatile SingularAttribute<Language, String> name;
    public static volatile ListAttribute<Language, Film> filmList1;

}