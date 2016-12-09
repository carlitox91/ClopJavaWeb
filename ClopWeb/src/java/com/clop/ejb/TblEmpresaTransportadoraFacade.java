/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblEmpresaTransportadora;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Asus
 */
@Stateless
public class TblEmpresaTransportadoraFacade extends AbstractFacade<TblEmpresaTransportadora> implements TblEmpresaTransportadoraFacadeLocal {

    @PersistenceContext(unitName = "ClopWebPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblEmpresaTransportadoraFacade() {
        super(TblEmpresaTransportadora.class);
    }
    
}
