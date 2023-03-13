package data_structure.Linear_List_All.Queue;

import data_structure.Linear_List_All.LinkedList.Singly_Linked_List_Compare.SLNode;
import data_structure.Linear_List_All.Stack.Main;

public class Queue_LinkedList implements Queue{ // 单链表实现Queue
    private static final int CAP = 8; // 默认队列大小
    private int capacity; // 实际容量大小
    private int size;
    SLNode front;
    SLNode rear;

    public Queue_LinkedList() {
        this(CAP);
    }

    public Queue_LinkedList(int CAP) {
        this.capacity = CAP;
        size = 0;
        front = new SLNode();
        rear = front;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean isFull() {
        return size==capacity;
    }

    @Override
    public void enqueue(Object e) throws Main.OutOfCapacity { //保留了空尾写法
        if(isFull()){
            throw new Main.OutOfCapacity("满了");
        }
        SLNode tmp = new SLNode();
        rear.setData(e); //tmp.setData(e); //这一句替换一下就变成了空头写法,还要改后边的出队
        rear.setNext(tmp);
        rear = tmp;
        size++;
    }

    @Override
    public Object dequeue() throws Main.OutOfCapacity {
        if(isEmpty()){
            throw new Main.OutOfCapacity("空的");
        }
        Object tmp = front.getData(); // front.getNext().getData();
        front = front.getNext();  // front.setNext(tmp.getNext());
        size--;
        return tmp;
    }

    @Override
    public Object peek() throws Main.OutOfCapacity {
        if(isEmpty()){
            throw new Main.OutOfCapacity("空的");
        }
        return front.getData();
    }

    @Override
    public void printQueue() throws Main.OutOfCapacity {
        if(isEmpty()){
            throw new Main.OutOfCapacity("空的");
        }
        SLNode currNode = front;
        while(currNode != null){
            System.out.print( currNode.getData() + "\t");
            currNode = currNode.getNext();
        }
        System.out.println();
    }
}
