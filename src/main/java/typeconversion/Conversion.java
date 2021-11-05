package typeconversion;

public class Conversion {

    public double convertDoubleToDouble(double number){
        int part = (int) number;
        return (double) part;
    }

    public byte[] convertIntArrayToByteArray(int[] numbers){
        byte[] result = new byte[numbers.length];
        for (int i = 0; i<numbers.length; i++){
            if ((numbers[i]<0) || (numbers[i]>127)) {
                result[i]=-1;
            } else {
                result[i] = (byte) numbers[i];
            }
        }
        return result;
    }

    public int getFirstDecimal(double number){
        int intNumber = (int) number;
        double diff = number-intNumber;
        int result = (int) (diff*10);
        return result;
    }


}
