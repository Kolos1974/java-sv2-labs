package enumtype.position;

public class PositionMain {
    public static void main(String[] args) {
        System.out.println(Position.SECRETARY);
        System.out.println(Position.SECRETARY.getSalary());
        System.out.println(Position.SECRETARY.getBenefit());
        System.out.println();
        System.out.println(Position.TECHNICAL);
        System.out.println(Position.TECHNICAL.getSalary());
        System.out.println(Position.TECHNICAL.getBenefit());
    }
}
