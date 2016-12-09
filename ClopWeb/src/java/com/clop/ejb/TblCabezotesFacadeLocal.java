/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblCabezotes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblCabezotesFacadeLocal {

    void create(TblCabezotes tblCabezotes);

    void edit(TblCabezotes tblCabezotes);

    void remove(TblCabezotes tblCabezotes);

    TblCabezotes find(Object id);

    List<TblCabezotes> findAll();

    List<TblCabezotes> findRange(int[] range);

    int count();
    
}
