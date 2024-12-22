package com.tuempresa.productos.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String nombre;

    private String descripcion;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private Double precio;

    @CreationTimestamp
    private LocalDateTime fechaCreacion;

    // Getters y setters

    public void setId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
