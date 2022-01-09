package exceptionmulticatch.converter;

public class BinaryStringConverter {

    public boolean[] binaryStringToBooleanArray(String text) {
        boolean[] result = new boolean[text.length()];;
        if (text == null){
            throw new NullPointerException("Binary string is null.");
        }
        if (!(validateString(text))) {
            throw new IllegalArgumentException("Binary string is not valid.");
        }

        for (int i = 0; i < text.length(); i++) {
            char element = text.charAt(i);
            if (!(element=='0' || element=='1')) {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
            result[i]= (element=='1');
        }
        return result;
    }

    public boolean validateString(String text){
        for (char element: text.toCharArray()){
            if (!((element=='0') || (element=='1'))) {
                return false;
            }
        }
        return true;
    }

    public String booleanArrayToBinaryString(boolean[] elements) {
        if (elements == null) {
            throw new NullPointerException("Null");
        }
        if (elements.length == 0) {
            throw new IllegalArgumentException("Boolean array is empty.");
        }

        StringBuilder result = new StringBuilder(elements.length);
        for (int i = 0; i < elements.length; i++) {
            if (elements[i])
                result.append('1');
            else
                result.append('0');
        }
        return result.toString();
    }

}
