package com.dinethshang.persistenc.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

public class BeanB {
    private static Logger log = LoggerFactory.getLogger(BeanB.class);
    public void initialize() {
        log.info("Custom initializer is called.");
    }

    @PostConstruct
    public void postConstruct() {
        log.info("@PostConstruct method is called.");
    }


}
