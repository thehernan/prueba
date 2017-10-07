/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author info2017
 */
@Entity
@Table(name = "detalle_venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleVenta.findAll", query = "SELECT d FROM DetalleVenta d"),
    @NamedQuery(name = "DetalleVenta.findByIdDetalleventa", query = "SELECT d FROM DetalleVenta d WHERE d.idDetalleventa = :idDetalleventa"),
    @NamedQuery(name = "DetalleVenta.findByIdProducto", query = "SELECT d FROM DetalleVenta d WHERE d.idProducto = :idProducto"),
    @NamedQuery(name = "DetalleVenta.findByPrecio", query = "SELECT d FROM DetalleVenta d WHERE d.precio = :precio"),
    @NamedQuery(name = "DetalleVenta.findByCantidad", query = "SELECT d FROM DetalleVenta d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetalleVenta.findByIdVenta", query = "SELECT d FROM DetalleVenta d WHERE d.idVenta = :idVenta")})
public class DetalleVenta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalleventa")
    private Long idDetalleventa;
    @Column(name = "id_producto")
    private BigInteger idProducto;
    @Column(name = "precio")
    private BigInteger precio;
    @Column(name = "cantidad")
    private BigInteger cantidad;
    @Column(name = "id_venta")
    private BigInteger idVenta;

    public DetalleVenta() {
    }

    public DetalleVenta(Long idDetalleventa) {
        this.idDetalleventa = idDetalleventa;
    }

    public Long getIdDetalleventa() {
        return idDetalleventa;
    }

    public void setIdDetalleventa(Long idDetalleventa) {
        this.idDetalleventa = idDetalleventa;
    }

    public BigInteger getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigInteger idProducto) {
        this.idProducto = idProducto;
    }

    public BigInteger getPrecio() {
        return precio;
    }

    public void setPrecio(BigInteger precio) {
        this.precio = precio;
    }

    public BigInteger getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }

    public BigInteger getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(BigInteger idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleventa != null ? idDetalleventa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.idDetalleventa == null && other.idDetalleventa != null) || (this.idDetalleventa != null && !this.idDetalleventa.equals(other.idDetalleventa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ventas.entity.DetalleVenta[ idDetalleventa=" + idDetalleventa + " ]";
    }
    
}
