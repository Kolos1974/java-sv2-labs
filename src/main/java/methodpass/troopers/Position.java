package methodpass.troopers;

public final class Position {
    private double posX;
    private double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double distanceFrom(Position positionOther){
        /*
        double x = this.getPosX()-positionOther.getPosX();
        x= x*x;

        double y = this.getPosY()-positionOther.getPosY();
        y=y*y;

        return Math.sqrt(x+y);
        */

        if (positionOther == null) {
            throw new IllegalArgumentException("Cannot calculate distance from unknown position");
        }
        return Math.sqrt(Math.pow(posX - positionOther.posX, 2) + Math.pow(posY - positionOther.posY, 2));
    }
}
