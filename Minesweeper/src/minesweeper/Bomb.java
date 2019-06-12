package minesweeper;

import DLibX.DConsole;
import java.awt.Color;

public class Bomb extends Cell {

    public Bomb(int x, int y, DConsole dc) {
        super(x, y, dc);
    }

    @Override
    public void draw() {
        if (!covered) {
            dc.setPaint(new Color(100, 100, 100));
            dc.fillRect(x, y, 20, 20);
            dc.setPaint(Color.black);
            dc.fillEllipse(x, y, 10, 10);
        }
    }

}
