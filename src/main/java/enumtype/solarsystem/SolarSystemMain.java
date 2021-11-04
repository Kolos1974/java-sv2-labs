package enumtype.solarsystem;

public class SolarSystemMain {
    public static void main(String[] args) {
        System.out.println("A "+SolarSystem.EARTH+" bolygónak "+SolarSystem.EARTH.getMoons()+" holdja van");
        System.out.println("A "+SolarSystem.JUPITER+" bolygónak "+SolarSystem.JUPITER.getMoons()+" holdja van");

    }
}
