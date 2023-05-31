package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Stack follow LIFO

        Stack<String> stack=new Stack<>();
        stack.push("Subin");
        stack.push("raj");
        stack.push("jay");
        stack.push("Sudhanshu");

        System.out.println(stack);

        //top view
        System.out.println(stack.peek());  //it's show Sudhanshu

        System.out.println(stack.pop());  //remove sudhanshu
        System.out.println(stack);

    }
}