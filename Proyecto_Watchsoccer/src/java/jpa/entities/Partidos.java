/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "partidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Partidos.findAll", query = "SELECT p FROM Partidos p")
    , @NamedQuery(name = "Partidos.findByIdPartidos", query = "SELECT p FROM Partidos p WHERE p.idPartidos = :idPartidos")
    , @NamedQuery(name = "Partidos.findByFecha", query = "SELECT p FROM Partidos p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Partidos.findByGolesLocal", query = "SELECT p FROM Partidos p WHERE p.golesLocal = :golesLocal")
    , @NamedQuery(name = "Partidos.findByGolesVisitante", query = "SELECT p FROM Partidos p WHERE p.golesVisitante = :golesVisitante")})
public class Partidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_partidos")
    private Integer idPartidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "goles_local")
    private int golesLocal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "goles_visitante")
    private int golesVisitante;
    @JoinColumn(name = "usuario", referencedColumnName = "id_usuarios")
    @OneToOne(optional = false)
    private Usuarios usuario;
    @JoinColumn(name = "local", referencedColumnName = "id_equipos")
    @OneToOne(optional = false)
    private Equipos local;
    @JoinColumn(name = "visitante", referencedColumnName = "id_equipos")
    @OneToOne(optional = false)
    private Equipos visitante;

    public Partidos() {
    }

    public Partidos(Integer idPartidos) {
        this.idPartidos = idPartidos;
    }

    public Partidos(Integer idPartidos, Date fecha, int golesLocal, int golesVisitante) {
        this.idPartidos = idPartidos;
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    public Integer getIdPartidos() {
        return idPartidos;
    }

    public void setIdPartidos(Integer idPartidos) {
        this.idPartidos = idPartidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Equipos getLocal() {
        return local;
    }

    public void setLocal(Equipos local) {
        this.local = local;
    }

    public Equipos getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipos visitante) {
        this.visitante = visitante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPartidos != null ? idPartidos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partidos)) {
            return false;
        }
        Partidos other = (Partidos) object;
        if ((this.idPartidos == null && other.idPartidos != null) || (this.idPartidos != null && !this.idPartidos.equals(other.idPartidos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Partidos[ idPartidos=" + idPartidos + " ]";
    }
    
}
