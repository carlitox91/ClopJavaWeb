/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "tbl_historialusuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblHistorialusuario.findAll", query = "SELECT t FROM TblHistorialusuario t")
    , @NamedQuery(name = "TblHistorialusuario.findByIDHistorial", query = "SELECT t FROM TblHistorialusuario t WHERE t.iDHistorial = :iDHistorial")
    , @NamedQuery(name = "TblHistorialusuario.findByTablaAfectada", query = "SELECT t FROM TblHistorialusuario t WHERE t.tablaAfectada = :tablaAfectada")
    , @NamedQuery(name = "TblHistorialusuario.findByCampoAfectado", query = "SELECT t FROM TblHistorialusuario t WHERE t.campoAfectado = :campoAfectado")
    , @NamedQuery(name = "TblHistorialusuario.findByContenidoNuevo", query = "SELECT t FROM TblHistorialusuario t WHERE t.contenidoNuevo = :contenidoNuevo")
    , @NamedQuery(name = "TblHistorialusuario.findByContenidoAntiguo", query = "SELECT t FROM TblHistorialusuario t WHERE t.contenidoAntiguo = :contenidoAntiguo")})
public class TblHistorialusuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Historial")
    private Integer iDHistorial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "TablaAfectada")
    private String tablaAfectada;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CampoAfectado")
    private String campoAfectado;
    @Size(max = 16)
    @Column(name = "ContenidoNuevo")
    private String contenidoNuevo;
    @Size(max = 16)
    @Column(name = "ContenidoAntiguo")
    private String contenidoAntiguo;
    @JoinColumn(name = "ID_Usuario", referencedColumnName = "ID_Persona")
    @ManyToOne(optional = false)
    private TblUsuario iDUsuario;

    public TblHistorialusuario() {
    }

    public TblHistorialusuario(Integer iDHistorial) {
        this.iDHistorial = iDHistorial;
    }

    public TblHistorialusuario(Integer iDHistorial, String tablaAfectada, String campoAfectado) {
        this.iDHistorial = iDHistorial;
        this.tablaAfectada = tablaAfectada;
        this.campoAfectado = campoAfectado;
    }

    public Integer getIDHistorial() {
        return iDHistorial;
    }

    public void setIDHistorial(Integer iDHistorial) {
        this.iDHistorial = iDHistorial;
    }

    public String getTablaAfectada() {
        return tablaAfectada;
    }

    public void setTablaAfectada(String tablaAfectada) {
        this.tablaAfectada = tablaAfectada;
    }

    public String getCampoAfectado() {
        return campoAfectado;
    }

    public void setCampoAfectado(String campoAfectado) {
        this.campoAfectado = campoAfectado;
    }

    public String getContenidoNuevo() {
        return contenidoNuevo;
    }

    public void setContenidoNuevo(String contenidoNuevo) {
        this.contenidoNuevo = contenidoNuevo;
    }

    public String getContenidoAntiguo() {
        return contenidoAntiguo;
    }

    public void setContenidoAntiguo(String contenidoAntiguo) {
        this.contenidoAntiguo = contenidoAntiguo;
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
        hash += (iDHistorial != null ? iDHistorial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblHistorialusuario)) {
            return false;
        }
        TblHistorialusuario other = (TblHistorialusuario) object;
        if ((this.iDHistorial == null && other.iDHistorial != null) || (this.iDHistorial != null && !this.iDHistorial.equals(other.iDHistorial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblHistorialusuario[ iDHistorial=" + iDHistorial + " ]";
    }
    
}
