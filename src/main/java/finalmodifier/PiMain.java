package finalmodifier;

// import static finalmodifier.CircleCalculator.PI;

public class PiMain {
    public static void main(String[] args) {

        System.out.println(CircleCalculator.PI);

        CircleCalculator circleCalculator = new CircleCalculator();
        System.out.println(circleCalculator.calculateArea(20));
        System.out.println(circleCalculator.calculatePerimeter(20));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();
        System.out.println(cylinderCalculator.calculateVolume(50, 40));
        System.out.println(cylinderCalculator.calculateSurfaceArea(50, 40));

        CylinderCalculatorBasedOnCircle cylinderCalculatorBasedOnCircle = new CylinderCalculatorBasedOnCircle();
        System.out.println(cylinderCalculatorBasedOnCircle.calculateVolume(50, 40));
        System.out.println(cylinderCalculatorBasedOnCircle.calculateSurfaceArea(50, 40));
    }

}
