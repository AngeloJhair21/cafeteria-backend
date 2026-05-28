package com.utp.cafeteria.service;

import com.utp.cafeteria.entidad.Pedido;
import com.utp.cafeteria.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido registrarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
