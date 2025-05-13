package com.example.hakaton1recuperacion.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailNoticationListener {

    private static final Logger logger = LoggerFactory.getLogger(EmailNoticationListener.class);

    @EventListener
    public void handleOrderCreatedEvent(OrderCreatedEvent event) {
        logger.info("Enviando correo a " + event.getEmail() +
                " con orden " + event.getOrderId() +
                " del producto: " + event.getProducts());
    }
}
