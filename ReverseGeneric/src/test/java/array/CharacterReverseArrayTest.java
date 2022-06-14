package array;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class CharacterReverseArrayTest extends TestCase {

    public void testReverse() {
        CharacterReverseArray sy=new CharacterReverseArray();
        Character [] array={'a','b','c'};
        Character [] act=sy.reverse(array);
        Character [] exp={'c','b','a'};
        assertArrayEquals(act,exp);
    }
}