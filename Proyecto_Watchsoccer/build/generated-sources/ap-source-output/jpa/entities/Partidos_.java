package jpa.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Equipos;
import jpa.entities.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-07T16:12:35")
@StaticMetamodel(Partidos.class)
public class Partidos_ { 

    public static volatile SingularAttribute<Partidos, Date> fecha;
    public static volatile SingularAttribute<Partidos, Integer> golesLocal;
    public static volatile SingularAttribute<Partidos, Equipos> visitante;
    public static volatile SingularAttribute<Partidos, Usuarios> usuario;
    public static volatile SingularAttribute<Partidos, Integer> idPartidos;
    public static volatile SingularAttribute<Partidos, Equipos> local;
    public static volatile SingularAttribute<Partidos, Integer> golesVisitante;

}