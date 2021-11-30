package algorithmdecision;

public class Prime {
    public boolean isPrime(int number) {
        boolean result = true;
        int i = 2;
        while ((i < number) && result) {
            if (number % i == 0) {
                result = false;
            }
            i++;
        }
        return result;
    }

}
