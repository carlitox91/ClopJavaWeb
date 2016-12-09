/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblProgramacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblProgramacionFacadeLocal {

    void create(TblProgramacion tblProgramacion);

    void edit(TblProgramacion tblProgramacion);

    void remove(TblProgramacion tblProgramacion);

    TblProgramacion find(Object id);

    List<TblProgramacion> findAll();

    List<TblProgramacion> findRange(int[] range);

    int count();
    
}
