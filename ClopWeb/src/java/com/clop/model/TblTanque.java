/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "tbl_tanque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTanque.findAll", query = "SELECT t FROM TblTanque t")
    , @NamedQuery(name = "TblTanque.findByIDtanque", query = "SELECT t FROM TblTanque t WHERE t.iDtanque = :iDtanque")
    , @NamedQuery(name = "TblTanque.findByPlacaTanque", query = "SELECT t FROM TblTanque t WHERE t.placaTanque = :placaTanque")
    , @NamedQuery(name = "TblTanque.findByCapacidad", query = "SELECT t FROM TblTanque t WHERE t.capacidad = :capacidad")
    , @NamedQuery(name = "TblTanque.findByCondicionTanque", query = "SELECT t FROM TblTanque t WHERE t.condicionTanque = :condicionTanque")
    , @NamedQuery(name = "TblTanque.findByEstadoTanque", query = "SELECT t FROM TblTanque t WHERE t.estadoTanque = :estadoTanque")})
public class TblTanque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_tanque")
    private Integer iDtanque;
    @Column(name = "placa_tanque")
    private Integer placaTanque;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "capacidad")
    private Double capacidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "condicion_tanque")
    private String condicionTanque;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_tanque")
    private boolean estadoTanque;
    @OneToMany(mappedBy = "iDtanque")
    private Collection<TblCarrotanques> tblCarrotanquesCollection;

    public TblTanque() {
    }

    public TblTanque(Integer iDtanque) {
        this.iDtanque = iDtanque;
    }

    public TblTanque(Integer iDtanque, String condicionTanque, boolean estadoTanque) {
        this.iDtanque = iDtanque;
        this.condicionTanque = condicionTanque;
        this.estadoTanque = estadoTanque;
    }

    public Integer getIDtanque() {
        return iDtanque;
    }

    public void setIDtanque(Integer iDtanque) {
        this.iDtanque = iDtanque;
    }

    public Integer getPlacaTanque() {
        return placaTanque;
    }

    public void setPlacaTanque(Integer placaTanque) {
        this.placaTanque = placaTanque;
    }

    public Double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Double capacidad) {
        this.capacidad = capacidad;
    }

    public String getCondicionTanque() {
        return condicionTanque;
    }

    public void setCondicionTanque(String condicionTanque) {
        this.condicionTanque = condicionTanque;
    }

    public boolean getEstadoTanque() {
        return estadoTanque;
    }

    public void setEstadoTanque(boolean estadoTanque) {
        this.estadoTanque = estadoTanque;
    }

    @XmlTransient
    public Collection<TblCarrotanques> getTblCarrotanquesCollection() {
        return tblCarrotanquesCollection;
    }

    public void setTblCarrotanquesCollection(Collection<TblCarrotanques> tblCarrotanquesCollection) {
        this.tblCarrotanquesCollection = tblCarrotanquesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDtanque != null ? iDtanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTanque)) {
            return false;
        }
        TblTanque other = (TblTanque) object;
        if ((this.iDtanque == null && other.iDtanque != null) || (this.iDtanque != null && !this.iDtanque.equals(other.iDtanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblTanque[ iDtanque=" + iDtanque + " ]";
    }
    
}
