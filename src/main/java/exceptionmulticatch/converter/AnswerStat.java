package exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter bsc;

    public AnswerStat(BinaryStringConverter bsc) {
        this.bsc = bsc;
    }

    public boolean[] convert(String text){
        boolean[] result = null;
        try{
            result = bsc.binaryStringToBooleanArray(text);
        } catch (NullPointerException | IllegalArgumentException e){
            throw new InvalidBinaryStringException("Binary string is null.", e);
        }
        return result;
    }

    public int answerTruePercent(String answers){
        boolean[] result = convert(answers);
        int trueNumber = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i]) {
                trueNumber++;
            }
        }
        int resultNumber = (int) Math.round((double) trueNumber / result.length * 100);
        return resultNumber;
    }
}
