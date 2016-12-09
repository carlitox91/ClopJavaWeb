/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "tbl_servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblServicio.findAll", query = "SELECT t FROM TblServicio t")
    , @NamedQuery(name = "TblServicio.findByIDguia", query = "SELECT t FROM TblServicio t WHERE t.iDguia = :iDguia")
    , @NamedQuery(name = "TblServicio.findByNumSello", query = "SELECT t FROM TblServicio t WHERE t.numSello = :numSello")
    , @NamedQuery(name = "TblServicio.findByFechaCargue", query = "SELECT t FROM TblServicio t WHERE t.fechaCargue = :fechaCargue")
    , @NamedQuery(name = "TblServicio.findByHoraCargue", query = "SELECT t FROM TblServicio t WHERE t.horaCargue = :horaCargue")
    , @NamedQuery(name = "TblServicio.findByFechaDescargue", query = "SELECT t FROM TblServicio t WHERE t.fechaDescargue = :fechaDescargue")
    , @NamedQuery(name = "TblServicio.findByHoraDescargue", query = "SELECT t FROM TblServicio t WHERE t.horaDescargue = :horaDescargue")
    , @NamedQuery(name = "TblServicio.findByBrrlsBrutosCarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsBrutosCarga = :brrlsBrutosCarga")
    , @NamedQuery(name = "TblServicio.findByBrrlsNetosCarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsNetosCarga = :brrlsNetosCarga")
    , @NamedQuery(name = "TblServicio.findByBrrlsBrutosDescarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsBrutosDescarga = :brrlsBrutosDescarga")
    , @NamedQuery(name = "TblServicio.findByBrrlsNetosDescarga", query = "SELECT t FROM TblServicio t WHERE t.brrlsNetosDescarga = :brrlsNetosDescarga")})
public class TblServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_guia")
    private Integer iDguia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "num_sello")
    private String numSello;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cargue")
    @Temporal(TemporalType.DATE)
    private Date fechaCargue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_cargue")
    @Temporal(TemporalType.TIME)
    private Date horaCargue;
    @Column(name = "fecha_descargue")
    @Temporal(TemporalType.DATE)
    private Date fechaDescargue;
    @Column(name = "hora_descargue")
    @Temporal(TemporalType.TIME)
    private Date horaDescargue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "brrls_brutos_carga")
    private double brrlsBrutosCarga;
    @Basic(optional = false)
    @NotNull
    @Column(name = "brrls_netos_carga")
    private double brrlsNetosCarga;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "brrls_brutos_descarga")
    private Double brrlsBrutosDescarga;
    @Column(name = "brrls_netos_descarga")
    private Double brrlsNetosDescarga;
    @JoinColumn(name = "ID_carrotanques", referencedColumnName = "ID_carrotanque")
    @ManyToOne(optional = false)
    private TblCarrotanques iDcarrotanques;
    @JoinColumn(name = "ID_identificacion", referencedColumnName = "ID_identificacion")
    @ManyToOne(optional = false)
    private TblConductores iDidentificacion;
    @JoinColumn(name = "ID_producto", referencedColumnName = "ID_producto")
    @ManyToOne(optional = false)
    private TblProducto iDproducto;
    @JoinColumn(name = "ID_programacion", referencedColumnName = "ID_programacion")
    @ManyToOne(optional = false)
    private TblProgramacion iDprogramacion;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Persona")
    @ManyToOne(optional = false)
    private TblUsuario iDUsuario;

    public TblServicio() {
    }

    public TblServicio(Integer iDguia) {
        this.iDguia = iDguia;
    }

    public TblServicio(Integer iDguia, String numSello, Date fechaCargue, Date horaCargue, double brrlsBrutosCarga, double brrlsNetosCarga) {
        this.iDguia = iDguia;
        this.numSello = numSello;
        this.fechaCargue = fechaCargue;
        this.horaCargue = horaCargue;
        this.brrlsBrutosCarga = brrlsBrutosCarga;
        this.brrlsNetosCarga = brrlsNetosCarga;
    }

    public Integer getIDguia() {
        return iDguia;
    }

    public void setIDguia(Integer iDguia) {
        this.iDguia = iDguia;
    }

    public String getNumSello() {
        return numSello;
    }

    public void setNumSello(String numSello) {
        this.numSello = numSello;
    }

    public Date getFechaCargue() {
        return fechaCargue;
    }

    public void setFechaCargue(Date fechaCargue) {
        this.fechaCargue = fechaCargue;
    }

    public Date getHoraCargue() {
        return horaCargue;
    }

    public void setHoraCargue(Date horaCargue) {
        this.horaCargue = horaCargue;
    }

    public Date getFechaDescargue() {
        return fechaDescargue;
    }

    public void setFechaDescargue(Date fechaDescargue) {
        this.fechaDescargue = fechaDescargue;
    }

    public Date getHoraDescargue() {
        return horaDescargue;
    }

    public void setHoraDescargue(Date horaDescargue) {
        this.horaDescargue = horaDescargue;
    }

    public double getBrrlsBrutosCarga() {
        return brrlsBrutosCarga;
    }

    public void setBrrlsBrutosCarga(double brrlsBrutosCarga) {
        this.brrlsBrutosCarga = brrlsBrutosCarga;
    }

    public double getBrrlsNetosCarga() {
        return brrlsNetosCarga;
    }

    public void setBrrlsNetosCarga(double brrlsNetosCarga) {
        this.brrlsNetosCarga = brrlsNetosCarga;
    }

    public Double getBrrlsBrutosDescarga() {
        return brrlsBrutosDescarga;
    }

    public void setBrrlsBrutosDescarga(Double brrlsBrutosDescarga) {
        this.brrlsBrutosDescarga = brrlsBrutosDescarga;
    }

    public Double getBrrlsNetosDescarga() {
        return brrlsNetosDescarga;
    }

    public void setBrrlsNetosDescarga(Double brrlsNetosDescarga) {
        this.brrlsNetosDescarga = brrlsNetosDescarga;
    }

    public TblCarrotanques getIDcarrotanques() {
        return iDcarrotanques;
    }

    public void setIDcarrotanques(TblCarrotanques iDcarrotanques) {
        this.iDcarrotanques = iDcarrotanques;
    }

    public TblConductores getIDidentificacion() {
        return iDidentificacion;
    }

    public void setIDidentificacion(TblConductores iDidentificacion) {
        this.iDidentificacion = iDidentificacion;
    }

    public TblProducto getIDproducto() {
        return iDproducto;
    }

    public void setIDproducto(TblProducto iDproducto) {
        this.iDproducto = iDproducto;
    }

    public TblProgramacion getIDprogramacion() {
        return iDprogramacion;
    }

    public void setIDprogramacion(TblProgramacion iDprogramacion) {
        this.iDprogramacion = iDprogramacion;
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
        hash += (iDguia != null ? iDguia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblServicio)) {
            return false;
        }
        TblServicio other = (TblServicio) object;
        if ((this.iDguia == null && other.iDguia != null) || (this.iDguia != null && !this.iDguia.equals(other.iDguia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblServicio[ iDguia=" + iDguia + " ]";
    }
    
}
