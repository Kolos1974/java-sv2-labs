package controladvanced.labels;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LabelsTest {

    @Test
    void testLabels(){
        Labels labels = new Labels();
        int[][] table = labels.getTableOfNumbers(5);

        System.out.println(table.toString());
        System.out.println(Arrays.toString(table));

        assertEquals(6, table[2][2]);
        assertEquals(10, table[4][4]);


    }
}
