/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Asus
 */
@Stateless
public class TblUsuarioFacade extends AbstractFacade<TblUsuario> implements TblUsuarioFacadeLocal {

    @PersistenceContext(unitName = "ClopWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblUsuarioFacade() {
        super(TblUsuario.class);
    }
    
}
