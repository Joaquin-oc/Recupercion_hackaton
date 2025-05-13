package com.example.hakaton1recuperacion.application;

import com.example.hakaton1recuperacion.domain.OrderDTO;
import com.example.hakaton1recuperacion.domain.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    private final ApplicationEventPublisher publisher;

    @Autowired
    private OrderService orderService;

    public OrderController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping
    public ResponseEntity<String> crearPedido(@RequestBody OrderDTO orden) {
        orderService.creaEvento(orden, logger, publisher);

        return ResponseEntity.ok("Pedido procesado exitosamente.");
    }
}