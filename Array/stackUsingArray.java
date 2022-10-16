package Array;

import java.util.Scanner;
public class stackUsingArray {
    private int data[];
    private int top;
    
    //Constructor
    public stackUsingArray(){
        data = new int[510];
        top = -1;
    }

    public stackUsingArray(int doublecapacity){
        data = new int[doublecapacity];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public int size(){
        return top + 1;
    }

    public int top(){
        if(size() == 0){
            System.out.println("Stack underflow");
        }
        return data[top];
    }

    public void push (int element){
        if(size() == data.length){
            System.out.println("Stack Overflow");
        }
        top++;
        data[top] = element;
    }

    public int pop(){
        if(size() == 0){
            System.out.println("Stack Underflow");
        }
        int temp = data[top];
        top--;
        return temp;
    }

    public void doublecapacity(){
        int temp[] = data;
        data = new int [2 * data.length];
        for(int i = 0 ; i <= top; i++){
            data[i] = temp[i];
        }
    }

    public void display(){
        for(int i = top ; i >= 0 ; i++){
            System.out.println(data[i]);
        }
    }
    
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

    }

}

