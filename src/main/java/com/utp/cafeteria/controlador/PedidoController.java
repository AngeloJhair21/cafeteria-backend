package com.utp.cafeteria.controlador;

import com.utp.cafeteria.entidad.Pedido;
import com.utp.cafeteria.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido registrar(@RequestBody Pedido pedido) {
        return pedidoService.registrarPedido(pedido);
    }
}