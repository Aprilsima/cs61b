import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    /*// You must use this palindrome, and not instantiate
    // new Palindromes, or the autograder might be upset.*/
    static Palindrome palindrome = new Palindrome();
    static OffByOne offbyone = new OffByOne();
    @Test
    public void testWordToDeque() {
        Deque d = palindrome.wordToDeque("persiflage");
        String actual = "";
        for (int i = 0; i < "persiflage".length(); i++) {
            actual += d.removeFirst();
        }
        assertEquals("persiflage", actual);
    }


    @Test
    public void testisPalindrome() {
        String test1="noon";
        assertTrue(palindrome.isPalindrome(test1));
        String test2="horse";
        assertFalse(palindrome.isPalindrome(test2));
        String test3="A";
        assertTrue(palindrome.isPalindrome(test3));
        String test4=null;
        assertTrue(palindrome.isPalindrome(test4));
    }


    @Test
    public void testnewisPalindrome() {
        String test1="flake";
        assertTrue(palindrome.isPalindrome(test1, offbyone));
        String test2="horse";
        assertFalse(palindrome.isPalindrome(test2, offbyone));
        String test3="A";
        assertTrue(palindrome.isPalindrome(test3, offbyone));
        String test4=null;
        assertTrue(palindrome.isPalindrome(test4, offbyone));
    }
}
