/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblPersona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblPersonaFacadeLocal {

    void create(TblPersona tblPersona);

    void edit(TblPersona tblPersona);

    void remove(TblPersona tblPersona);

    TblPersona find(Object id);

    List<TblPersona> findAll();

    List<TblPersona> findRange(int[] range);

    int count();
    
}
