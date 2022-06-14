package array;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class IntegerTypeReverseArrayTest extends TestCase {
@Test
    public void testReverse()
    {
        IntegerTypeReverseArray obj=new IntegerTypeReverseArray();
        Integer[] array1 = {1,2,3};
        Integer act[]= obj.reverse(array1);
        Integer exp []={3,2,1};
        assertArrayEquals(act,exp);
    }
}