package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        Name name1 = new Name("Kiss", "", "Tibor");
        Name name2 = new Name("Kovács", "István", "Gábor", Title.DR);

        System.out.println(name1.concatNameWesternStyle());
        System.out.println(name1.concatNameHungarianStyle());

        System.out.println();

        System.out.println(name2.concatNameWesternStyle());
        System.out.println(name2.concatNameHungarianStyle());
    }
}
