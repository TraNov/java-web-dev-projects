package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
//}
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void testStringWithNoBrackets () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hello no brackets"));
    }

    @Test
    public void strOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]str"));

    }

    @Test
    public void testBalancedBrackets1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void singleRightBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void singleLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testUnbalancedBrackets4() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testUnbalancedBrackets3() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void testUnopenedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]"));
    }

    @Test
    public void testCrazyBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]][[]]["));
    }

    @Test
    public void balancedBracketsInbetweenCharsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[st]r"));
    }


}

