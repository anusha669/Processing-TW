package java;

import processing.core.PApplet;

public class BallMovementOOP extends PApplet {

    static int width = 600, height = 500;
    static int x = 1;
    static int y = BallMovementOOP.height;
    static int maximumBalls = 4;
    static java.Ball[] ballsArrayObject = new java.Ball[4];

    public static void main(String args[])
    {
        PApplet.main("BallMovementOOP");
    }

    @Override
    public void settings()
    {
        super.settings();
        size(BallMovementOOP.width, BallMovementOOP.height);
    }
    @Override
    public void setup() {
        stroke(255);
        int heightFromXAXis = BallMovementOOP.height/BallMovementOOP.maximumBalls;
        for(int ballNumber=1; ballNumber <= BallMovementOOP.maximumBalls; ballNumber++)
        {
            BallMovementOOP.ballsArrayObject[ballNumber-1] = new java.Ball(BallMovementOOP.x, heightFromXAXis, ballNumber);
            heightFromXAXis += BallMovementOOP.height/BallMovementOOP.maximumBalls;
        }
    }
    @Override
    public void draw() {
        background(51);

        for(int ballNumber=1; ballNumber < BallMovementOOP.maximumBalls; ballNumber++)
        {
            BallMovementOOP.ballsArrayObject[ballNumber-1].x += BallMovementOOP.ballsArrayObject[ballNumber-1].speed;
            ellipse( BallMovementOOP.ballsArrayObject[ballNumber-1].x, BallMovementOOP.ballsArrayObject[ballNumber-1].y, 20, 20);
        }

    }

}
