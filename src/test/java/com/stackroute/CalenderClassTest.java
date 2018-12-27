package com.stackroute;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;
public class CalenderClassTest {
    @Test
    public void calenderTest(){
        CalenderClass c=new CalenderClass();

        assertEquals("  First Date of Week:Mon 24/12/2018\n" +
                "\n" +
                "  Last date of the week:Sun 30/12/2018",c.dayOfWeek("dd/MM/YYYY"));

    }
    @Test
    public void calenderTest1(){
        CalenderClass c=new CalenderClass();

        assertNotEquals("  First Date of Week:Mon 24/07/2017\n" +
                "\n" +
                "  Last date of the week:Sun 30/07/2017",c.dayOfWeek("dd/MM/YYYY"));

    }
}
