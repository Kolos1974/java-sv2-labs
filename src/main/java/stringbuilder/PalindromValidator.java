package stringbuilder;

public class PalindromValidator {
    public static void main(String[] args) {
        PalindromValidator palindromValidator = new PalindromValidator();
        String st = "Indul a görög aludni";
        String st2 = "Válasz";
        String st3 = "Évák eledele kávé";
        System.out.println(palindromValidator.isPalindrome(st));
        System.out.println(palindromValidator.isPalindrome(st2));
        System.out.println(palindromValidator.isPalindrome(st3));
    }

    public boolean isPalindrome(String word){
        StringBuilder sb = new StringBuilder(word);
        return word.equalsIgnoreCase(sb.reverse().toString());

    }

}
