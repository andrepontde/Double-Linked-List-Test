/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testappweek5;

/**
 *
 * @author AndrePontDeAnda
 */
public class DLList implements LinearListInterface {

    private Node head;
    private Node last;
    private Node curr;
    private int size;

    DLList() {
        head = null;
        last = null;
        size = 0;
        curr = head;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int index) {
        setCurrent(index);
        return curr;
    }

    public void setCurrent(int index) {
        curr = head;
        for (int i = 1; i < index; i++) {
            curr = curr.getNext();
        }
    }
    
    @Override
    public void add(Object theElement, int index) {
        if (index == 1) {
            Node newNode = new Node(curr, null, null);
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        } else if (index == (size + 1)) {
            Node newNode = new Node(theElement, null, null);
            newNode.setPrev(last);
            last.setNext(newNode);
            last = newNode;
        } else {
            setCurrent(index);
            Node newNode = new Node(theElement, null, null);
            newNode.setNext(curr);
            Node prev = curr.getPrev();
            newNode.setPrev(prev);
            prev.setNext(newNode);
            curr.setPrev(newNode);   
        }
        size++;
    }
    
//    @Override
//    public void add(Object theElement) {
//            Node newNode = new Node(theElement, null, null);
//            newNode.setPrev(last);
//            last.setNext(newNode);
//            last = newNode;
//    }

    
    @Override
    public void remove(int index) {
        setCurrent(index);
        Node next = curr.getNext();
        Node prev = curr.getPrev();
        next.setPrev(prev);
        prev.setNext(next);
        curr = prev;
    }
    
    @Override
    public String printList(){
        String details = "";
        
        for(int i = 1; i < size; i++){
            Node temp = (Node)get(i);
            details = temp.toString();
        }
        
        return details;
    }
}
