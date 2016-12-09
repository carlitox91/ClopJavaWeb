/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblRuta;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblRutaFacadeLocal {

    void create(TblRuta tblRuta);

    void edit(TblRuta tblRuta);

    void remove(TblRuta tblRuta);

    TblRuta find(Object id);

    List<TblRuta> findAll();

    List<TblRuta> findRange(int[] range);

    int count();
    
}
