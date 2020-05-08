package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void ignore1() {
        System.out.println("ignore1 execute");
    }


    @Test(enabled = false)
    public void ignore2() {
        System.out.println("ignore2 execute");
    }
    @Test(enabled = true)
    public void ignore3() {
        System.out.println("ignoree execute");
    }
}
