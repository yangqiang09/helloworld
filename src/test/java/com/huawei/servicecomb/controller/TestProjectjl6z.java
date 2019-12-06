package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectjl6z {

        Projectjl6zDelegate projectjl6zDelegate = new Projectjl6zDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectjl6zDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}