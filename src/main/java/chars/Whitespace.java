package chars;

public class Whitespace {
    public String makeWhitespaceToStar(String text){
        char[] result = text.toCharArray();
        for (int i = 0; i< result.length; i++) {
            if (Character.isWhitespace(result[i])){
                result[i] = '*';
            }
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        String text = "A szövegben van soremelés (line feed) \n és kocsivissza (carriage return) \r karakter";
        System.out.println("A makeWhitespaceToStar metódus eredménye: "+whitespace.makeWhitespaceToStar(text));
    }
}
