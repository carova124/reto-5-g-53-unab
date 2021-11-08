package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Partidos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-07T16:12:35")
@StaticMetamodel(Equipos.class)
public class Equipos_ { 

    public static volatile SingularAttribute<Equipos, Integer> idEquipos;
    public static volatile SingularAttribute<Equipos, String> nombre;
    public static volatile SingularAttribute<Equipos, Partidos> partidos;
    public static volatile SingularAttribute<Equipos, Partidos> partidos1;

}