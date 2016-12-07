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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "tbl_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblUsuario.findAll", query = "SELECT t FROM TblUsuario t"),
    @NamedQuery(name = "TblUsuario.findByIDPersona", query = "SELECT t FROM TblUsuario t WHERE t.iDPersona = :iDPersona"),
    @NamedQuery(name = "TblUsuario.findByUsuLogin", query = "SELECT t FROM TblUsuario t WHERE t.usuLogin = :usuLogin"),
    @NamedQuery(name = "TblUsuario.findByUsuClave", query = "SELECT t FROM TblUsuario t WHERE t.usuClave = :usuClave"),
    @NamedQuery(name = "TblUsuario.findByUsuRol", query = "SELECT t FROM TblUsuario t WHERE t.usuRol = :usuRol"),
    @NamedQuery(name = "TblUsuario.findByEstado", query = "SELECT t FROM TblUsuario t WHERE t.estado = :estado")})
public class TblUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_Persona")
    private Integer iDPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "Usu_Login")
    private String usuLogin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "Usu_Clave")
    private String usuClave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Usu_Rol")
    private String usuRol;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado")
    private boolean estado;
    @JoinColumn(name = "ID_Persona", referencedColumnName = "ID_Persona", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private TblPersona tblPersona;

    public TblUsuario() {
    }

    public TblUsuario(Integer iDPersona) {
        this.iDPersona = iDPersona;
    }

    public TblUsuario(Integer iDPersona, String usuLogin, String usuClave, String usuRol, boolean estado) {
        this.iDPersona = iDPersona;
        this.usuLogin = usuLogin;
        this.usuClave = usuClave;
        this.usuRol = usuRol;
        this.estado = estado;
    }

    public Integer getIDPersona() {
        return iDPersona;
    }

    public void setIDPersona(Integer iDPersona) {
        this.iDPersona = iDPersona;
    }

    public String getUsuLogin() {
        return usuLogin;
    }

    public void setUsuLogin(String usuLogin) {
        this.usuLogin = usuLogin;
    }

    public String getUsuClave() {
        return usuClave;
    }

    public void setUsuClave(String usuClave) {
        this.usuClave = usuClave;
    }

    public String getUsuRol() {
        return usuRol;
    }

    public void setUsuRol(String usuRol) {
        this.usuRol = usuRol;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public TblPersona getTblPersona() {
        return tblPersona;
    }

    public void setTblPersona(TblPersona tblPersona) {
        this.tblPersona = tblPersona;
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
        if (!(object instanceof TblUsuario)) {
            return false;
        }
        TblUsuario other = (TblUsuario) object;
        if ((this.iDPersona == null && other.iDPersona != null) || (this.iDPersona != null && !this.iDPersona.equals(other.iDPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clop.model.TblUsuario[ iDPersona=" + iDPersona + " ]";
    }
    
}
