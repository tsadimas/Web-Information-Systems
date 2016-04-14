package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Language;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-04-14T15:58:23")
@StaticMetamodel(Film.class)
public class Film_ { 

    public static volatile SingularAttribute<Film, BigDecimal> rentalRate;
    public static volatile SingularAttribute<Film, Short> rentalDuration;
    public static volatile SingularAttribute<Film, Short> length;
    public static volatile SingularAttribute<Film, String> rating;
    public static volatile SingularAttribute<Film, Language> languageId;
    public static volatile SingularAttribute<Film, String> description;
    public static volatile SingularAttribute<Film, BigDecimal> replacementCost;
    public static volatile SingularAttribute<Film, String> title;
    public static volatile SingularAttribute<Film, String> specialFeatures;
    public static volatile SingularAttribute<Film, Short> filmId;
    public static volatile SingularAttribute<Film, Date> lastUpdate;
    public static volatile SingularAttribute<Film, Language> originalLanguageId;
    public static volatile SingularAttribute<Film, Date> releaseYear;

}