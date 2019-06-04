package minesweeper;

import DLibX.DConsole;

public class Minesweeper {

    public static void main(String[] args) {
        
        DConsole dc = new DConsole();
        
        
        Cell c = new Cell(450, 300, dc);
        
        c.draw();
        
        dc.redraw();
        
    }
    
}
