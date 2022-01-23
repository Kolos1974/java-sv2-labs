package interfaceextends.polygon;

public interface Geometric extends Side, Vertex {

    public abstract double getPerimeter();

    public abstract int getNumberOfDiagonalsFromOneVertex();

    public abstract int getNumberOfAllDiagonals();

}
