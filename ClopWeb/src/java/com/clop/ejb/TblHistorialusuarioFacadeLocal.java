/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblHistorialusuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblHistorialusuarioFacadeLocal {

    void create(TblHistorialusuario tblHistorialusuario);

    void edit(TblHistorialusuario tblHistorialusuario);

    void remove(TblHistorialusuario tblHistorialusuario);

    TblHistorialusuario find(Object id);

    List<TblHistorialusuario> findAll();

    List<TblHistorialusuario> findRange(int[] range);

    int count();
    
}
