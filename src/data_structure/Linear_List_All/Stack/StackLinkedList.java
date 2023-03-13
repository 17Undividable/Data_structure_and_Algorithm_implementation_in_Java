package data_structure.Linear_List_All.Stack;

import data_structure.Linear_List_All.LinkedList.Doubly_Linked_List.OutOfBoundaryException;
import data_structure.Linear_List_All.LinkedList.Singly_Linked_List_Compare.SLNode;

public class StackLinkedList implements Stack { // 用SLNode实现
    //初始化
    private final int capacity = 8; // 设置容量上限，后续可以选择到上限是报错还是扩容
    private int size;// 当前大小
    SLNode top; // top，top是在变化的，这个top指向链表的head
    // 构造
    public StackLinkedList() {
        size = 0;
    }
    // 常见方法

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(Object e) throws StackEmptyException {
        if(getSize() >= capacity){
            throw new StackEmptyException("错误：超出栈容量");
        }
        SLNode tmp = new SLNode(e, top);
        top = tmp;
        size++;
    }

    @Override
    public Object pop() throws OutOfBoundaryException {
        if(getSize()<1){
            throw new OutOfBoundaryException("错误：栈是空的");
        }
        Object tmp = top.getData();
        top = top.getNext(); // java内存管理会自己删除
        size--;
        return tmp;
    }

    @Override
    public Object peek() throws OutOfBoundaryException{
        if(getSize()<1){
            throw new OutOfBoundaryException("错误：是空栈");
        }
        return top.getData();
    }

    @Override
    public void printStack() {
        if(getSize()==0){
            System.out.println("是空栈");
        }else{
            SLNode currNode = top;
            while(currNode != null){
                System.out.print(currNode.getData()+"\t");
                currNode = currNode.getNext();
            }
            System.out.println();
        }
    }

    @Override
    public StackLinkedList reverse() {
        StackLinkedList newStack = new StackLinkedList(); // 新Stack的头newStack.top
        SLNode currNode = this.top; //遍历原List
        SLNode preNode = new SLNode();// 保存当前结点的地址
        SLNode saveNode = new SLNode(); // 保存当前结点指向结点的地址
        while(currNode != null){
            saveNode.setNext(currNode.getNext());// 保存会在下一轮循环中丢失的值：当前结点原指向地址
            currNode.setNext(preNode.getNext());// 先调整指向
            preNode.setNext(currNode); // 保存当前结点地址
            // 修改新栈信息
            newStack.size++;
            newStack.top = currNode;
            currNode = saveNode.getNext(); // 按原链表顺序执行
        }
        return newStack;
    }
}
