/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author info2017
 */
@Stateless
public class CajaFacade extends AbstractFacade<Caja> {
    @PersistenceContext(unitName = "webpruebaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CajaFacade() {
        super(Caja.class);
    }
    
}
