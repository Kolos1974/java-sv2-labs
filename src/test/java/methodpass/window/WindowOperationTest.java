package methodpass.window;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WindowOperationTest {

    @Test
    void testWindowOperation(){
        Window window1 = new Window("konyha", 50, 65);
        Window window2 = new Window("fürdő", 40, 40);
        Window window3 = new Window("nappali", 160, 180);

        List<Window> windowList = new ArrayList<>();
        windowList.add(window1);
        windowList.add(window2);
        windowList.add(window3);

        System.out.println(windowList);

        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windowList, 10);

        System.out.println(windowList);
    }

    @Test
    void testRiseSize() {
        List<Window> windows = new ArrayList<>();
        windows.add(new Window("nappali", 120, 150));
        windows.add(new Window("hálószoba", 90, 150));
        windows.add(new Window("konyha", 90, 150));
        windows.add(new Window("fürdőszoba", 60, 60));

        WindowOperation windowOperation = new WindowOperation();
        windowOperation.riseSize(windows, 30);

        assertEquals(180, windows.get(1).getHeight());
        assertEquals(90, windows.get(3).getHeight());
    }


}