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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "tbl_rol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblRol.findAll", query = "SELECT t FROM TblRol t")
    , @NamedQuery(name = "TblRol.findByIDRol", query = "SELECT t FROM TblRol t WHERE t.iDRol = :iDRol")
    , @NamedQuery(name = "TblRol.findByNombreRol", query = "SELECT t FROM TblRol t WHERE t.nombreRol = :nombreRol")
    , @NamedQuery(name = "TblRol.findByPermisosRol", query = "SELECT t FROM TblRol t WHERE t.permisosRol = :permisosRol")})
public class TblRol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Rol")
    private Integer iDRol;
    @Size(max = 16)
    @Column(name = "Nombre_Rol")
    private String nombreRol;
    @Size(max = 2)
    @Column(name = "Permisos_Rol")
    private String permisosRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuRol")
    private Collection<TblUsuario> tblUsuarioCollection;

    public TblRol() {
    }

    public TblRol(Integer iDRol) {
        this.iDRol = iDRol;
    }

    public Integer getIDRol() {
        return iDRol;
    }

    public void setIDRol(Integer iDRol) {
        this.iDRol = iDRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getPermisosRol() {
        return permisosRol;
    }

    public void setPermisosRol(String permisosRol) {
        this.permisosRol = permisosRol;
    }

    @XmlTransient
    public Collection<TblUsuario> getTblUsuarioCollection() {
        return tblUsuarioCollection;
    }

    public void setTblUsuarioCollection(Collection<TblUsuario> tblUsuarioCollection) {
        this.tblUsuarioCollection = tblUsuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDRol != null ? iDRol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRol)) {
            return false;
        }
        TblRol other = (TblRol) object;
        if ((this.iDRol == null && other.iDRol != null) || (this.iDRol != null && !this.iDRol.equals(other.iDRol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblRol[ iDRol=" + iDRol + " ]";
    }
    
}
