package com.company;

/*
A straight forward implementation of a Stack data structure and it's methods only using the standard library, the pseudo-code
was taken from the book Introduction to Algorithms (2009, The MIT Press) - Thomas H. Cormen, Charles E. Leiserson,
Ronald L. Rivest, Clifford Stein.
 */


public class Main {

    public static class Stack {

        Integer array[];
        int top = -1;

        public Stack(Integer[] array) {
            this.array = array;
        }

        boolean stack_empty() {
            if (array[0] == null) {
                return true;
            }
            return false;
        }

        void push(Integer[] array, int x) {
            try {
                top++;
                array[top] = x;
            } catch (Exception e) {
                System.err.println("Stack has reached size limit.");
            }
        }

        int pop(Integer[] array) {
            if (stack_empty()) {
                return -1;
            } else if (top == 0) {
                try {
                    array[0] = null;
                    top--;
                    return array[0];
                } catch (Exception e) {
                    System.err.println("The stack is now empty.");
                }
            } else {
                array[top] = null;
                top--;
                return array[top];
            }
            return 0;
        }
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        Stack stack = new Stack(array);
        System.out.println(stack.stack_empty());
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
        stack.push(array, 1);
//        stack.push(array, 1);

    }
}
