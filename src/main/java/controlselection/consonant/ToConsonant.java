package controlselection.consonant;

public class ToConsonant {
    public static void main(String[] args) {
        ToConsonant toConsonant = new ToConsonant();
        System.out.println(toConsonant.getConsonant('a'));
        System.out.println(toConsonant.getConsonant('e'));
        System.out.println(toConsonant.getConsonant('g'));
        System.out.println(toConsonant.getConsonant('k'));
    }

    public char getConsonant(char c){
        switch (c){
            case 'a':
                return 'a'+1;
            case 'e':
                return 'e'+1;
            case 'u':
                return 'u'+1;
            case 'o':
                return 'o'+1;
            case 'i':
                return 'i'+1;
            case 'ü':
                return 'ü'+1;
            default:
                return c;
        }
    }

}
