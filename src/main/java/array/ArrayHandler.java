package array;

public class ArrayHandler {
    public static void main(String[] args) {
        //int[] numbers = {5, 4, 2, 3, 8, 9};
        int[] numbers = new int[]{5, 4, 2, 3, 8, 9};

        //String[] text = {"One", "Two", "Three", "Four", "Five"};
        String[] text = new String[]{"One", "Two", "Three", "Four", "Five"};

        for (int element : numbers){
            System.out.println(element);
        }

        for (String element : text){
            System.out.println(element);
        }

        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.addIndexToNumber(numbers);

        for (int element : numbers){
            System.out.print(element+", ");
        }
        System.out.println("");

        arrayHandler.concatenateIndexToWord(text);
        for (String element : text){
            System.out.print(element+", ");
        }
    }

    public void addIndexToNumber(int[] source){
        for (int i = 0; i<source.length; i++){
            source[i] = source[i]+i;
        }
    }

    public void concatenateIndexToWord(String[] source){
        for (int i = 0; i<source.length; i++){
            source[i] = ""+i+source[i];
        }
    }

}
