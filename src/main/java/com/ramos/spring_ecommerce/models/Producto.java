package com.ramos.spring_ecommerce.models;

public class Producto {
    private Integer id;
    private String nombre;
    private String description;
    private String iamge;
    private double precio;
    private int cantidad;

    
    public Producto() {
    }

    public Producto(Integer id, String nombre, String description, String iamge, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.iamge = iamge;
        this.precio = precio;
        this.cantidad = cantidad;
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

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", description=" + description + ", iamge=" + iamge
                + ", precio=" + precio + ", cantidad=" + cantidad + "]";
    }

}
