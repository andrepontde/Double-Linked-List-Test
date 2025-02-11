/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testappweek5;

/**
 *
 * @author AndrePontDeAnda
 */
public class Node {

    private Object element;
    private Node next;
    private Node prev;

    public Node(Object e, Node n, Node p) {
        element = e;
        next = n;
        prev = p;
    }

    public Object getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node{" + "element=" + element + ", next=" + next + ", prev=" + prev + '}';
    }

}
