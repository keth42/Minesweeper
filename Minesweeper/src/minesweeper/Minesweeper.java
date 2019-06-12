package minesweeper;

import DLibX.DConsole;
import java.awt.Color;
import java.util.Random;

public class Minesweeper {

    public static void main(String[] args) {

        DConsole dc = new DConsole();

        dc.setOrigin(DConsole.ORIGIN_CENTER);

        Random rand = new Random();

        Cell[][] grid = new Cell[5][5];
        int nums[][] = new int[5][5];
        
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j] = rand.nextInt(3);
            }
        }

        //creation of grid
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (nums[i][j] == 0) {
                    grid[i][j] = new Bomb((i * 25) + 10, (j * 25) + 50, dc);
                }else if (nums[i][j] == 1) {
                    grid[i][j] = new Blank((i * 25) + 10, (j * 25) + 50, dc);
                }else { 
                    grid[i][j] = new Number((i * 25) + 10, (j * 25) + 50, dc);
                }
            }
        }

        while (true) {

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    grid[i][j].draw();
                }
            }

            dc.redraw();
        }
    }

}
