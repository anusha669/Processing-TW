import processing.core.PApplet;

public class BallMovement extends PApplet {

    static int width = 600;
    static int height = 500;
    static int x = 1;
    static int y = BallMovement.height;

    static int[] circleX = new int[4];
    static int[] circleY = new int[4];
    static int radius = 20;

    public static void main(String args[])
    {
        PApplet.main("BallMovement");
    }

    @Override
    public void settings()
    {
        super.settings();
        size(BallMovement.width, BallMovement.height);
    }

    @Override
    public void setup() {
        stroke(255);
        for(int i=1; i<5; i++)
        {
            BallMovement.circleX[i-1] = BallMovement.x;
            BallMovement.circleY[i-1] = BallMovement.y/(5-i+1);
        }
    }

    @Override
    public void draw() {

        background(51);
        for(int i=1; i< 5; i++)
        {
            BallMovement.circleX[i-1] += i;
            ellipse(BallMovement.circleX[i-1], BallMovement.circleY[i-1], BallMovement.radius, BallMovement.radius);
        }

    }
}