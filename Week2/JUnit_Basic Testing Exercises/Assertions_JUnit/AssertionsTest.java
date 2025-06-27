import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");

        // Assert true
        assertTrue(5 > 3, "5 should be greater than 3");

        // Assert false
        assertFalse(5 < 3, "5 should not be less than 3");

        // Assert null
        Object obj = null;
        assertNull(obj, "Object should be null");

        // Assert not null
        Object nonNullObj = new Object();
        assertNotNull(nonNullObj, "Object should not be null");
    }
}
