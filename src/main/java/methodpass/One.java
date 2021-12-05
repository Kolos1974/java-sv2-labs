package methodpass;

public class One {

    public static void main(String[] args) {
        // 1
        int number = 16;
        System.out.println(number);

        // 2
        number++;
        System.out.println(number);

        // 4

        One one = new One();
        // Itt az objektum létrehozása miatt a number változó 16-ról indul!!
        number = one.addOne(number);
        System.out.println(number);

        System.out.println(number);

        /*
        Kiírva:
        16
        17
        17
        17
         */
    }

    //3
    public int addOne(int number) {
        return number++;
    }

}
