
package LESSON4.lesson4_problem2;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseArrayTest {
    @Test
    public void test(){
        int[] act = ReverseArray.reverse(new int[]{1, 3, 5, 7, 9, 13});
        int[] expect = {13,9,7,5,3,1};
        assertArrayEquals(expect,act);
    }

}
