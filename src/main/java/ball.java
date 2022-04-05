public class Ball {
    private int ballNo;
    private float speed=0;
    public static final int DIAMETER = 50;

    public Ball(int ballNo) {
        this.ballNo = ballNo;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed() {
        speed = speed + ballNo;
    }

    public float heightOfBall(int heightOfBall){
        return (float) ((ballNo * heightOfBall)/5);

    }
    public float speedOfTheBall(){
        speed=(float)(speed+ballNo);
        return speed;
    }
}
