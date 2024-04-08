/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.gmeventas.entities;

/**
 *
 * @author Mar y Mar Informatica
 */
public class RenglonFcStock implements Comparable<RenglonFcStock> {
    private Long id;
    private Integer codigo;
    private String detalle;
    private Float cantidad;
    private IvaVentas ivaVentas;

    public RenglonFcStock() {
    }

    public RenglonFcStock(Long id, Integer codigo, String detalle, Float cantidad, IvaVentas ivaVentas) {
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.ivaVentas = ivaVentas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    public IvaVentas getIvaVentas() {
        return ivaVentas;
    }

    public void setIvaVentas(IvaVentas ivaVentas) {
        this.ivaVentas = ivaVentas;
    }

    @Override
    public int compareTo(RenglonFcStock o) {
        String a = this.getDetalle();
        String b = o.getDetalle();
        return a.compareTo(b);
    }
}