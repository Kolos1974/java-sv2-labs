package interfacedefaultmethods.cloth;

public interface Square {

    default int getNumberOfSides(){
        return 4;
    }

    default double getLengthOfDiagonal(){
        return Math.sqrt(getSide()*getSide()+getSide()*getSide());
    }

    default double getPerimeter(){
        return 4*getSide();
    }

    default double getArea(){
        return getSide()*getSide();
    }

    public abstract double getSide();


}
