package com.ramos.spring_ecommerce.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ramos.spring_ecommerce.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer>{
    
}
