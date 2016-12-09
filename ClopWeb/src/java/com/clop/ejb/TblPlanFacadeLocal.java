/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clop.ejb;

import com.clop.model.TblPlan;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Asus
 */
@Local
public interface TblPlanFacadeLocal {

    void create(TblPlan tblPlan);

    void edit(TblPlan tblPlan);

    void remove(TblPlan tblPlan);

    TblPlan find(Object id);

    List<TblPlan> findAll();

    List<TblPlan> findRange(int[] range);

    int count();
    
}
