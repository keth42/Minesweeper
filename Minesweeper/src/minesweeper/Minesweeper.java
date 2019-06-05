package minesweeper;

import DLibX.DConsole;

public class Minesweeper {

    public static void main(String[] args) {
        
        DConsole dc = new DConsole();
        
        
        Cell[][] grid = new Cell[35][25];
        
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                grid[i][j] = new Cell((i * 25) + 10, (j * 25) + 50, dc);
                grid[i][j].draw();
            }
        }
        
        dc.redraw();
        
    }
    
}
