/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblProducto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblProductoFacadeLocal {

    void create(TblProducto tblProducto);

    void edit(TblProducto tblProducto);

    void remove(TblProducto tblProducto);

    TblProducto find(Object id);

    List<TblProducto> findAll();

    List<TblProducto> findRange(int[] range);

    int count();
    
}
