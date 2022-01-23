package interfacedependencyinversion.amount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayableTest {


    @Test
    void testPayable(){
        Payable amount = new Amount();
        Payable bankAtm = new BankAtm();
        Payable cash = new Cash();

        assertEquals(125, amount.getPayableAmount(125));

        assertEquals(200, cash.getPayableAmount(200));
        assertEquals(200, cash.getPayableAmount(201));
        assertEquals(200, cash.getPayableAmount(202));
        assertEquals(205, cash.getPayableAmount(203));
        assertEquals(205, cash.getPayableAmount(204));
        assertEquals(205, cash.getPayableAmount(205));
        assertEquals(205, cash.getPayableAmount(206));
        assertEquals(205, cash.getPayableAmount(207));
        assertEquals(210, cash.getPayableAmount(208));
        assertEquals(210, cash.getPayableAmount(209));
        assertEquals(210, cash.getPayableAmount(210));

        assertEquals(5000, bankAtm.getPayableAmount(5126));
        assertEquals(6000, bankAtm.getPayableAmount(5776));


    }
}