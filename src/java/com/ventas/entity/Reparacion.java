/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author info2017
 */
@Entity
@Table(name = "reparacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reparacion.findAll", query = "SELECT r FROM Reparacion r"),
    @NamedQuery(name = "Reparacion.findByIdReparacion", query = "SELECT r FROM Reparacion r WHERE r.idReparacion = :idReparacion"),
    @NamedQuery(name = "Reparacion.findByAtendido", query = "SELECT r FROM Reparacion r WHERE r.atendido = :atendido"),
    @NamedQuery(name = "Reparacion.findByMarca", query = "SELECT r FROM Reparacion r WHERE r.marca = :marca"),
    @NamedQuery(name = "Reparacion.findByModelo", query = "SELECT r FROM Reparacion r WHERE r.modelo = :modelo"),
    @NamedQuery(name = "Reparacion.findByFallas", query = "SELECT r FROM Reparacion r WHERE r.fallas = :fallas"),
    @NamedQuery(name = "Reparacion.findByCausas", query = "SELECT r FROM Reparacion r WHERE r.causas = :causas"),
    @NamedQuery(name = "Reparacion.findByObservacion", query = "SELECT r FROM Reparacion r WHERE r.observacion = :observacion"),
    @NamedQuery(name = "Reparacion.findByDiagnostico", query = "SELECT r FROM Reparacion r WHERE r.diagnostico = :diagnostico"),
    @NamedQuery(name = "Reparacion.findByFechaRecepcion", query = "SELECT r FROM Reparacion r WHERE r.fechaRecepcion = :fechaRecepcion"),
    @NamedQuery(name = "Reparacion.findByFechaAprobacion", query = "SELECT r FROM Reparacion r WHERE r.fechaAprobacion = :fechaAprobacion"),
    @NamedQuery(name = "Reparacion.findByFechaEntrega", query = "SELECT r FROM Reparacion r WHERE r.fechaEntrega = :fechaEntrega"),
    @NamedQuery(name = "Reparacion.findByEstado", query = "SELECT r FROM Reparacion r WHERE r.estado = :estado")})
public class Reparacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reparacion")
    private Long idReparacion;
    @Size(max = 2147483647)
    @Column(name = "atendido")
    private String atendido;
    @Size(max = 2147483647)
    @Column(name = "marca")
    private String marca;
    @Size(max = 2147483647)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 2147483647)
    @Column(name = "fallas")
    private String fallas;
    @Size(max = 2147483647)
    @Column(name = "causas")
    private String causas;
    @Size(max = 2147483647)
    @Column(name = "observacion")
    private String observacion;
    @Size(max = 2147483647)
    @Column(name = "diagnostico")
    private String diagnostico;
    @Column(name = "fecha_recepcion")
    @Temporal(TemporalType.DATE)
    private Date fechaRecepcion;
    @Column(name = "fecha_aprobacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAprobacion;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @Size(max = 2147483647)
    @Column(name = "estado")
    private String estado;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne
    private Cliente idCliente;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne
    private Empleado idEmpleado;

    public Reparacion() {
    }

    public Reparacion(Long idReparacion) {
        this.idReparacion = idReparacion;
    }

    public Long getIdReparacion() {
        return idReparacion;
    }

    public void setIdReparacion(Long idReparacion) {
        this.idReparacion = idReparacion;
    }

    public String getAtendido() {
        return atendido;
    }

    public void setAtendido(String atendido) {
        this.atendido = atendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFallas() {
        return fallas;
    }

    public void setFallas(String fallas) {
        this.fallas = fallas;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
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
        hash += (idReparacion != null ? idReparacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reparacion)) {
            return false;
        }
        Reparacion other = (Reparacion) object;
        if ((this.idReparacion == null && other.idReparacion != null) || (this.idReparacion != null && !this.idReparacion.equals(other.idReparacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ventas.entity.Reparacion[ idReparacion=" + idReparacion + " ]";
    }
    
}
