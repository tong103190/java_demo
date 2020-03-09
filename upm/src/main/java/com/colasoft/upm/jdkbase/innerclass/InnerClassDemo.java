package com.colasoft.upm.jdkbase.innerclass;

/*
  protected 和 private都没法修饰主类
 */
//protected class InnerClassDemo
//private class InnerClassDemo
public class InnerClassDemo {

    private String name;

    private class InnerInnerClass1 {

    }

    protected class InnerInnerClass2 {

    }

    class InnerInnerClass3 {

    }

}

/*
 这样子提示报错，说public的class必须声明在fileName也为InnerClassDemo2的java文件中
 */
//public class InnerClassDemo2 {
class InnerClassDemo2 {

}

/*
  两个class，就会生成两个class文件
 */

