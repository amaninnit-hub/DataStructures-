/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructures;

public class DataStructures {

    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        
//        list.addLast(1);
//        list.addLast(2);
//        list.addLast(3);
//        list.addLast(4);
//        
//        System.out.println("Before delete:");
//        list.print();
//        
//        list.delete(2);
//        System.out.println("After deleting 2:");
//        list.print();
//        
//        list.delete(1);
//        System.out.println("After deleting head 1:");
//        list.print();
//        
//        list.delete(99);
        
//      MyStack stack = new MyStack();
//      stack.push(1);
//      stack.push(2);
//      stack.push(3);
//      stack.print();
//      
//      int popped = stack.pop();
//        System.out.println("Popped: " + popped);
//        stack.print();

MyQueue queue = new MyQueue();

queue.enqueue(1);
queue.enqueue(2);
queue.enqueue(3);
queue.dequeue();
queue.print();
    }
    
}
