package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {
        IntroControl introcontrol = new IntroControl();

        System.out.println("subtractTenIfGreaterThanTen: "+introcontrol.subtractTenIfGreaterThanTen(45));

        System.out.println("describeNumber: "+introcontrol.describeNumber(5));

        System.out.println("greetingToJoe: "+introcontrol.greetingToJoe("Joe"));

        System.out.println("calculateBonus: "+introcontrol.calculateBonus(1500000));

        System.out.println("calculateConsumption: "+introcontrol.calculateConsumption(8560, 12));

        System.out.println("---------------");
        introcontrol.printNumbers(9);
        System.out.println("---------------");

        introcontrol.printNumbersBetween(3, 13);
        System.out.println("---------------");

        introcontrol.printNumbersBetweenAnyDirection(11, 2);
        System.out.println("---------------");

        introcontrol.printOddNumbers(9);
        System.out.println("---------------");
    }
}
