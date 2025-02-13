package org.homeworksubmission;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class catTest {
    cat cat = new cat();

    @Test
    void sum() {
        int result = cat.sum(2,2);
        assertEquals(4,result);
    }



    @Test
    void sub() {
        int result = cat.sub(2,2);
        assertEquals(0,result);
    }

    @Test
    void mul() {
        int result = cat.mul(2,2);
        assertEquals(4,result);

    }

    @Test
    void div() {
        int result = cat.div(2,2);
        assertEquals(1,result);
    }
}