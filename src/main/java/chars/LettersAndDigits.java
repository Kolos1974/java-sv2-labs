package chars;

public class LettersAndDigits {

    public void printLetterOrDigit(String text){
        for (int i = 0; i<text.length(); i++){
            System.out.print(text.toCharArray()[i]);
            System.out.print(" : ");
            char ch = text.toCharArray()[i];
            // if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            if (Character.isAlphabetic(ch)) {
                System.out.println("betű");
                // } else if (ch>='0' && ch<='9') {
            } else if (Character.isDigit(ch)) {
                System.out.println("számjegy");
            } else {
                System.out.println("egyéb");
            }
        }
    }

    public static void main(String[] args) {
        LettersAndDigits lettersAndDigits = new LettersAndDigits();
        lettersAndDigits.printLetterOrDigit("bfa68fF;X");
    }

}
