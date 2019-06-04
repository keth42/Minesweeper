package minesweeper;

import DLibX.DConsole;
import java.awt.Color;

public class Cell {
    
    protected int x;
    protected int y;
    protected DConsole dc;
    
    public Cell(int x, int y, DConsole dc) {
        this.x = x;
        this.y = y;
        this.dc = dc;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void draw() {
        dc.setPaint(new Color(128, 128, 128));
        dc.fillRect(x, y, 20, 20);
    }
    
}
