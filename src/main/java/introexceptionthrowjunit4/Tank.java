package introexceptionthrowjunit4;

public class Tank {
    private int angle;

    public int getAngle() {
        return angle;
    }

    public void modifyAngle(int angleNumber){
        angle += angleNumber;
        if (angle>80) {
            throw new IllegalArgumentException();
        }
    }
}
