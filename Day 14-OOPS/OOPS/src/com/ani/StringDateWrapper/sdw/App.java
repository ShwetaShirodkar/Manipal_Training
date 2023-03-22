package com.ani.StringDateWrapper.sdw;



public class App {

    public static void demo1() {
        com.ani.StringDateWrapper.sdw.StringDemos sd = new com.ani.StringDateWrapper.sdw.StringDemos();
        sd.demo2();

        com.ani.StringDateWrapper.sdw.Animal an = new com.ani.StringDateWrapper.sdw.Animal();
        an.st();
        
        com.ani.StringDateWrapper.sdw.date.Animal an1 = new com.ani.StringDateWrapper.sdw.date.Animal();
        an1.dt();
    }

    public static void demo2() {
        StringDemos sd = new StringDemos();
        sd.demo5();
    }public static void demo3() {
        com.ani.StringDateWrapper.sdw.date.DateDemo dd = new com.ani.StringDateWrapper.sdw.date.DateDemo();
        dd.demo2();
    }
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        java.lang.System.out.println("🔥 String, Date, Warapper 🔥");

       demo3();
    }
}