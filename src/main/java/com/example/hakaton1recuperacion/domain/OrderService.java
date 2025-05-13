package com.example.hakaton1recuperacion.domain;


import org.slf4j.Logger;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public void creaEvento(OrderDTO orden, Logger logger, ApplicationEventPublisher publisher) {
        logger.info("Recibido nuevo pedido: {}", orden.getOrderId());


        OrderCreatedEvent evento = new OrderCreatedEvent(
                this,
                orden.getOrderId(),
                orden.getEmail(),
                orden.getProducts()
        );

        publisher.publishEvent(evento);
        logger.info("Evento OrderCreatedEvent publicado");

    }
}
