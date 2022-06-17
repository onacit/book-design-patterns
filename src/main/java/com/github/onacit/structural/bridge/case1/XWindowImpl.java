package com.github.onacit.structural.bridge.case1;

interface XWindowImpl extends WindowImpl {

    @Override
    default void devDrawText() {
        xDrawString();
    }

    @Override
    default void devDrawLine() {
        xDrawLine();
    }

    abstract void xDrawString();

    abstract void xDrawLine();
}
