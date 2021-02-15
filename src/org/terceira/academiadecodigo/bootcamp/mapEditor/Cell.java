package org.terceira.academiadecodigo.bootcamp.mapEditor;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

    private int col;
    private int row;
    private Rectangle cellRect;

    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        this.cellRect = new Rectangle(col* Grid.CELL_SIZE + Grid.PADDING, row*Grid.CELL_SIZE + Grid.PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
        //this.cellRect = new Rectangle(Grid.PADDING + col * Grid.CELL_SIZE, Grid.PADDING + row * Grid.CELL_SIZE, Grid.CELL_SIZE, Grid.CELL_SIZE);
        this.cellRect.setColor(Color.BLUE);
        this.cellRect.draw();

    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public void fill(){
        cellRect.fill();
    }

    public void draw (){
        cellRect.draw();
    }

    public void setCellRect(Rectangle cellRect) {
        this.cellRect = cellRect;
    }


}
