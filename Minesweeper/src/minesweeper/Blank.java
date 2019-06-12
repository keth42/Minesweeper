package minesweeper;

import DLibX.DConsole;
import java.awt.Color;

public class Blank extends Cell {
    
    public Blank(int x, int y, DConsole dc) {
        super(x, y, dc);
    }
    
    @Override
    public void draw() {
        if(!covered) {
            dc.setPaint(new Color(200, 200, 200));
            dc.fillRect(x, y, 20, 20);            
        }
    }
    
}
