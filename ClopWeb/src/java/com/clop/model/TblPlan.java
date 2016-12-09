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
import javax.persistence.ManyToMany;
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
@Table(name = "tbl_plan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPlan.findAll", query = "SELECT t FROM TblPlan t")
    , @NamedQuery(name = "TblPlan.findByIDplan", query = "SELECT t FROM TblPlan t WHERE t.iDplan = :iDplan")
    , @NamedQuery(name = "TblPlan.findByFechaCreacion", query = "SELECT t FROM TblPlan t WHERE t.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "TblPlan.findByVigencia", query = "SELECT t FROM TblPlan t WHERE t.vigencia = :vigencia")})
public class TblPlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_plan")
    private Integer iDplan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vigencia")
    @Temporal(TemporalType.DATE)
    private Date vigencia;
    @Lob
    @Size(max = 65535)
    @Column(name = "observaciones")
    private String observaciones;
    @ManyToMany(mappedBy = "tblPlanCollection")
    private Collection<TblEmpresaTransportadora> tblEmpresaTransportadoraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDPlan")
    private Collection<TblProgramacion> tblProgramacionCollection;
    @JoinColumn(name = "ID_ruta", referencedColumnName = "id_ruta")
    @ManyToOne(optional = false)
    private TblRuta iDruta;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Persona")
    @ManyToOne(optional = false)
    private TblUsuario iDUsuario;

    public TblPlan() {
    }

    public TblPlan(Integer iDplan) {
        this.iDplan = iDplan;
    }

    public TblPlan(Integer iDplan, Date fechaCreacion, Date vigencia) {
        this.iDplan = iDplan;
        this.fechaCreacion = fechaCreacion;
        this.vigencia = vigencia;
    }

    public Integer getIDplan() {
        return iDplan;
    }

    public void setIDplan(Integer iDplan) {
        this.iDplan = iDplan;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @XmlTransient
    public Collection<TblEmpresaTransportadora> getTblEmpresaTransportadoraCollection() {
        return tblEmpresaTransportadoraCollection;
    }

    public void setTblEmpresaTransportadoraCollection(Collection<TblEmpresaTransportadora> tblEmpresaTransportadoraCollection) {
        this.tblEmpresaTransportadoraCollection = tblEmpresaTransportadoraCollection;
    }

    @XmlTransient
    public Collection<TblProgramacion> getTblProgramacionCollection() {
        return tblProgramacionCollection;
    }

    public void setTblProgramacionCollection(Collection<TblProgramacion> tblProgramacionCollection) {
        this.tblProgramacionCollection = tblProgramacionCollection;
    }

    public TblRuta getIDruta() {
        return iDruta;
    }

    public void setIDruta(TblRuta iDruta) {
        this.iDruta = iDruta;
    }

    public TblUsuario getIDUsuario() {
        return iDUsuario;
    }

    public void setIDUsuario(TblUsuario iDUsuario) {
        this.iDUsuario = iDUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDplan != null ? iDplan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPlan)) {
            return false;
        }
        TblPlan other = (TblPlan) object;
        if ((this.iDplan == null && other.iDplan != null) || (this.iDplan != null && !this.iDplan.equals(other.iDplan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblPlan[ iDplan=" + iDplan + " ]";
    }
    
}
