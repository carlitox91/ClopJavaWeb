/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "tbl_cabezotes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCabezotes.findAll", query = "SELECT t FROM TblCabezotes t")
    , @NamedQuery(name = "TblCabezotes.findByIDcabezote", query = "SELECT t FROM TblCabezotes t WHERE t.iDcabezote = :iDcabezote")
    , @NamedQuery(name = "TblCabezotes.findByPlacaCabezote", query = "SELECT t FROM TblCabezotes t WHERE t.placaCabezote = :placaCabezote")
    , @NamedQuery(name = "TblCabezotes.findByTipoCarro", query = "SELECT t FROM TblCabezotes t WHERE t.tipoCarro = :tipoCarro")
    , @NamedQuery(name = "TblCabezotes.findByCondicionCarro", query = "SELECT t FROM TblCabezotes t WHERE t.condicionCarro = :condicionCarro")
    , @NamedQuery(name = "TblCabezotes.findByEstadoCarro", query = "SELECT t FROM TblCabezotes t WHERE t.estadoCarro = :estadoCarro")})
public class TblCabezotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_cabezote")
    private Integer iDcabezote;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "placa_cabezote")
    private String placaCabezote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo_carro")
    private boolean tipoCarro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "condicion_carro")
    private String condicionCarro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado_carro")
    private boolean estadoCarro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDcabezote")
    private Collection<TblCarrotanques> tblCarrotanquesCollection;

    public TblCabezotes() {
    }

    public TblCabezotes(Integer iDcabezote) {
        this.iDcabezote = iDcabezote;
    }

    public TblCabezotes(Integer iDcabezote, String placaCabezote, boolean tipoCarro, String condicionCarro, boolean estadoCarro) {
        this.iDcabezote = iDcabezote;
        this.placaCabezote = placaCabezote;
        this.tipoCarro = tipoCarro;
        this.condicionCarro = condicionCarro;
        this.estadoCarro = estadoCarro;
    }

    public Integer getIDcabezote() {
        return iDcabezote;
    }

    public void setIDcabezote(Integer iDcabezote) {
        this.iDcabezote = iDcabezote;
    }

    public String getPlacaCabezote() {
        return placaCabezote;
    }

    public void setPlacaCabezote(String placaCabezote) {
        this.placaCabezote = placaCabezote;
    }

    public boolean getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(boolean tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getCondicionCarro() {
        return condicionCarro;
    }

    public void setCondicionCarro(String condicionCarro) {
        this.condicionCarro = condicionCarro;
    }

    public boolean getEstadoCarro() {
        return estadoCarro;
    }

    public void setEstadoCarro(boolean estadoCarro) {
        this.estadoCarro = estadoCarro;
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
        hash += (iDcabezote != null ? iDcabezote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCabezotes)) {
            return false;
        }
        TblCabezotes other = (TblCabezotes) object;
        if ((this.iDcabezote == null && other.iDcabezote != null) || (this.iDcabezote != null && !this.iDcabezote.equals(other.iDcabezote))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblCabezotes[ iDcabezote=" + iDcabezote + " ]";
    }
    
}
