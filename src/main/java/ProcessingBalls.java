import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingBalls extends  PApplet{
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

    List<Ball> listOfBalls=new ArrayList<>();
    public static void main(String[] args) {
        {
            PApplet.main("ProcessingBalls", args);
        }

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        for(int i=1;i<=4;i++){
            Ball ball=new Ball(i);
            listOfBalls.add(ball);

        }
    }

    @Override
    public void draw() {
        //super.draw();
        for(int i=0;i<4;i++){
            Ball currentBall = listOfBalls.get(i);
            float currentSpeed = currentBall.getSpeed();
            ellipse(currentSpeed, currentBall.heightOfBall(HEIGHT), currentBall.DIAMETER,currentBall.DIAMETER);
            currentBall.setSpeed();
        }
    }
}
