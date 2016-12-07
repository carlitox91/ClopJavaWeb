/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "tbl_persona")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPersona.findAll", query = "SELECT t FROM TblPersona t"),
    @NamedQuery(name = "TblPersona.findByIDPersona", query = "SELECT t FROM TblPersona t WHERE t.iDPersona = :iDPersona"),
    @NamedQuery(name = "TblPersona.findByUsuNombre", query = "SELECT t FROM TblPersona t WHERE t.usuNombre = :usuNombre"),
    @NamedQuery(name = "TblPersona.findByUsuApellido", query = "SELECT t FROM TblPersona t WHERE t.usuApellido = :usuApellido"),
    @NamedQuery(name = "TblPersona.findByUsuGenero", query = "SELECT t FROM TblPersona t WHERE t.usuGenero = :usuGenero"),
    @NamedQuery(name = "TblPersona.findByUsuFechaNacimiento", query = "SELECT t FROM TblPersona t WHERE t.usuFechaNacimiento = :usuFechaNacimiento"),
    @NamedQuery(name = "TblPersona.findByUsuCiudadResidencia", query = "SELECT t FROM TblPersona t WHERE t.usuCiudadResidencia = :usuCiudadResidencia"),
    @NamedQuery(name = "TblPersona.findByUsuDireccion", query = "SELECT t FROM TblPersona t WHERE t.usuDireccion = :usuDireccion"),
    @NamedQuery(name = "TblPersona.findByUsuTelFijo", query = "SELECT t FROM TblPersona t WHERE t.usuTelFijo = :usuTelFijo"),
    @NamedQuery(name = "TblPersona.findByUsuTelCelular", query = "SELECT t FROM TblPersona t WHERE t.usuTelCelular = :usuTelCelular")})
public class TblPersona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_Persona")
    private Integer iDPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Usu_Nombre")
    private String usuNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Usu_Apellido")
    private String usuApellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Usu_Genero")
    private String usuGenero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Usu_FechaNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usuFechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Usu_CiudadResidencia")
    private String usuCiudadResidencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Usu_Direccion")
    private String usuDireccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Usu_TelFijo")
    private String usuTelFijo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Usu_TelCelular")
    private String usuTelCelular;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "tblPersona")
    private TblUsuario tblUsuario;

    public TblPersona() {
    }

    public TblPersona(Integer iDPersona) {
        this.iDPersona = iDPersona;
    }

    public TblPersona(Integer iDPersona, String usuNombre, String usuApellido, String usuGenero, Date usuFechaNacimiento, String usuCiudadResidencia, String usuDireccion, String usuTelFijo, String usuTelCelular) {
        this.iDPersona = iDPersona;
        this.usuNombre = usuNombre;
        this.usuApellido = usuApellido;
        this.usuGenero = usuGenero;
        this.usuFechaNacimiento = usuFechaNacimiento;
        this.usuCiudadResidencia = usuCiudadResidencia;
        this.usuDireccion = usuDireccion;
        this.usuTelFijo = usuTelFijo;
        this.usuTelCelular = usuTelCelular;
    }

    public Integer getIDPersona() {
        return iDPersona;
    }

    public void setIDPersona(Integer iDPersona) {
        this.iDPersona = iDPersona;
    }

    public String getUsuNombre() {
        return usuNombre;
    }

    public void setUsuNombre(String usuNombre) {
        this.usuNombre = usuNombre;
    }

    public String getUsuApellido() {
        return usuApellido;
    }

    public void setUsuApellido(String usuApellido) {
        this.usuApellido = usuApellido;
    }

    public String getUsuGenero() {
        return usuGenero;
    }

    public void setUsuGenero(String usuGenero) {
        this.usuGenero = usuGenero;
    }

    public Date getUsuFechaNacimiento() {
        return usuFechaNacimiento;
    }

    public void setUsuFechaNacimiento(Date usuFechaNacimiento) {
        this.usuFechaNacimiento = usuFechaNacimiento;
    }

    public String getUsuCiudadResidencia() {
        return usuCiudadResidencia;
    }

    public void setUsuCiudadResidencia(String usuCiudadResidencia) {
        this.usuCiudadResidencia = usuCiudadResidencia;
    }

    public String getUsuDireccion() {
        return usuDireccion;
    }

    public void setUsuDireccion(String usuDireccion) {
        this.usuDireccion = usuDireccion;
    }

    public String getUsuTelFijo() {
        return usuTelFijo;
    }

    public void setUsuTelFijo(String usuTelFijo) {
        this.usuTelFijo = usuTelFijo;
    }

    public String getUsuTelCelular() {
        return usuTelCelular;
    }

    public void setUsuTelCelular(String usuTelCelular) {
        this.usuTelCelular = usuTelCelular;
    }

    public TblUsuario getTblUsuario() {
        return tblUsuario;
    }

    public void setTblUsuario(TblUsuario tblUsuario) {
        this.tblUsuario = tblUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDPersona != null ? iDPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPersona)) {
            return false;
        }
        TblPersona other = (TblPersona) object;
        if ((this.iDPersona == null && other.iDPersona != null) || (this.iDPersona != null && !this.iDPersona.equals(other.iDPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblPersona[ iDPersona=" + iDPersona + " ]";
    }
    
}
