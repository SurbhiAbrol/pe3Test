package com.stackroute;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionhandleTest {

    Exceptionhandle excptionHandelling = new Exceptionhandle("array");


    @Test
    public void testMain1() {
        //act
        boolean expected = true;

        boolean result = excptionHandelling.main(new int[]{12,21,23,312,4});
        assertEquals(expected,result);

    }

    @Test
    public void testMain2() {
        //act
        boolean expected = false;

        boolean result = excptionHandelling.main(new int[]{12,56,23,312,4});
        assertNotEquals(expected,result);
    }



}