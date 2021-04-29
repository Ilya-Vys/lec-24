package com.example;

public class Test {
    public static void main(String[] args) {
        ViewHi view = new ViewHi();
        ModelHi model = new ModelHi();
        ControllerHi controller = new ControllerHi(model, view);
        controller.initController();
    }
}
