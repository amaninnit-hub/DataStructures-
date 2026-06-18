/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

public class MyStack {
    Node top; 
    
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    public int pop(){
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int value = top.data; 
        top = top.next;
        return value; 
    }
    
    public void print(){
        Node current = top; 
        while (current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
