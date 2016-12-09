/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblCarrotanques;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblCarrotanquesFacadeLocal {

    void create(TblCarrotanques tblCarrotanques);

    void edit(TblCarrotanques tblCarrotanques);

    void remove(TblCarrotanques tblCarrotanques);

    TblCarrotanques find(Object id);

    List<TblCarrotanques> findAll();

    List<TblCarrotanques> findRange(int[] range);

    int count();
    
}
