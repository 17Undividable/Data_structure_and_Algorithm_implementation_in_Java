package data_structure.Linear_List_All.Queue;

public interface Queue {
    public int getSize();
    public boolean isEmpty();
    public boolean isFull();
    public void enqueue(Object e);
    public Object dequeue();
    public Object peek();
    public void printQueue();
}
