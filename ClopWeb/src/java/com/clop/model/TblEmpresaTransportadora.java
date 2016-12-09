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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "tbl_empresa_transportadora")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblEmpresaTransportadora.findAll", query = "SELECT t FROM TblEmpresaTransportadora t")
    , @NamedQuery(name = "TblEmpresaTransportadora.findByIDempresa", query = "SELECT t FROM TblEmpresaTransportadora t WHERE t.iDempresa = :iDempresa")
    , @NamedQuery(name = "TblEmpresaTransportadora.findByNomEmpresa", query = "SELECT t FROM TblEmpresaTransportadora t WHERE t.nomEmpresa = :nomEmpresa")
    , @NamedQuery(name = "TblEmpresaTransportadora.findByNitEmpresa", query = "SELECT t FROM TblEmpresaTransportadora t WHERE t.nitEmpresa = :nitEmpresa")
    , @NamedQuery(name = "TblEmpresaTransportadora.findByNumContrato", query = "SELECT t FROM TblEmpresaTransportadora t WHERE t.numContrato = :numContrato")
    , @NamedQuery(name = "TblEmpresaTransportadora.findByCategoriaEmp", query = "SELECT t FROM TblEmpresaTransportadora t WHERE t.categoriaEmp = :categoriaEmp")
    , @NamedQuery(name = "TblEmpresaTransportadora.findByPorcentajeParticipacion", query = "SELECT t FROM TblEmpresaTransportadora t WHERE t.porcentajeParticipacion = :porcentajeParticipacion")
    , @NamedQuery(name = "TblEmpresaTransportadora.findByMinCarro", query = "SELECT t FROM TblEmpresaTransportadora t WHERE t.minCarro = :minCarro")})
public class TblEmpresaTransportadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_empresa")
    private Integer iDempresa;
    @Size(max = 32)
    @Column(name = "nom_empresa")
    private String nomEmpresa;
    @Column(name = "nit_empresa")
    private Integer nitEmpresa;
    @Column(name = "num_contrato")
    private Integer numContrato;
    @Column(name = "categoria_emp")
    private Short categoriaEmp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "porcentaje_participacion")
    private Double porcentajeParticipacion;
    @Column(name = "min_carro")
    private Integer minCarro;
    @JoinTable(name = "tbl_empresa_x_plan", joinColumns = {
        @JoinColumn(name = "ID_empresa", referencedColumnName = "ID_empresa")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_plan", referencedColumnName = "ID_plan")})
    @ManyToMany
    private Collection<TblPlan> tblPlanCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDempresa")
    private Collection<TblCarrotanques> tblCarrotanquesCollection;

    public TblEmpresaTransportadora() {
    }

    public TblEmpresaTransportadora(Integer iDempresa) {
        this.iDempresa = iDempresa;
    }

    public Integer getIDempresa() {
        return iDempresa;
    }

    public void setIDempresa(Integer iDempresa) {
        this.iDempresa = iDempresa;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public Integer getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(Integer nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public Integer getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(Integer numContrato) {
        this.numContrato = numContrato;
    }

    public Short getCategoriaEmp() {
        return categoriaEmp;
    }

    public void setCategoriaEmp(Short categoriaEmp) {
        this.categoriaEmp = categoriaEmp;
    }

    public Double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    public void setPorcentajeParticipacion(Double porcentajeParticipacion) {
        this.porcentajeParticipacion = porcentajeParticipacion;
    }

    public Integer getMinCarro() {
        return minCarro;
    }

    public void setMinCarro(Integer minCarro) {
        this.minCarro = minCarro;
    }

    @XmlTransient
    public Collection<TblPlan> getTblPlanCollection() {
        return tblPlanCollection;
    }

    public void setTblPlanCollection(Collection<TblPlan> tblPlanCollection) {
        this.tblPlanCollection = tblPlanCollection;
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
        hash += (iDempresa != null ? iDempresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblEmpresaTransportadora)) {
            return false;
        }
        TblEmpresaTransportadora other = (TblEmpresaTransportadora) object;
        if ((this.iDempresa == null && other.iDempresa != null) || (this.iDempresa != null && !this.iDempresa.equals(other.iDempresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblEmpresaTransportadora[ iDempresa=" + iDempresa + " ]";
    }
    
}
