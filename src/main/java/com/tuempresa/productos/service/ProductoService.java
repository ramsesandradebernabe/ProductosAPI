package com.tuempresa.productos.service;

import com.tuempresa.productos.model.Producto;
import com.tuempresa.productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository repository;

    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    public List<Producto> findAll() {
        return repository.findAll();
    }

    public Optional<Producto> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
