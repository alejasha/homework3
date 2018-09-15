package com.zborovskiy.javastruct;

public class Stack {
    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stack = new int[this.maxSize];
        top = -1;
    }

        public void push ( int i){
            stack[++this.top] = i;
        }

        public int pop () {
            return stack[this.top--];
        }

        public int peek () {
            return stack[this.top];
        }

        public boolean isEmpty () {
            return (this.top == -1);
        }

        public boolean isFull () {
            return (top == maxSize - 1);
        }

        public void print(){
            for (int i=0; i <= top; i++) System.out.println(stack[i] + " ");
        }
    }