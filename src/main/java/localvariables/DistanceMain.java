package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(156.67, true);

        System.out.println("Distance: "+distance.getDistanceInKm()+", exact: "+distance.isExact());

        int wholePart = (int) distance.getDistanceInKm();

        System.out.println("Whole distance: "+wholePart);

    }

}
