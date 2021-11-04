package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections(){
        int result;
        result = 2;
        result = result + ((360-30)/10);
        return result;
    }

    public static void main(String[] args) {
        HeadingNorth headingNorth = new HeadingNorth();
        System.out.println(headingNorth.getNumberOfNewDirections());

    }
}
