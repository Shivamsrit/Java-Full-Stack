package Stack;

import java.util.*;


public class Stack {
    int[] arr = new int[100];
    int top = -1;

    void push(int a) {
        if (top == 99) {
            System.out.println("overflow");
            return;
        }
        top++;
        arr[top] = a;

    }

    int pop() {
        int temp = 0;
        if (top == -1) {
            System.out.println("Underflow");
            return 0;
        } else {
            temp = arr[top];
            arr[top] = 0;
            top--;

        }
        return temp;

    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    boolean isFull() {
        if (top == 99) {
            return true;
        }
        return false;
    }

    void print() {
        if (top == -1) {
            System.out.println("Empty Stack");
        }
        for (int i = 0; i <= top; i++) {
            System.out.println("Stack value : " + arr[i]);
        }
    }

}
