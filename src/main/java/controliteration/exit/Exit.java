package controliteration.exit;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        String text = "Az ügyfélszolgálat menüje jelenleg nem elérhető. Kilépés x billentyű megnyomásával";
        Scanner scanner = new Scanner(System.in);

        String menuItem = "";
        do {
            System.out.println(text);
            menuItem = scanner.nextLine();
        } while (!(menuItem.equals("x")));

    }
}
