/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.controller;

import com.clop.ejb.TblPersonaFacadeLocal;
import com.clop.ejb.TblRolFacadeLocal;
import com.clop.ejb.TblUsuarioFacadeLocal;
import com.clop.model.TblPersona;
import com.clop.model.TblRol;
import com.clop.model.TblUsuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author Asus
 */
@Named
@SessionScoped
public class UsuarioController implements Serializable {
    
    @EJB
    private TblPersonaFacadeLocal personaEJB;
    private TblUsuarioFacadeLocal usuarioEJB;
    private TblRolFacadeLocal rolEJB;
    private TblPersona persona;
    private TblUsuario usuario;
    private TblRol rol;
    
    
    @PostConstruct
    public void init(){
        usuario = new TblUsuario();
        persona = new TblPersona();
    }

    public TblPersona getPersona() {
        return persona;
    }

    public void setPersona(TblPersona persona) {
        this.persona = persona;
    }

    public TblUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(TblUsuario usuario) {
        this.usuario = usuario;
    }

    public TblRol getRol() {
        return rol;
    }

    public void setRol(TblRol rol) {
        this.rol = rol;
    }
    
    
    
    public void registrar(){
        try{
            personaEJB.create(persona);
            usuarioEJB.create(usuario);
            rolEJB.create(rol);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "", "Se ha registrado correctamente"));
        }catch(Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "", "Se ha registrado correctamente"));
        }
    }
    
    
}   

