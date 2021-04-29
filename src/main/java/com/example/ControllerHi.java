package com.example;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControllerHi implements MouseListener {

    private final ModelHi model;
    private final ViewHi view;

    public ControllerHi(ModelHi model, ViewHi view) {
        this.model = model;
        this.view = view;
    }

    public void initController() {
        view.getSayHiBtn().addMouseListener(this);
    }


    public void mouseClicked(MouseEvent e) {
        model.setName(view.getUserInputTextField().getText());
        view.getHelloNameLabel().setText("Hello " + model.getName());
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
