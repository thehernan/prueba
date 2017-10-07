/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.entity;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author info2017
 */
@Entity
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByIdUsuario", query = "SELECT u FROM Usuarios u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuarios.findByUsuario", query = "SELECT u FROM Usuarios u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuarios.findByClave", query = "SELECT u FROM Usuarios u WHERE u.clave = :clave"),
    @NamedQuery(name = "Usuarios.findByVenta", query = "SELECT u FROM Usuarios u WHERE u.venta = :venta"),
    @NamedQuery(name = "Usuarios.findByCompra", query = "SELECT u FROM Usuarios u WHERE u.compra = :compra"),
    @NamedQuery(name = "Usuarios.findByProveedor", query = "SELECT u FROM Usuarios u WHERE u.proveedor = :proveedor"),
    @NamedQuery(name = "Usuarios.findByAsistencia", query = "SELECT u FROM Usuarios u WHERE u.asistencia = :asistencia"),
    @NamedQuery(name = "Usuarios.findByReparacion", query = "SELECT u FROM Usuarios u WHERE u.reparacion = :reparacion"),
    @NamedQuery(name = "Usuarios.findByCliente", query = "SELECT u FROM Usuarios u WHERE u.cliente = :cliente"),
    @NamedQuery(name = "Usuarios.findByProducto", query = "SELECT u FROM Usuarios u WHERE u.producto = :producto"),
    @NamedQuery(name = "Usuarios.findByPersonal", query = "SELECT u FROM Usuarios u WHERE u.personal = :personal"),
    @NamedQuery(name = "Usuarios.findByCaja", query = "SELECT u FROM Usuarios u WHERE u.caja = :caja")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Long idUsuario;
    @Size(max = 2147483647)
    @Column(name = "usuario")
    private String usuario;
    @Size(max = 2147483647)
    @Column(name = "clave")
    private String clave;
    @Size(max = 2147483647)
    @Column(name = "venta")
    private String venta;
    @Size(max = 2147483647)
    @Column(name = "compra")
    private String compra;
    @Size(max = 2147483647)
    @Column(name = "proveedor")
    private String proveedor;
    @Size(max = 2147483647)
    @Column(name = "asistencia")
    private String asistencia;
    @Size(max = 2147483647)
    @Column(name = "reparacion")
    private String reparacion;
    @Size(max = 2147483647)
    @Column(name = "cliente")
    private String cliente;
    @Size(max = 2147483647)
    @Column(name = "producto")
    private String producto;
    @Size(max = 2147483647)
    @Column(name = "personal")
    private String personal;
    @Size(max = 2147483647)
    @Column(name = "caja")
    private String caja;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne
    private Empleado idEmpleado;

    public Usuarios() {
    }

    public Usuarios(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public String getCompra() {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getReparacion() {
        return reparacion;
    }

    public void setReparacion(String reparacion) {
        this.reparacion = reparacion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
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
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ventas.entity.Usuarios[ idUsuario=" + idUsuario + " ]";
    }
    
}
