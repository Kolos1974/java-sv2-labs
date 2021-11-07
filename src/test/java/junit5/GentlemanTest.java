package junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

    @Test
    void testNormal() {
        // Given
        Gentleman gentleman = new Gentleman();

        // When
        String name = gentleman.sayHello("John Doe");

        // Then
        assertEquals("Hello John Doe!", name);
    }

    @Test
    void testAnother(){
        assertEquals(new Gentleman().sayHello(null),"Hello Anonymous!");

    }
}
