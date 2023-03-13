package data_structure.Linear_List_All.LinkedList.Doubly_Linked_List;

// 基于双向链表实现的链接表,书上的写法
public class LinkedListDLNode {
    private static final int CAP=8;
    private int capacity;
    private int size;
    private DLNode head;
    private DLNode tail;

    public LinkedListDLNode() {
        this(CAP);
    }

    public LinkedListDLNode(int capacity){ //默认构造无元素双向链表（只有首尾）
        this.capacity = capacity;
        size = 0;
        head = new DLNode();
        tail = head;
    }

    // 查询链表当前规模
    public int getSize(){
        return size;
    }

    // 判断链接表是否为空
    public boolean isEmpty(){
        return size==0;
    }

    // 返回第一个结点
    public Object first() throws OutOfBoundaryException {
        if (this.isEmpty()){
            throw new OutOfBoundaryException("错误：链接表为空");
        }
        return head.getData();
    }

    // 返回最后一个结点
    public Object last() throws OutOfBoundaryException{
        if (this.isEmpty()){
            throw new OutOfBoundaryException("错误：链接表为空");
        }
        return tail.getData();
    }

    // 将e作为第一个元素插入链接表
    public Object insertFirst(Object e){
        Object tmp = head.getData();
        if(size>=capacity){
            throw new OutOfBoundaryException("错误：已满");
        }
        DLNode newNode = new DLNode(e,null,head);
        head.setPrevious(newNode);
        head = newNode;
        size++;
        return tmp;
    }

    // 将e作为最后一个元素插入列别
    public Object insertLast(Object e){
        Object tmp = tail.getData();
        if(size>=capacity){
            throw new OutOfBoundaryException("错误：已满");
        }
        DLNode newNode = new DLNode(e,tail,null);
//        newNode.setData(e);
//        System.out.println(tail.getData());
//        newNode.setPrevious(tail);
        System.out.println(newNode.getPrevious().getData());
        tail.setNext(newNode);
        tail = newNode;
        size++;
        return tmp;
    }

    // 删除首元素
    public Object removeFirst() throws OutOfBoundaryException{
        if(isEmpty()){
            throw new OutOfBoundaryException("已经是空的");
        }
        Object tmp = head.getData();
        head=head.getNext();
        size--;
        return tmp;
    }

    // 删除末元素
    public Object removeLast() throws OutOfBoundaryException{
        if(isEmpty()){
            throw new OutOfBoundaryException("已经是空的");
        }
        Object tmp = tail.getData();
        tail=tail.getPrevious();
        size--;
        return tmp;
    }

    public void printList(){
        DLNode currNode = head;
        while (currNode.getData()!=null){
            System.out.print(currNode.getData()+"\t");
            currNode=currNode.getNext();
        }
        System.out.println();
    }
    // 元素迭代器
//    public Iterator elements(){
//        return new LinkedListIterator(this);
//    }
}
