package org.terceira.academiadecodigo.bootcamp.mapEditor;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;



public class BrushKeyboardhandler implements KeyboardHandler {


    private final int moveUp = Grid.CELL_SIZE;
    private final int moveDown = Grid.CELL_SIZE;
    private final int moveLeft = Grid.CELL_SIZE;
    private final int moveRight = Grid.CELL_SIZE;
    private Brush brush;

    public BrushKeyboardhandler( Brush brush){
        this.brush =brush;
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {


        switch (keyboardEvent.getKey()){

            case KeyboardEvent.KEY_SPACE:
                brush.paint();

                break;

            case KeyboardEvent.KEY_RIGHT:


                brush.moveRight(moveRight);
                break;

            case KeyboardEvent.KEY_LEFT:

                brush.moveLeft(moveLeft);
                break;

            case KeyboardEvent.KEY_UP:

                brush.moveUp(moveUp);
                break;

            case KeyboardEvent.KEY_DOWN:

                brush.moveDown(moveDown);
                break;
        }


    }

     @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
