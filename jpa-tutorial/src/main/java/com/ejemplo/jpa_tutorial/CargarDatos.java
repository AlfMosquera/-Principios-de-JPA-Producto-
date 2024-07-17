package com.ejemplo.jpa_tutorial;

import com.ejemplo.jpa_tutorial.model.Producto;
import com.ejemplo.jpa_tutorial.repository.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CargarDatos {

    @Bean
    CommandLineRunner initDatabase(ProductoRepository repository) {
        return args -> {
            repository.save(new Producto(1101l,"Laptop", "Laptop de alta gama", 1500.00));
            repository.save(new Producto(1102l, "Smartphone", "Smartphone con cámara de 48MP", 700.00));
            repository.save(new Producto(1103l, "Monitor", "Monitor 4K de 27 pulgadas", 300.00));
            repository.save(new Producto(1104l,"Teclado", "Teclado mecánico retroiluminado", 100.00));
            repository.save(new Producto(1105l, "Mouse", "Mouse inalámbrico ergonómico", 50.00));
        };
    }
}