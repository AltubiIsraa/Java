package hs.hs;

import javax.management.RuntimeErrorException;

import lombok.val;
import lombok.var;

/**
 * Aclass
 */
public class Aclass {

    protected static boolean palind( int x ){
        final var s = String.valueOf(x);
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return false;

    }

    private static void test(){
        testA(true, palind(123));
        testA(false, palind(564));
        testA(true, palind(12));
    }

    private static void testA(boolean expected, boolean given) {
        if (expected != given) {
            throw new RuntimeErrorException("Test");
        }
    }
}
