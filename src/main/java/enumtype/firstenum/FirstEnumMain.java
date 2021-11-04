package enumtype.firstenum;

import java.util.Arrays;

public class FirstEnumMain {
    public static void main(String[] args) {
        System.out.println(Continent.ASIA);
        System.out.println(Continent.AFRICA);
        System.out.println(Continent.NORTAMERICA);
        System.out.println(Continent.SOUTHAMERICA);
        System.out.println(Continent.ANTARKTIKA);
        System.out.println(Continent.EUROPE);
        System.out.println(Continent.AUSTRALIA);

        Continent[] continents = Continent.values();
        System.out.println(Arrays.toString(continents));
        System.out.println(Arrays.toString(Continent.values()));
        System.out.println();

        System.out.println(Ocean.valueOf("ATLANTIC"));
        System.out.println(Ocean.valueOf("PACIFIC"));
        System.out.println(Ocean.valueOf("INDIAN"));
        System.out.println();

        System.out.println(Football.GOALKEEPER.name());
        System.out.println(Football.DEFENDER.name());
        System.out.println(Football.MIDFIELDER.name());
        System.out.println(Football.FORWARD.name());

    }

}
