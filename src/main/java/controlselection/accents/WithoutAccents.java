package controlselection.accents;

public class WithoutAccents {
    public static void main(String[] args) {
        WithoutAccents withoutAccents = new WithoutAccents();
        System.out.println(withoutAccents.getOriginChar('ű'));
        System.out.println(withoutAccents.getOriginChar('a'));
        System.out.println(withoutAccents.getOriginChar('á'));
        System.out.println(withoutAccents.getOriginChar('ó'));
        System.out.println(withoutAccents.getOriginChar('p'));
    }

    public char getOriginChar(char c){
        switch (c){
            case 'á':
                return 'a';
            case 'é':
                return 'e';
            case 'ú':
                return 'u';
            case 'ó':
                return 'o';
            case 'í':
                return 'i';
            case 'ű':
                return 'ü';
            default:
                return c;
        }
    }

}
