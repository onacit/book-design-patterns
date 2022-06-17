package com.github.onacit.structural.bridge.case1;


abstract class Window {

    void drawText() {
        imp.devDrawText();
    }

    void drawRect() {
        imp.devDrawLine();
    }

    WindowImpl imp;
}
