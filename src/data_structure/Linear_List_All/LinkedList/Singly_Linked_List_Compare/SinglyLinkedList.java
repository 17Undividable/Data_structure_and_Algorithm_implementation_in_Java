package data_structure.Linear_List_All.LinkedList.Singly_Linked_List_Compare;

// 自己写的，单链表的实现，这里有个缺点，相比书上写法，没有规范链表类的接口，容易造成自由改动
public class SinglyLinkedList {
    private SLNode head;

    //构造函数，直接创建head node，head不保存信息，只提供指针
    public SinglyLinkedList() {
        head = null;
    }

    // 添加结点
    public void addNode(Object data) {
        SLNode newNode = new SLNode(data, null);
        if (head == null) {
            head = newNode;
        } else {
            SLNode currNode = head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            currNode.setNext(newNode);
        }
    }

    //输出list
    public void printList() {
        SLNode currNode = this.head;
        while (currNode != null) {
            System.out.print(currNode.getData() + " ");
            currNode = currNode.getNext();
        }
        System.out.println();
    }

    // 输出listsize
    public int getSize(){
        SLNode currNode = this.head; //由于head是private字段，所以这里不加this也行
        int count = 0;
        while(currNode != null){
            count ++;
            currNode = currNode.getNext();
        }
        if (count == 0){
            return -1;
        }else{
            return count;
        }
    }

    // 判断list是否为空
    public boolean isEmpty(){
        boolean flag = true; // 默认是空表
        SLNode currNode = this.head;
        while(currNode != null){
            flag = false;
            currNode = currNode.getNext();
        }
        return  flag;
    }

    // 判断是否包含元素e
    public boolean contains(Object e){
        boolean flag = false; //默认不包含
        SLNode currNode = head;
        while(currNode != null){
            if (currNode.getData() != e){

            }else{
                return true;
            }
            currNode = currNode.getNext();
        }
        return flag;
    }

    // e的index
    public int indexOf(Object e){
        int i = 0;
        SLNode currNode = this.head ;
        while(currNode != null){
            if (e == currNode.getData()){
                return i;
            }else {
                i++;
            }
            currNode = currNode.getNext();
        }
        return -1;
    }

    // i处插入e
    public void insert(int i, Object e){
        int count=0;
        SLNode currNode = head;
        try {
            while(currNode != null){
                if(count == i){
                    SLNode tmp = new SLNode();
                    tmp.setData(e);
                    tmp.setNext(currNode.getNext());
                    currNode.setNext(tmp);
                    return;
                }
                count++;
                currNode = currNode.getNext();
            }
            throw new Exception("index out of range");
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    // p前插入e
    public boolean insertBefore(Object p, Object e){
        SLNode previous = head;
        SLNode currNode = head;
        while(currNode != null){
            if (currNode.getData() == p){
                SLNode tmp = new SLNode();
                if (currNode == head){ //如果是第一个结点,没有前驱
                    tmp.setData(head.getData());
                    head.setData(e);
                    tmp.setNext(head.getNext());
                    head.setNext(tmp);
                    return true;
                }else {
                    tmp.setData(e);
                    tmp.setNext(currNode);
                    previous.setNext(tmp);
                    return true;
                }
            }
            previous = currNode;
            currNode = currNode.getNext();
        }
        return false;
    }

    // p后插入e
    public boolean insertAfter(Object p, Object e){
        SLNode currNode = head;
        while(currNode != null){
            if (currNode.getData() == p){
                SLNode tmp = new SLNode();
                if (currNode.getNext() == null){ //如果是最后一个结点,没有后驱
                    tmp.setData(e);
                    currNode.setNext(tmp);
//                    System.out.println(tmp.getNext()); // 测试是不是完成了最后结点
//                    System.out.println("说完了");
                    return true;
                }else {
                    tmp.setData(e);
                    tmp.setNext(currNode.getNext());
                    currNode.setNext(tmp);
                    return true;
                }
            }
            currNode = currNode.getNext();
        }
        return false;
    }

    // 反转链表
    public SinglyLinkedList reverse(){
        SinglyLinkedList newList = new SinglyLinkedList();
        if (this.isEmpty() || this.getSize()==1 ){
            return this;
        }
        return newList;
    }


    public static void main(String[] args) {
        System.out.println("新建了一个Linked List对象");
    }
}

/*
该代码定义了一个 LinkedList 类，包含了一个 SLNode 类型的头结点 head 和以下几个成员函数：

LinkedList()：无参构造函数，将头结点设置为 null。
addNode(Object data)：向链表中添加一个节点，传入参数为节点存储的数据。
printList()：打印链表中所有节点的数据。
在 main 函数中，我们创建了一个 LinkedList 类的对象 list，并依次调用 addNode 函数向链表中添加节点。最后，我们调用 printList 函数打印链表中所有节点的数据。

运行该代码，输出结果为：1 2 3 4
 */