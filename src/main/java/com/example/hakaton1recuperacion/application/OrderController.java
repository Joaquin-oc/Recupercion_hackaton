package com.example.hakaton1recuperacion.application;

import com.example.hakaton1recuperacion.domain.OrderCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    private final ApplicationEventPublisher publisher;

    public OrderController(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @PostMapping
    public ResponseEntity<String> crearPedido(@RequestBody OrderCreatedEvent orden) {
        logger.info("📥 Recibido nuevo pedido: {}", orden.getOrderId());


        publisher.publishEvent(orden);
        logger.info("📤 Evento OrderCreatedEvent publicado");

        return ResponseEntity.ok("Pedido procesado exitosamente.");
    }
}