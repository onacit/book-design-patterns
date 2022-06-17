package com.github.onacit.structural.adapter.class_;

import static org.slf4j.LoggerFactory.getLogger;

interface Adaptee {

    default void specificRequest() {
        getLogger(getClass()).debug("SpecificRequest()");
    }
}
