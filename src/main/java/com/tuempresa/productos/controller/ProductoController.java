package com.tuempresa.productos.controller;

import com.tuempresa.productos.model.Producto;
import com.tuempresa.productos.service.ProductoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @PostMapping
    public Producto create(@Valid @RequestBody Producto producto) {
        return service.save(producto);
    }

    @GetMapping
    public List<Producto> list() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> getById(@PathVariable Long id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> update(@PathVariable Long id, @Valid @RequestBody Producto producto) {
        return service.findById(id)
                .map(existing -> {
                    producto.setId(id);
                    return ResponseEntity.ok(service.save(producto));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
