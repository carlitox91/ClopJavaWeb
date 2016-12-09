/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblConductores;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblConductoresFacadeLocal {

    void create(TblConductores tblConductores);

    void edit(TblConductores tblConductores);

    void remove(TblConductores tblConductores);

    TblConductores find(Object id);

    List<TblConductores> findAll();

    List<TblConductores> findRange(int[] range);

    int count();
    
}
