package com.github.onacit.structural.adapter.object_;

import lombok.Getter;

import static org.slf4j.LoggerFactory.getLogger;

public class Adapter implements Target {

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void Request() {
        getLogger(getClass()).debug("invoking adaptee#SpecificRequest()");
        adaptee.SpecificRequest();
    }

    private final Adaptee adaptee;
}
