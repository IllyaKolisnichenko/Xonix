/**
 * Java.Game Xonix
 */
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class GameXonix extends JFrame {

    final String NameOfProgram="Xonix";
    final int POINT_SIZE=10;//размер мячика
    final int FIELD_WIDTH=640;
    final int FIELD_WEIGHT=460;
    final int FIELD_DX=6;
    final int FIELD_DY=28+28;
    final int START_LOCATION=200;
    //коды клавиш для управления
    final int LEFT=37;
    final int UP=38;
    final int RIGHT=39;
    final int POINT_SIZE=10;



    public static void main(String[] args){
        new GameXonix().go();
    }

    GameXonix(){

    }

    void go() {
    }
}
