package com.ramos.spring_ecommerce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String description;
    private String iamge;
    private double precio;
    private int cantidad;

    @ManyToOne
    private Usuario usuario;
    
    public Producto() {
    }

    public Producto(Integer id, String nombre, String description, String iamge, double precio, int cantidad, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.iamge = iamge;
        this.precio = precio;
        this.cantidad = cantidad;
        this.usuario = usuario;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getIamge() {
        return iamge;
    }
    public void setIamge(String iamge) {
        this.iamge = iamge;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", description=" + description + ", iamge=" + iamge
                + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }


}
