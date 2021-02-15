package org.terceira.academiadecodigo.bootcamp.mapEditor;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;

public class Game {

    private Grid grid;
    private Brush brush;
    private BrushKeyboardhandler brushKeyboardhandler;
    private Keyboard keyboard;

    public Game(){
        grid = new Grid(50,30);
        brush = new Brush(grid);

        brushKeyboardhandler = new BrushKeyboardhandler(brush);
        keyboard = new Keyboard(brushKeyboardhandler);

    }

  public void start (){

        grid.init();
        brush.init();


      keyboard.addEventListener(KeyboardEvent.KEY_RIGHT,KeyboardEventType.KEY_PRESSED);
      keyboard.addEventListener(KeyboardEvent.KEY_LEFT,KeyboardEventType.KEY_PRESSED);
      keyboard.addEventListener(KeyboardEvent.KEY_UP,KeyboardEventType.KEY_PRESSED);
      keyboard.addEventListener(KeyboardEvent.KEY_DOWN,KeyboardEventType.KEY_PRESSED);
      keyboard.addEventListener(KeyboardEvent.KEY_SPACE,KeyboardEventType.KEY_PRESSED);

  }
}
