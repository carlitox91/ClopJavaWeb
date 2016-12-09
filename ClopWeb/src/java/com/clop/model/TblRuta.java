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
@Table(name = "tbl_ruta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblRuta.findAll", query = "SELECT t FROM TblRuta t")
    , @NamedQuery(name = "TblRuta.findByIdRuta", query = "SELECT t FROM TblRuta t WHERE t.idRuta = :idRuta")
    , @NamedQuery(name = "TblRuta.findByOrigen", query = "SELECT t FROM TblRuta t WHERE t.origen = :origen")
    , @NamedQuery(name = "TblRuta.findByDestino", query = "SELECT t FROM TblRuta t WHERE t.destino = :destino")})
public class TblRuta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ruta")
    private Integer idRuta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "origen")
    private String origen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "destino")
    private String destino;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDruta")
    private Collection<TblPlan> tblPlanCollection;

    public TblRuta() {
    }

    public TblRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public TblRuta(Integer idRuta, String origen, String destino) {
        this.idRuta = idRuta;
        this.origen = origen;
        this.destino = destino;
    }

    public Integer getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(Integer idRuta) {
        this.idRuta = idRuta;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    @XmlTransient
    public Collection<TblPlan> getTblPlanCollection() {
        return tblPlanCollection;
    }

    public void setTblPlanCollection(Collection<TblPlan> tblPlanCollection) {
        this.tblPlanCollection = tblPlanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRuta != null ? idRuta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblRuta)) {
            return false;
        }
        TblRuta other = (TblRuta) object;
        if ((this.idRuta == null && other.idRuta != null) || (this.idRuta != null && !this.idRuta.equals(other.idRuta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblRuta[ idRuta=" + idRuta + " ]";
    }
    
}
