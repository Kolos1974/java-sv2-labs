package compositionlist.computer;

public class PersonalComputerMain {
    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(new Cpu("Celeron", 2400));
        pc.addHardware(new Hardware("hangkártya", "srs"));
        pc.addHardware(new Hardware("videokártya","NVidia"));
        pc.addSoftware(new Software("Windows 10", 10));
        pc.addSoftware(new Software("Office", 2019));
        System.out.println(pc);
    }

}
