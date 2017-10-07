/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author info2017
 */
@Entity
@Table(name = "caja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c"),
    @NamedQuery(name = "Caja.findByIdCaja", query = "SELECT c FROM Caja c WHERE c.idCaja = :idCaja"),
    @NamedQuery(name = "Caja.findByFechahoraApertura", query = "SELECT c FROM Caja c WHERE c.fechahoraApertura = :fechahoraApertura"),
    @NamedQuery(name = "Caja.findByFechahoraCierre", query = "SELECT c FROM Caja c WHERE c.fechahoraCierre = :fechahoraCierre"),
    @NamedQuery(name = "Caja.findByAperturadinero", query = "SELECT c FROM Caja c WHERE c.aperturadinero = :aperturadinero"),
    @NamedQuery(name = "Caja.findByCierradinero", query = "SELECT c FROM Caja c WHERE c.cierradinero = :cierradinero"),
    @NamedQuery(name = "Caja.findByEstado", query = "SELECT c FROM Caja c WHERE c.estado = :estado"),
    @NamedQuery(name = "Caja.findByDescripcion", query = "SELECT c FROM Caja c WHERE c.descripcion = :descripcion")})
public class Caja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caja")
    private Long idCaja;
    @Column(name = "fechahora_apertura")
    @Temporal(TemporalType.DATE)
    private Date fechahoraApertura;
    @Column(name = "fechahora_cierre")
    @Temporal(TemporalType.DATE)
    private Date fechahoraCierre;
    @Column(name = "aperturadinero")
    private BigInteger aperturadinero;
    @Column(name = "cierradinero")
    private BigInteger cierradinero;
    @Size(max = 2147483647)
    @Column(name = "estado")
    private String estado;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idCaja")
    private Collection<Venta> ventaCollection;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne
    private Empleado idEmpleado;

    public Caja() {
    }

    public Caja(Long idCaja) {
        this.idCaja = idCaja;
    }

    public Long getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Long idCaja) {
        this.idCaja = idCaja;
    }

    public Date getFechahoraApertura() {
        return fechahoraApertura;
    }

    public void setFechahoraApertura(Date fechahoraApertura) {
        this.fechahoraApertura = fechahoraApertura;
    }

    public Date getFechahoraCierre() {
        return fechahoraCierre;
    }

    public void setFechahoraCierre(Date fechahoraCierre) {
        this.fechahoraCierre = fechahoraCierre;
    }

    public BigInteger getAperturadinero() {
        return aperturadinero;
    }

    public void setAperturadinero(BigInteger aperturadinero) {
        this.aperturadinero = aperturadinero;
    }

    public BigInteger getCierradinero() {
        return cierradinero;
    }

    public void setCierradinero(BigInteger cierradinero) {
        this.cierradinero = cierradinero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaja != null ? idCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.idCaja == null && other.idCaja != null) || (this.idCaja != null && !this.idCaja.equals(other.idCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ventas.entity.Caja[ idCaja=" + idCaja + " ]";
    }
    
}
