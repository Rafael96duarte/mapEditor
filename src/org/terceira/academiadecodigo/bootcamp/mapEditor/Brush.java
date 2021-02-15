package org.terceira.academiadecodigo.bootcamp.mapEditor;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;

public class Brush {
    private int posCol;
    private int posRow;
    private final int PADDING = 10;
    private Rectangle brush;
    private final int CELL_SIZE = 25;
    private Grid grid;
    private Cell brushPos;

    public Brush(Grid grid) {
        posCol = 1;
        posRow = 1;
        this.grid = grid;
        brush = new Rectangle(posCol * Grid.CELL_SIZE + PADDING, posRow * Grid.CELL_SIZE + PADDING, Grid.CELL_SIZE, Grid.CELL_SIZE);
        brushPos = new Cell(getPosCol(),getPosRow());
    }

    public void init() {

        brush.setColor(Color.BLUE);
        brush.fill();
    }

    public void move(int moveCol, int moveRow){

            brush.translate(moveCol,moveRow);
    }

    public void moveRight(int distance){

        brushPos.setCol(brushPos.getCol() + 1);
        brush.translate(distance, 0);
    }

    public void moveLeft(int distance){

        brushPos.setCol(brushPos.getCol() - 1);
        brush.translate(-distance, 0);
    }

    public void moveUp(int distance) {

        brushPos.setRow(brushPos.getRow() - 1);
        brush.translate(0, -distance);
    }

    public void moveDown(int distance){

        brushPos.setRow(brushPos.getRow() + 1);
        brush.translate(0, distance);
    }

   public void paint(){

            grid.getCells()[brushPos.getCol()][brushPos.getRow()].fill();
   }


    public int getPosCol() {
        return posCol;
    }

    public int getPosRow() {
        return posRow;
    }

    public int getWidth(){
        return posCol * CELL_SIZE;
    }

    public int getHeight(){
        return posRow * CELL_SIZE;
    }

    public int rowToY(int rowes) {
        return (rowes * CELL_SIZE) + PADDING;
    }

    public int columnToX(int column) {
        return (column * CELL_SIZE) + PADDING;
    }

    public Cell getBrushPos() {
        return brushPos;
    }

    public void setBrushPos(Cell brushPos) {
        this.brushPos = brushPos;
    }
}