package com.example.douckopgr;

import javafx.scene.paint.Color;

public class MojeBarvy {
    private String name;
    private Color barva;

    public MojeBarvy(String name, Color barva) {
        this.name = name;
        this.barva = barva;
    }

    public String getName() {
        return name;
    }

    public Color getBarva() {
        return barva;
    }
}
