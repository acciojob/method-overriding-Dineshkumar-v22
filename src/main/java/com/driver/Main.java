package com.driver;

public class Main {

    public static class A{
        public string meth(){
        return "Invoking method from class A";
    }
        }

    public static class B extends A{
        public string meth(){
            return "Method is overridden in Extendend class B";
        }
    }
    public static void main(String[] args)
    {
        B b = new B();
        b.meth.super();

        B b1 = new B();
        b1.meth();
    }


}