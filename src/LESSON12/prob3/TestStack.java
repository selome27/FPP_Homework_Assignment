package LESSON12.prob3;

import java.util.EmptyStackException;

public class TestStack {
        public static void main(String[] args) {
            MyStack stack = new MyStack(3);

            // Basic operations (these will break when you add checks—students will add try/catch later)
            System.out.println("Push 10, 20, 30");
            stack.push(10);
            stack.push(20);
            stack.push(30);
            System.out.println("Stack: " + stack);

            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            System.out.println("After pop, peek: " + stack.peek());
            System.out.println("Stack: " + stack);

            try {
                stack.push(40);
                stack.push(70);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            try {
                stack.push(null);
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }

            try {
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
            }catch (EmptyStackException e){
                System.out.println("can't pop, Stack is empty");
            }

            try{
                stack.peek();
            } catch (EmptyStackException e){
                System.out.println("can't peek, Stack is empty");
            }

        }
    }

