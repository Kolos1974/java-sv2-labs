package interfacedependencyinversion.box;

public class CourierCompany {

    public static void main(String[] args) {

        Box smallBox = new SmallBox();
        Box mediumBox = new MediumBox();
        Box largeBox = new LargeBox();
        Box extraLargeBox = new ExtraLargeBox();

        System.out.println("Smallbox: "+smallBox.getSize()+" "+smallBox.getPrice());
        System.out.println("Mediumbox: "+mediumBox.getSize()+" "+mediumBox.getPrice());
        System.out.println("Largebox: "+largeBox.getSize()+" "+largeBox.getPrice());
        System.out.println("Extralargebox: "+extraLargeBox.getSize()+" "+extraLargeBox.getPrice());
    }
}
