package org.terceira.academiadecodigo.bootcamp.mapEditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Grid {

    private int col;
    private int row;
    public static final int PADDING = 10;
    public static final int CELL_SIZE = 25;
    private Rectangle background;
    private Cell[][] cells;

    public Grid(int col, int row) {
        background = new Rectangle(PADDING, PADDING, getWidth(), getHeight());
        cells = new Cell[col][row];
        this.col = col;
        this.row = row;

        for (int i = 0; i < col; i++) {

            for (int j = 0; j < row; j++) {
                cells[i][j] = new Cell(i,j);
                cells[i][j].setCellRect(new Rectangle(i * CELL_SIZE + PADDING, j * CELL_SIZE + PADDING, CELL_SIZE, CELL_SIZE));


            }

        }

    }

    public void init(){

        background.setColor(Color.BLACK);
        background.draw();

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getCELL_SIZE() {
        return CELL_SIZE;
    }

    public int getWidth(){
        return col * getCELL_SIZE();
    }

    public int getHeight(){
        return row * getCELL_SIZE();
    }

    public int rowToY(int rowes) {
        return (rowes * CELL_SIZE) + PADDING;
    }

    public int columnToX(int column) {
        return (column * CELL_SIZE) + PADDING;
    }

    public Cell[][] getCells() {
        return cells;
    }
}
