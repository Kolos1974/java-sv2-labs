package algorithmdecision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrime() {
        Prime prime = new Prime();

        assertTrue(prime.isPrime(11));
        assertTrue(prime.isPrime(19));

        assertFalse(prime.isPrime(9));
        assertFalse(prime.isPrime(12));

    }
}