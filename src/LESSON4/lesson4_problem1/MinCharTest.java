package LESSON4.lesson4_problem1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinCharTest {
    @Test

    public void test1(){

        char act = MinChar.minChar("akel");
        char expec = 'a';
        assertEquals(expec , act);

    }
}