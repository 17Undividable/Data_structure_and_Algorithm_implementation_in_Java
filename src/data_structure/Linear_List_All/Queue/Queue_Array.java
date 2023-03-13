package data_structure.Linear_List_All.Queue;

import data_structure.Linear_List_All.Stack.Main;

public class Queue_Array implements Queue{ // 用数组实现顺序存储的Queue，循环array，提高效率 //没有用数学方法实现，时间复杂度是一样的
    // 成员变量
    private Object[] elements;
    private int front;
    private int rear;
    private int size; //当前实际存储元素数量
    private static final int CAP = 8; // 默认队列容量上限
    private int capacity; // 实际队列.length

    public Queue_Array() {
        this(CAP);
    }

    public Queue_Array(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        int front = rear = 0;

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
    public void enqueue(Object e) throws Main.OutOfCapacity {
        if(isFull()){
            throw new Main.OutOfCapacity("已满");
        }else{
            size++;
            if(rear==capacity-1) {
                elements[rear] = e;
                rear = 0;
            }else {
                elements[rear++] = e;
            }
        }

    }

    @Override
    public Object dequeue() throws Main.OutOfCapacity {
        if(isEmpty()){
            throw new Main.OutOfCapacity("空表");
        }else {
            size--;
            if(front==capacity-1){
                front = 0;
                return elements[capacity-1];
            }else {
                return elements[front++];
            }
        }
    }

    @Override
    public Object peek() throws Main.OutOfCapacity {
        if(isEmpty()){
            throw new Main.OutOfCapacity("空表");
        }else{
            return elements[rear];
        }
    }

    @Override
    public void printQueue() {
        int tmp = front;
        for(int i=size; i>0; i--){
            if(tmp == capacity-1){
                tmp=0;
                System.out.print(elements[capacity-1] +"\t");
            } else {
                System.out.print(elements[tmp] + "\t");
                tmp++;
            }
        }
        System.out.println();
    }
}
