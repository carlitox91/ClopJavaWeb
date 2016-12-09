/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblServicio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblServicioFacadeLocal {

    void create(TblServicio tblServicio);

    void edit(TblServicio tblServicio);

    void remove(TblServicio tblServicio);

    TblServicio find(Object id);

    List<TblServicio> findAll();

    List<TblServicio> findRange(int[] range);

    int count();
    
}
