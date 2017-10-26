import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @org.junit.jupiter.api.Test
    void reverseIterative()
    {
        ReverseString test = new ReverseString();

        String expected = "321";
        String result = test.reverseIterative("123");

        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void reverseRecursive()
    {
        ReverseString test = new ReverseString();

        String expected = "321";
        String result = test.reverseRecursive("123");

        assertEquals(expected,result);
    }

}