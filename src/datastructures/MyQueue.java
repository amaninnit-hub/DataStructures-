/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures;

public class MyQueue {
    Node front; 
    Node rear; 

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (front == null){
            front = newNode;
            rear = newNode;
        } else {
            Node current = front;   
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode; 
        }
    }
    
    public int dequeue(){
        if (front == null){
            System.out.println("Queue is empty!");
            return -1; 
        }
    
        int value = front.data;
        front = front.next; 
        return value;
    }

    public void print(){
        Node current = front;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }
}
