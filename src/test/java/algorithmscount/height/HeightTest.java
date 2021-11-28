package algorithmscount.height;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    @Test
    void testHeight(){
        Height height = new Height();
        List<Integer> childrenHeight = new ArrayList<>();
        childrenHeight.add(145);
        childrenHeight.add(148);
        childrenHeight.add(152);
        childrenHeight.add(150);
        childrenHeight.add(155);

        assertEquals(2, height.countChildrenWithHeightGratherThan(childrenHeight, 150));

    }

}