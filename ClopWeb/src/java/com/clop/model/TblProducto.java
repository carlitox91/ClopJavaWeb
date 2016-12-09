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
@Table(name = "tbl_producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblProducto.findAll", query = "SELECT t FROM TblProducto t")
    , @NamedQuery(name = "TblProducto.findByIDproducto", query = "SELECT t FROM TblProducto t WHERE t.iDproducto = :iDproducto")
    , @NamedQuery(name = "TblProducto.findByNomProducto", query = "SELECT t FROM TblProducto t WHERE t.nomProducto = :nomProducto")})
public class TblProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_producto")
    private Integer iDproducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "nom_producto")
    private String nomProducto;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDproducto")
    private Collection<TblServicio> tblServicioCollection;

    public TblProducto() {
    }

    public TblProducto(Integer iDproducto) {
        this.iDproducto = iDproducto;
    }

    public TblProducto(Integer iDproducto, String nomProducto) {
        this.iDproducto = iDproducto;
        this.nomProducto = nomProducto;
    }

    public Integer getIDproducto() {
        return iDproducto;
    }

    public void setIDproducto(Integer iDproducto) {
        this.iDproducto = iDproducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
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
        hash += (iDproducto != null ? iDproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProducto)) {
            return false;
        }
        TblProducto other = (TblProducto) object;
        if ((this.iDproducto == null && other.iDproducto != null) || (this.iDproducto != null && !this.iDproducto.equals(other.iDproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblProducto[ iDproducto=" + iDproducto + " ]";
    }
    
}
