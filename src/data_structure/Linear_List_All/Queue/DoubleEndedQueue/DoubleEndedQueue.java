package data_structure.Linear_List_All.Queue.DoubleEndedQueue;

public interface DoubleEndedQueue {

    public int getSize();
    public boolean isEmpty();
    public Object first();
    public Object last();
    public Object insertFirst(Object e);
    public Object insertLast(Object e);
    public Object removeFirst();
    public Object removeLast();
    public void printQueue();

}
