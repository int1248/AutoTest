package com.course.testng.goups;

import org.testng.annotations.Test;

@Test(groups="stu")
public class GroupsOnClass1 {
    public void stu1() {
        System.out.println("stu1() execute in GroupsOnClass1");
    }


    public void stu2() {
        System.out.println("stu2() execute in GroupsOnClass2");
    }
}
