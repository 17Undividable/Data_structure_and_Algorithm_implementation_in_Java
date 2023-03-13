package data_structure.Linear_List_All.Queue.DoubleEndedQueue;

import data_structure.Linear_List_All.LinkedList.Doubly_Linked_List.DLNode;
import data_structure.Linear_List_All.LinkedList.Doubly_Linked_List.LinkedListDLNode;

public class DoubleEndedQueue_DoublyLinkedList implements DoubleEndedQueue{
    private static final int CAP=8;
    private int capacity;
    private int size;
    private DLNode front;
    private DLNode rear;
    private LinkedListDLNode DLList;

    public DoubleEndedQueue_DoublyLinkedList() {
        this(CAP);
    }

    public DoubleEndedQueue_DoublyLinkedList(int capacity) {
        this.capacity = capacity;
        size=0;
        front = new DLNode(null, null, null);
        rear = front;
        DLList = new LinkedListDLNode();

    }

    @Override
    public int getSize() {
        return DLList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return DLList.isEmpty();
    }

    @Override
    public Object first() {
        return DLList.first();
    }

    @Override
    public Object last() {
        return DLList.last();
    }

    @Override
    public Object insertFirst(Object e) {
        Object original = DLList.insertFirst(e);
        size++;
        return original;
    }

    @Override
    public Object insertLast(Object e) {
        Object original = DLList.insertLast(e);
        size++;
        return original;
    }

    @Override
    public Object removeFirst() {
        Object original = DLList.removeFirst();
        size--;
        return original;
    }

    @Override
    public Object removeLast() {
        Object original = DLList.removeLast();
        size--;
        return original;
    }

    @Override
    public void printQueue() {
        DLList.printList();
    }
}
