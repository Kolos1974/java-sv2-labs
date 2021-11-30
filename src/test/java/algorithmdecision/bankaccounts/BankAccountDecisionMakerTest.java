package algorithmdecision.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountDecisionMakerTest {

    @Test
    void containsBalanceGreatherThan() {
        List<BankAccount> list = new ArrayList<>();
        list.add(new BankAccount("Gáspár","11111111-1111111", 100000));
        list.add(new BankAccount("Menyhért","11111111-22222222", 200000));
        list.add(new BankAccount("Boldizsár","11111111-33333333", 300000));

        BankAccountDecisionMaker bankAccountDecisionMaker = new BankAccountDecisionMaker();

        assertTrue(bankAccountDecisionMaker.containsBalanceGreatherThan(list, 222222));
        assertFalse(bankAccountDecisionMaker.containsBalanceGreatherThan(list, 3333333));
    }
}