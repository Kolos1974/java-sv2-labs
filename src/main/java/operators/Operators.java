package operators;

public class Operators {

    public boolean isEven(int n){
        if (n%2==0){
            return true;
        } else {
            return false;
        }
    }

    public String getResultOfDivision(int number, int divisor){
        int result = number/divisor;
        int rest = number%divisor;
        return Integer.toString(number)+"/"+Integer.toString(divisor)+"="+
                Integer.toString(result)+", maradék:"+Integer.toString(rest);

    }

    public String isNull(String s){
        return (s==null) ? "null értékű" : "nem null értékű";
    }

    public boolean isEmpty(String s){
        // s == null || s.equals("");
        return ((s==null) || (s.isEmpty())) ? true : false;
    }

}
