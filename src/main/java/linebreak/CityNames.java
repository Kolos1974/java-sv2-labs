package linebreak;

public class CityNames {
    public static void main(String[] args) {
        String city1 = "Kaposvár";
        String city2 = "Békéscsaba";
        String city3 = "Sopron";
        System.out.println(city1.toString()+"\r\n"+city2.toString()+"\r\n"+city3.toString());
        System.out.println(city1.toString()+System.lineSeparator()+city2.toString()+System.lineSeparator()+city3.toString());
    }

}
