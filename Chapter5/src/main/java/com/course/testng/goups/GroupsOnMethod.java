package com.course.testng.goups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {
    @Test(groups = {"server"})
    public void test1() {
        System.out.println("11111111");
    }
    @Test(groups = {"server"})
    public void test2() {
        System.out.println("22222211111111");
    }
    @Test(groups = "client")
    public void test3() {
        System.out.println("333333333311111111");
    }
    @Test(groups = "client")
    public void test4() {
        System.out.println("44444411111111");
    }

    @BeforeGroups({"client"})
    public void beforeGroupsOnServer() {
        System.out.println("beforeGroupsOnServer");
    }

    @AfterGroups({"client"})
    public void afterGroupsOnServer() {
        System.out.println("afterGroupsOnServer");
    }

}
