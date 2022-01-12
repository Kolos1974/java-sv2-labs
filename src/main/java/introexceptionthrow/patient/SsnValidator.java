package introexceptionthrow.patient;

public class SsnValidator {

    public boolean isValidSsn(String ssn){
        boolean result = true;
        if (!(ssn.length()==9)){
            result = false;
        }
        char [] numbers = ssn.toCharArray();
        for (char element : numbers){
            if ((element<'0') || (element>'9')){
                result = false;
            }
        }

        try {
            int sum = 0;
            sum += Integer.parseInt(ssn.substring(0,1))*3;
            sum += Integer.parseInt(ssn.substring(1,2))*7;
            sum += Integer.parseInt(ssn.substring(2,3))*3;
            sum += Integer.parseInt(ssn.substring(3,4))*7;
            sum += Integer.parseInt(ssn.substring(4,5))*3;
            sum += Integer.parseInt(ssn.substring(5,6))*7;
            sum += Integer.parseInt(ssn.substring(6,7))*3;
            sum += Integer.parseInt(ssn.substring(7,8))*7;
            int part = (sum % 10);
            if (part!=Integer.parseInt(ssn.substring(8,9))){
                result = false;
            }


        }catch (NumberFormatException nfe){
            throw new NumberFormatException("Nem szám szerepel a TAJ értékben!");
        }

        return result;
    }
}
