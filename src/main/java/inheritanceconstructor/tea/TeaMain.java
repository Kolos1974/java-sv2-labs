package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("Earl Grey", 1500);

        HerbalTea herbalTea = new HerbalTea("Kakukkfű", 1800);

        System.out.println("Tea objektum: "+tea.getName()+", ára: "+tea.getPrice());
        System.out.println("Herbal tea objektum: "+herbalTea.getName()+", ára: "+herbalTea.getPrice());
    }
}
