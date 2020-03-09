package com.colasoft.upm.jdkbase.innerclass.test;

import com.colasoft.upm.jdkbase.innerclass.InnerClassDemo;

public class InnerClassDemoTest {

    public static void main(String[] args) {
        /* InnerClassDemo2是拿不到的，因为默认访问权限是包访问权限 */
//        Class<InnerClassDemo> innerClassDemoClass2 = InnerClassDemo2.class;
        Class<InnerClassDemo> innerClassDemoClass = InnerClassDemo.class;
    }
}
