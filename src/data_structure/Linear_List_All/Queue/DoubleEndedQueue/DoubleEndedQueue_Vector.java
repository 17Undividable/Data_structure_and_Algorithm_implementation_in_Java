package data_structure.Linear_List_All.Queue.DoubleEndedQueue;

import data_structure.Linear_List_All.Sequence.Vector.Vector_Array;

public class DoubleEndedQueue_Vector implements DoubleEndedQueue {
    private static final int CAP = 8; // 默认capacity
    private int capacity;
    private int size;
    private int front;
    private int rear;
    private Vector_Array vector;

    public DoubleEndedQueue_Vector() {
        this(CAP);
    }

    public DoubleEndedQueue_Vector(int capacity) {
        this.capacity = capacity;
        vector = new Vector_Array(capacity);
        this.size = this.rear = this.front =0;

    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public Object first() {
        return vector.getAtRank(front);
    }

    @Override
    public Object last() {
        return vector.getAtRank(rear);
    }

    @Override
    public Object insertFirst(Object e) {
        Object tmp = vector.insertAtRank(front, e);
        this.size++;
        rear = this.size-1;
        return tmp;
    }

    @Override
    public Object insertLast(Object e) {
        Object tmp = vector.insertAtRank(rear+1, e);
        this.size++;
        rear = this.size-1;
        return tmp;
    }

    @Override
    public Object removeFirst() {
        Object tmp = vector.removeAtRank(front);
        this.size--;
        rear = this.size-1;
        return tmp;
    }

    @Override
    public Object removeLast() {
        Object tmp = vector.removeAtRank(rear);
        this.size--;
        rear = this.size-1;
        return tmp;
    }

    @Override
    public void printQueue() {
        vector.printVector();
    }
}
