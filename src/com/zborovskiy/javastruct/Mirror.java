package com.zborovskiy.javastruct;

class StackM {
    private int maxSize;
    private char[] stackArr;
    private int top;

    public StackM(int size) {
        this.maxSize = size;
        this.stackArr = new char[size];
        this.top = -1;
    }

    public void push(char i) {
        stackArr[++top] = i;
    }

    public char pop() {
        return stackArr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}


public class Mirror {
    private String input;

    public Mirror(String in) {
        input = in;
    }

    public void mkMirror() {
        int size = input.length();
        StackM stack = new StackM(size);
        String rorrim = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < input.length(); i++) {
            rorrim += stack.pop();
        }
        System.out.println(rorrim);
    }
}