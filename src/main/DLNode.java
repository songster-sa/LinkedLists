package main;

public class DLNode {

    private int data;
    private DLNode prev;
    private DLNode next;

    public DLNode(int data, DLNode prev, DLNode next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLNode getPrev() {
        return prev;
    }

    public void setPrev(DLNode prev) {
        this.prev = prev;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }
}
