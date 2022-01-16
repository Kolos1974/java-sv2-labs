package inheritanceattributes.building;

public class BuildingMain {

    public static void main(String[] args) {
        Building building = new Building("Épület", 808, 5);
        SchoolBuilding schoolBuilding = new SchoolBuilding("Iskola", 1620, 4, 12);

        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        System.out.println(schoolBuilding.name);
        System.out.println(schoolBuilding.area);
        System.out.println(schoolBuilding.getFloors());
        System.out.println(schoolBuilding.getNumberOfClassRooms());


    }
}
