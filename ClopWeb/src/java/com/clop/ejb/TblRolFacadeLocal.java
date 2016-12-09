/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblRol;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblRolFacadeLocal {

    void create(TblRol tblRol);

    void edit(TblRol tblRol);

    void remove(TblRol tblRol);

    TblRol find(Object id);

    List<TblRol> findAll();

    List<TblRol> findRange(int[] range);

    int count();
    
}
