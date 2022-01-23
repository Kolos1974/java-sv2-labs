package interfacedependencyinversion.amount;

public class Cash implements Payable{


    @Override
    public int getPayableAmount(int amount) {
        String element = String.valueOf(amount);
        char[] c = element.substring(element.length()-1,element.length()).toCharArray();
        switch (c[0]){
            case '0':
                return amount;
            case '1':
                return amount-1;
            case '2':
                return amount-2;
            case '3':
                return amount+2;
            case '4':
                return amount+1;
            case '5':
                return amount;
            case '6':
                return amount-1;
            case '7':
                return amount-2;
            case '8':
                return amount+2;
            case '9':
                return amount+1;
        }
        return amount;
    }

    // Official
    /*
    @Override
    public int getPayableAmount(int amount) {
        int remainder = amount % 5;
        if (remainder <= 2) {
            amount -= remainder;
        } else {
            amount += (5 - remainder);
        }
        return amount;
    }
    */

}
