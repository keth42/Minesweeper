package minesweeper;

import DLibX.DConsole;
import java.awt.Color;

public class Cell {
    
    protected int x;
    protected int y;
    protected DConsole dc;
    protected boolean covered;
    protected Color col;
    
    public Cell(int x, int y, DConsole dc) {
        this.x = x;
        this.y = y;
        this.dc = dc;
        this.covered = true;
        this.col = new Color(128, 128, 128);
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void draw() {
        dc.setPaint(this.col);
        dc.fillRect(x, y, 20, 20);
    }
    
    public void setColor(int r, int g, int b) {
        this.col = new Color(r, g, b);
    }
    
    public boolean isCovered() {
        return this.covered;
    }
    
    public boolean isClicked() {
        int mouseX = dc.getMouseXPosition();
        int mouseY = dc.getMouseYPosition();
        if(mouseX >= this.x - 10 && mouseX <= this.x + 10 && mouseY >= this.y - 10 && mouseY <= this.y + 10 && dc.getMouseButton(1)) {
            return true;
        }else {
            return false;
        }
            
    }
    
    
    
}
