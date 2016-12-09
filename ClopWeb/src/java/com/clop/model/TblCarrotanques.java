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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tbl_carrotanques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblCarrotanques.findAll", query = "SELECT t FROM TblCarrotanques t")
    , @NamedQuery(name = "TblCarrotanques.findByIDcarrotanque", query = "SELECT t FROM TblCarrotanques t WHERE t.iDcarrotanque = :iDcarrotanque")
    , @NamedQuery(name = "TblCarrotanques.findByTipo", query = "SELECT t FROM TblCarrotanques t WHERE t.tipo = :tipo")
    , @NamedQuery(name = "TblCarrotanques.findByCondicion", query = "SELECT t FROM TblCarrotanques t WHERE t.condicion = :condicion")
    , @NamedQuery(name = "TblCarrotanques.findByEstado", query = "SELECT t FROM TblCarrotanques t WHERE t.estado = :estado")})
public class TblCarrotanques implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_carrotanque")
    private Integer iDcarrotanque;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "condicion")
    private String condicion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @JoinColumn(name = "ID_cabezote", referencedColumnName = "ID_cabezote")
    @ManyToOne(optional = false)
    private TblCabezotes iDcabezote;
    @JoinColumn(name = "ID_empresa", referencedColumnName = "ID_empresa")
    @ManyToOne(optional = false)
    private TblEmpresaTransportadora iDempresa;
    @JoinColumn(name = "ID_tanque", referencedColumnName = "ID_tanque")
    @ManyToOne
    private TblTanque iDtanque;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDcarrotanques")
    private Collection<TblServicio> tblServicioCollection;

    public TblCarrotanques() {
    }

    public TblCarrotanques(Integer iDcarrotanque) {
        this.iDcarrotanque = iDcarrotanque;
    }

    public TblCarrotanques(Integer iDcarrotanque, String tipo, String condicion, boolean estado) {
        this.iDcarrotanque = iDcarrotanque;
        this.tipo = tipo;
        this.condicion = condicion;
        this.estado = estado;
    }

    public Integer getIDcarrotanque() {
        return iDcarrotanque;
    }

    public void setIDcarrotanque(Integer iDcarrotanque) {
        this.iDcarrotanque = iDcarrotanque;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public TblCabezotes getIDcabezote() {
        return iDcabezote;
    }

    public void setIDcabezote(TblCabezotes iDcabezote) {
        this.iDcabezote = iDcabezote;
    }

    public TblEmpresaTransportadora getIDempresa() {
        return iDempresa;
    }

    public void setIDempresa(TblEmpresaTransportadora iDempresa) {
        this.iDempresa = iDempresa;
    }

    public TblTanque getIDtanque() {
        return iDtanque;
    }

    public void setIDtanque(TblTanque iDtanque) {
        this.iDtanque = iDtanque;
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
        hash += (iDcarrotanque != null ? iDcarrotanque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblCarrotanques)) {
            return false;
        }
        TblCarrotanques other = (TblCarrotanques) object;
        if ((this.iDcarrotanque == null && other.iDcarrotanque != null) || (this.iDcarrotanque != null && !this.iDcarrotanque.equals(other.iDcarrotanque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblCarrotanques[ iDcarrotanque=" + iDcarrotanque + " ]";
    }
    
}
