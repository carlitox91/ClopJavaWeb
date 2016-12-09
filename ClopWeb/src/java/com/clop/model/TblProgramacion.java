/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "tbl_programacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblProgramacion.findAll", query = "SELECT t FROM TblProgramacion t")
    , @NamedQuery(name = "TblProgramacion.findByIDprogramacion", query = "SELECT t FROM TblProgramacion t WHERE t.iDprogramacion = :iDprogramacion")
    , @NamedQuery(name = "TblProgramacion.findByVolumenNominado", query = "SELECT t FROM TblProgramacion t WHERE t.volumenNominado = :volumenNominado")
    , @NamedQuery(name = "TblProgramacion.findByFechaIni", query = "SELECT t FROM TblProgramacion t WHERE t.fechaIni = :fechaIni")
    , @NamedQuery(name = "TblProgramacion.findByHoraIni", query = "SELECT t FROM TblProgramacion t WHERE t.horaIni = :horaIni")})
public class TblProgramacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_programacion")
    private Integer iDprogramacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "volumen_nominado")
    private double volumenNominado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_ini")
    @Temporal(TemporalType.DATE)
    private Date fechaIni;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_ini")
    @Temporal(TemporalType.TIME)
    private Date horaIni;
    @Lob
    @Size(max = 65535)
    @Column(name = "observaciones")
    private String observaciones;
    @JoinColumn(name = "ID_Plan", referencedColumnName = "ID_plan")
    @ManyToOne(optional = false)
    private TblPlan iDPlan;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Persona")
    @ManyToOne
    private TblUsuario iDUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDprogramacion")
    private Collection<TblServicio> tblServicioCollection;

    public TblProgramacion() {
    }

    public TblProgramacion(Integer iDprogramacion) {
        this.iDprogramacion = iDprogramacion;
    }

    public TblProgramacion(Integer iDprogramacion, double volumenNominado, Date fechaIni, Date horaIni) {
        this.iDprogramacion = iDprogramacion;
        this.volumenNominado = volumenNominado;
        this.fechaIni = fechaIni;
        this.horaIni = horaIni;
    }

    public Integer getIDprogramacion() {
        return iDprogramacion;
    }

    public void setIDprogramacion(Integer iDprogramacion) {
        this.iDprogramacion = iDprogramacion;
    }

    public double getVolumenNominado() {
        return volumenNominado;
    }

    public void setVolumenNominado(double volumenNominado) {
        this.volumenNominado = volumenNominado;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Date horaIni) {
        this.horaIni = horaIni;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public TblPlan getIDPlan() {
        return iDPlan;
    }

    public void setIDPlan(TblPlan iDPlan) {
        this.iDPlan = iDPlan;
    }

    public TblUsuario getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(TblUsuario iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    @XmlTransient
    public Collection<TblServicio> getTblServicioCollection() {
        return tblServicioCollection;
    }

    public void setTblServicioCollection(Collection<TblServicio> tblServicioCollection) {
        this.tblServicioCollection = tblServicioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDprogramacion != null ? iDprogramacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProgramacion)) {
            return false;
        }
        TblProgramacion other = (TblProgramacion) object;
        if ((this.iDprogramacion == null && other.iDprogramacion != null) || (this.iDprogramacion != null && !this.iDprogramacion.equals(other.iDprogramacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblProgramacion[ iDprogramacion=" + iDprogramacion + " ]";
    }
    
}
