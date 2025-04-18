package com.ramos.spring_ecommerce.services;

import java.util.Optional;

import com.ramos.spring_ecommerce.models.Producto;

public interface ProductoService {
    
    public Producto save(Producto producto);

    public Optional<Producto> get(Integer id);

    public void update(Producto producto);

    public void delete(Integer id);
}
