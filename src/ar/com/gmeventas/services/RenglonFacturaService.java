/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gmeventas.services;

import ar.com.gmeventas.bo.RenglonFacturaBO;
import ar.com.gmeventas.entities.IvaVentas;
import ar.com.gmeventas.entities.RenglonFactura;
import ar.com.gmeventas.util.HibernateUtils;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Mario
 */
public class RenglonFacturaService {
    
    
    public void saveRenglon(RenglonFactura renglon) throws Exception {
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            RenglonFacturaBO bo = new RenglonFacturaBO();
            bo.saveRenglon(renglon);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception (ex);
        }
    }
    
    public List<RenglonFactura> getAllRenglonFacturaFromIvaVentas(IvaVentas idIvaVentas) throws Exception {
        List<RenglonFactura> renglonFactura = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            renglonFactura = new RenglonFacturaBO().getAllRenglonFacturaFromIvaVentas(idIvaVentas);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return renglonFactura;
    }
    
    public List<RenglonFactura> getRenglonesActivosEntreFechas(Date d1, Date d2) throws Exception {
        List<RenglonFactura> renglones = null;
        Session session = HibernateUtils.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            renglones = new RenglonFacturaBO().getRenglonesActivosEntreFechas(d1, d2);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception (ex);
        }
        return renglones;
    }
}
