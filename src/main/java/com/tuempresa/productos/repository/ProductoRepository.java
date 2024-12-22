package com.tuempresa.productos.repository;

import com.tuempresa.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
