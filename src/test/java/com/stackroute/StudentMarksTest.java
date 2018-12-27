package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;


public class StudentMarksTest {
    @Test
    public void test1(){
        assertEquals("grade should be between 0 and 100",true,StudentMarks.studentMark(80));


    }
    @Test
    public void test2(){
        assertEquals("grade should be between 0 and 100",false,StudentMarks.studentMark(160));


    }
    @Test
    public void test3(){
        assertNotEquals("grade should be between 0 and 100",true,StudentMarks.studentMark(180));
    }
    @Test
    public void test4(){
        assertNull("grade should be between 0 and 100",StudentMarks.studentMark(50));
    }
}
