package com.example.hakaton1recuperacion.domain;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class AuditLogListener {

    private static final Logger logger = LoggerFactory.getLogger(AuditLogListener.class);

    @Async
    @EventListener
    public void registrarEnAuditoria(OrderCreatedEvent evento) {
        logger.info("Registrando en log de auditoría - Pedido ID: {}, Email: {}, Productos: {}",
                evento.getOrderId(), evento.getEmail(), evento.getProducts());
    }
}