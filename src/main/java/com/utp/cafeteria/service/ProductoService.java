package com.utp.cafeteria.service;

import com.utp.cafeteria.entidad.Producto;
import com.utp.cafeteria.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    public Optional<Producto> obtenerPorId(Long id) {
        return productoRepository.findById(id);
    }

    public Producto save(Producto producto) {
        // Asegúrate de usar el nombre correcto de tu repositorio (aquí uso productoRepository como ejemplo)
        return productoRepository.save(producto);
    }
}