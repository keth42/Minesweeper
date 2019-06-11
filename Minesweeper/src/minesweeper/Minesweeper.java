package minesweeper;

import DLibX.DConsole;
import java.awt.Color;

public class Minesweeper {

    public static void main(String[] args) {

        DConsole dc = new DConsole();
        
        dc.setOrigin(DConsole.ORIGIN_CENTER);

        Cell[][] grid = new Cell[5][5];

        while (true) {

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    grid[i][j] = new Cell((i * 25) + 10, (j * 25) + 50, dc);
                    grid[i][j].draw();
                    if(grid[i][j].isClicked()) {
                        grid[i][j].setColor(255, 0, 128);
                    }
                }
            }

            dc.redraw();
        }
    }

}
