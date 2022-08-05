package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

     @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
     }

    @Test
    public void areBracketsCorrectOrder() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void noBracketsTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("hello"));
    }

    @Test
    public void wordWithBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));
    }

    @Test
    public void wordWithOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[hello"));
    }

    @Test
    public void wordAfterBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]hello"));
    }

    @Test
    public void onlyOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void correctNestedBracketsTest() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Hello[there]]"));
    }

    @Test
    public void incorrectNestedBracketsTest() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hello[there]"));
    }

    @Test
    public void notBalancedBracketsWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void wordWithBracketsInTheMiddle() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
}
