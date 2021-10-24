package com.formacionbdi.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.app.productos.models.entity.Producto;

public interface ProductoDAO extends CrudRepository<Producto, Long>{
	
}
