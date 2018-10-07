package com.atguigu.cn;

import java.util.ArrayList;

public class HelloTestNew {

    public static void main(String[] args) {
        System.out.printf("hello world");
        ArrayList<Object> list = new ArrayList<>();

        try {
            System.out.printf("hello world");
        } catch (Exception e) {
            while (true) {
                e.printStackTrace();
            }
        } finally {
        }

        new ArrayList<>();
        System.out.printf("hello world");


        ArrayList<Object> list2 = new ArrayList<>();

    }
    
    public void testaa(){
        
    }

}
