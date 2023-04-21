package com.bridgelabz.linkedlist;

public class LinkedList<T> {

    Node <T> head;
    Node <T> tail;
    public void push(T data) {

        Node<T> newNode1 = new Node<>(data);
       if(head == null)
       {
          head = newNode1;
          tail = newNode1;
       }else {
          newNode1.next = head;
          head = newNode1;
       }

    }


    public void display() {
        Node<T> temp = head;
     while (temp != null)
     {
         System.out.print(temp.data + " -> ");
         temp = temp.next;


     }
        System.out.println();



    }

    public void apendPush(T data) {
        Node<T> newNode = new Node<>(data);
        if(head==null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next = newNode ;
            tail = newNode;
        }



    }

    public void apendDisplay() {
        Node<T> temp = head;
        while (temp!=null) {
            System.out.println(temp.data + " ---> ");
            temp = temp.next;
        }
        System.out.println();
    }



    public T pop() {
        T popElement = tail.data;
        head   = head.next;
        return popElement;
    }
}
