package interfaceextends.polygon;

public class Polygon implements Geometric{
    private double lengthOfSide;
    private int numberOfVerticles;

    public Polygon(double lengthOfSide, int numberOfVerticles) {
        this.lengthOfSide = lengthOfSide;
        this.numberOfVerticles = numberOfVerticles;
    }

    @Override
    public double getPerimeter() {
        return lengthOfSide*numberOfVerticles;
    }

    @Override
    public int getNumberOfDiagonalsFromOneVertex() {
        return numberOfVerticles-3;
    }

    @Override
    public int getNumberOfAllDiagonals() {
        return ((numberOfVerticles-3)*numberOfVerticles)/2;
    }

    @Override
    public double getLengthOfSide() {
        return lengthOfSide;
    }

    @Override
    public int getNumberOfVertices() {
        return numberOfVerticles;
    }
}
