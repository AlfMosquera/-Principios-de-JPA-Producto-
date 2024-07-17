package com.ejemplo.jpa_tutorial.controller;

import com.ejemplo.jpa_tutorial.model.Producto;
import com.ejemplo.jpa_tutorial.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto getProductoById(@PathVariable Long id) {
        return productoService.findById(id);
    }

    @GetMapping("/search")
    public List<Producto> getProductoByNombre(@RequestParam String nombre) {
        return productoService.findByNombre(nombre);
    }

    @GetMapping("/searchByPrecio")
    public List<Producto> getProductosByPrecioBetween(@RequestParam Double preciomin, @RequestParam Double preciomax) {
        return productoService.findByPrecioBetween(preciomin, preciomax);
    }
}