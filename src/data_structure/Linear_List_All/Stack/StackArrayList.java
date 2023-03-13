package data_structure.Linear_List_All.Stack;

import data_structure.Linear_List_All.LinkedList.Singly_Linked_List_Compare.SLNode;

// 用数组实现栈，即顺序存储实现
public class StackArrayList implements Stack {

    private int size; // 栈中含有的元素数量
    private static final int CAP = 8; // 堆栈中最大容量，写死，复用这个类的全部都是8
    private int capacity; // 栈的实际容量
    private Object[] elements; // 数据元素数组，真正保存数据的栈
    private int top; // 栈顶指针，由于是数组，所以实际保存的是index，即整数;这个top其实是数组实际存储尾巴元素的下标


    public StackArrayList() {
        this(CAP);
    }

    public StackArrayList(int capacity) {
        this.capacity = capacity;
        top = -1;
        size = 0;
        elements = new Object[capacity];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }


    public void push(Object e){ //不可变栈的大小
        if(getSize() >= elements.length){ // .length是声明长度
            expendSpace();
        }
        elements[++top] = e;
        size++;
    }
    private void expendSpace(){
        Object[] tmp = new Object[elements.length * 2];
        for (int i=0; i< elements.length; i++){
            tmp[i] = elements[i];
        }
        elements = tmp;
    }

    @Override
    public Object pop() throws StackEmptyException {
        if (this.isEmpty()){
            throw new StackEmptyException("错误：stack是空的");
        }
        Object tmp = elements[top--];
        size--;
        return tmp;
    }

    @Override
    public Object peek() throws StackEmptyException {
        if(getSize()<1){
            throw new StackEmptyException("错误：空栈");
        }
        return elements[top];
    }

    public void printStack() throws StackEmptyException{
        if(getSize()<1){
            throw new StackEmptyException("错误：空栈");
        }
        for(int i=0; i<getSize(); i++){
            System.out.print(elements[i] + "\t");
        }
        System.out.println();
    }

    public StackArrayList reverse() {
        StackArrayList newStack = new StackArrayList();
        if (isEmpty()){
            throw new RuntimeException("是空的");
        }
        StackArrayList tmp = this;
        while (! tmp.isEmpty()){ // 从先进的开始读
            newStack.push(tmp.pop());
        }
        return newStack;
    }
}
