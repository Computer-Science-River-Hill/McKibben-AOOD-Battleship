package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BattleshipFX extends Application{
    private final int ROWS = 10;
    private final int COLS = 10;
    private final int OFFSETX = 10;
    private final int OFFSETY = 10;
    private final int PREFFEREDWIDTH = 200;
    private final int PREFFEREDHEIGHT = 200;

    private Canvas enemyFleetCanvas;
    private Canvas myFleetCanvas;
    private VBox layout;
    private Label myFleet;
    private Label enemyFleet;
    boolean[][] filledRects= new boolean[ROWS][COLS];

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        // Create the Canvas
        //A custom class has been created so that it can be resized
        enemyFleetCanvas = new ResizableCanvas(PREFFEREDWIDTH , PREFFEREDHEIGHT);
        myFleetCanvas = new ResizableCanvas(PREFFEREDWIDTH , PREFFEREDHEIGHT);

        //Fill in the blank grids
        draw();
        enemyFleet = new Label("Shots fired at enemy");
        myFleet = new Label("Shots fired at my fleet");

        //Dynamically set a layout to keep everything vertically aligned.
        layout = new VBox(enemyFleet,enemyFleetCanvas,myFleet, myFleetCanvas);

        layout.setAlignment(Pos.CENTER);
        VBox.setVgrow(enemyFleet, Priority.ALWAYS);
        VBox.setVgrow(myFleet, Priority.ALWAYS);
        layout.setFillWidth(true);


        // Create the Scene
        Scene scene = new Scene(layout);
        // Add the Scene to the Stage
        stage.setScene(scene);
        // Set the Title of the Stage
        stage.setTitle("Battleship");
        // Display the Stage
        stage.show();

        //call a method to handle clicking the mouse
        enemyFleetCanvas.setOnMouseClicked(event -> enemyFleetOnClick(event.getX(),event.getY()));
    }

    private void enemyFleetOnClick(double x , double y) {
        int row = -1;
        for(int i =0; i <= ROWS; i++) {
            double temp = i*(enemyFleetCanvas.getWidth()-2*OFFSETY)/ROWS + OFFSETX;
            if (temp < x) row = i;
        }
        int col = -1;
        for(int i =0; i <= COLS; i++) {
            double temp = i*(enemyFleetCanvas.getHeight()-2*OFFSETY)/ROWS + OFFSETY;
            if (temp < y) col = i;
        }
        if(row >= 0 && row < ROWS && col >= 0 && col < COLS)
            filledRects[row][col] = true;
        draw();
    }

    public void draw() {
        GraphicsContext gc = enemyFleetCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, enemyFleetCanvas.getWidth(), enemyFleetCanvas.getHeight());
        gc=myFleetCanvas.getGraphicsContext2D();
        gc.clearRect(0, 0, myFleetCanvas.getWidth(), myFleetCanvas.getHeight());

        gc.setStroke(Color.BLACK);
        drawGrid(enemyFleetCanvas);
        fillRects(enemyFleetCanvas,filledRects,ROWS,COLS, enemyFleetCanvas.getWidth() , enemyFleetCanvas.getHeight() , 10,10);
        drawGrid(myFleetCanvas);
        //fillRects(myFleetCanvas,filledRects,ROWS,COLS, enemyFleetCanvas.getWidth() , enemyFleetCanvas.getHeight() , 10,10);
    }
    public void drawGrid(Canvas c) {
        GraphicsContext gc = c.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        for(int i =0; i <= ROWS; i++)
            gc.strokeLine(OFFSETX,i*(c.getHeight()-2*OFFSETY)/ROWS + OFFSETY,c.getWidth()-OFFSETX,i*(c.getHeight()-2*OFFSETY)/ROWS + OFFSETY);
        for(int i =0; i <= COLS; i++)
            gc.strokeLine(i*(c.getWidth()-2*OFFSETX)/COLS + OFFSETX, OFFSETY,i*(c.getWidth()-2*OFFSETX)/COLS + OFFSETX,c.getHeight()-OFFSETY);
    }
    public void fillRects(Canvas c, boolean[][] rects, int rows, int cols, double width, double height, double offsetX, double offsetY) {
        GraphicsContext gc = c.getGraphicsContext2D();

        for(int y = 0; y < rows; y++)
            for(int x = 0; x < cols; x++)
                if(rects[x][y]) {
                    gc.setFill(Color.RED);
                    gc.setStroke(Color.RED);
                    gc.fillRect(x*(width-2*offsetX)/cols + offsetX+gc.getLineWidth(),
                               y*(height-2*offsetY)/rows + offsetY+gc.getLineWidth(),
                               (width-2*offsetX)/cols - 2*gc.getLineWidth(),
                               (height-2*offsetY)/rows - 2*gc.getLineWidth());
                }
    }


    class ResizableCanvas extends Canvas {
        public ResizableCanvas(double w , double h) {
            super(w , h);
            widthProperty().addListener(observable -> draw());
            heightProperty().addListener(observable -> draw());
        }

        public boolean isResizable() {
            return true;
        }

        public double prefWidth(double width) {
            return PREFFEREDWIDTH;
        }

        public double prefHeight(double height) {
            return PREFFEREDHEIGHT;
        }

        public void resize(double width , double height) {
            super.setWidth(width);
            super.setHeight(height);

        }

        public double minHeight(double width) {
            return 0;
        }

        public double maxHeight(double width) {
            return 1000;
        }
        public double minWidth(double height)
        {
            return 0;
        }
        public double maxWidth(double height)
        {
            return 1000;
        }
    }
}
