package strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenateTest {
    @Test
    public void concatenate() {
        Assertions.assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello", " ", "World", "!"}));
        Assertions.assertEquals("Hello World!", Concatenate.concatenate(new String[]{"H", "e", "llo", " ", "World!"}));
        Assertions.assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello World", "!"}));
    }
}
