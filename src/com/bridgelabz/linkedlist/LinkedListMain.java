package com.bridgelabz.linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList1.push(56);
        linkedList1.push(30);
        linkedList1.push(70);


        linkedList1.display();


        System.out.println("*******Append Operation*******");

        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.apendPush(56);
        linkedList2.apendPush(30);
        linkedList2.apendPush(70);

       linkedList2.display();

        System.out.println("***Before Pop Method***");
        linkedList2.display();
        Integer popElement =linkedList2.pop();

        System.out.println("***After Pop Method***");
        linkedList2.display();


    }
}
