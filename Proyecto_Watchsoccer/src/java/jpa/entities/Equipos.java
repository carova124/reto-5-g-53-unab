/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "equipos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipos.findAll", query = "SELECT e FROM Equipos e")
    , @NamedQuery(name = "Equipos.findByIdEquipos", query = "SELECT e FROM Equipos e WHERE e.idEquipos = :idEquipos")
    , @NamedQuery(name = "Equipos.findByNombre", query = "SELECT e FROM Equipos e WHERE e.nombre = :nombre")})
public class Equipos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_equipos")
    private Integer idEquipos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nombre")
    private String nombre;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "local")
    private Partidos partidos;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "visitante")
    private Partidos partidos1;

    public Equipos() {
    }

    public Equipos(Integer idEquipos) {
        this.idEquipos = idEquipos;
    }

    public Equipos(Integer idEquipos, String nombre) {
        this.idEquipos = idEquipos;
        this.nombre = nombre;
    }

    public Integer getIdEquipos() {
        return idEquipos;
    }

    public void setIdEquipos(Integer idEquipos) {
        this.idEquipos = idEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Partidos getPartidos() {
        return partidos;
    }

    public void setPartidos(Partidos partidos) {
        this.partidos = partidos;
    }

    public Partidos getPartidos1() {
        return partidos1;
    }

    public void setPartidos1(Partidos partidos1) {
        this.partidos1 = partidos1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipos != null ? idEquipos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipos)) {
            return false;
        }
        Equipos other = (Equipos) object;
        if ((this.idEquipos == null && other.idEquipos != null) || (this.idEquipos != null && !this.idEquipos.equals(other.idEquipos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Equipos[ idEquipos=" + idEquipos + " ]";
    }
    
}
