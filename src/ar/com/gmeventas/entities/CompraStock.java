/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.gmeventas.entities;

import java.util.Date;

/**
 *
 * @author Mario
 */
public class CompraStock implements Comparable<CompraStock> {
    private Long id;
    private Date fecha;
    private Integer codigo;
    private String detalle;
    private Float cantidad;

    public CompraStock() {
    }

    public CompraStock(Long id, Integer codigo, String detalle, String comprobante, Date fecha, Float cantidad) {
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Float getCantidad() {
        return cantidad;
    }

    public void setCantidad(Float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(CompraStock o) {
        String a = this.getDetalle();
        String b = o.getDetalle();
        return a.compareTo(b);
    }

}