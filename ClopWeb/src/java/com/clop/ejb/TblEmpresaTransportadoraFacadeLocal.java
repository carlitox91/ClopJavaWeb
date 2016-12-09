/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblEmpresaTransportadora;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblEmpresaTransportadoraFacadeLocal {

    void create(TblEmpresaTransportadora tblEmpresaTransportadora);

    void edit(TblEmpresaTransportadora tblEmpresaTransportadora);

    void remove(TblEmpresaTransportadora tblEmpresaTransportadora);

    TblEmpresaTransportadora find(Object id);

    List<TblEmpresaTransportadora> findAll();

    List<TblEmpresaTransportadora> findRange(int[] range);

    int count();
    
}
