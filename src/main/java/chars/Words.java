package chars;

public class Words {

    public String pushWord(String word){
        char[] result = word.toCharArray();
        for (int i = 0; i< result.length; i++) {
            result[i] = (char) (result[i]+1);
        }
        return new String(result);
    }

    public static void main(String[] args) {
        Words words = new Words();
        System.out.println("Az alma eltolása: "+words.pushWord("alma"));
    }

}
