/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblTanque;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblTanqueFacadeLocal {

    void create(TblTanque tblTanque);

    void edit(TblTanque tblTanque);

    void remove(TblTanque tblTanque);

    TblTanque find(Object id);

    List<TblTanque> findAll();

    List<TblTanque> findRange(int[] range);

    int count();
    
}
