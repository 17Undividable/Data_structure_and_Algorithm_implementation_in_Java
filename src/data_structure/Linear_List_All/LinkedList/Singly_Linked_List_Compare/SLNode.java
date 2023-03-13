package data_structure.Linear_List_All.LinkedList.Singly_Linked_List_Compare;

import data_structure.Linear_List_All.LinkedList.Doubly_Linked_List.Node;

// 单链表结点定义
public class SLNode implements Node {
    private Object element;
    private SLNode next;

    public SLNode(){
        this(null, null); // 通过this来调用另一个构造函数
    }
    public SLNode(Object ele, SLNode next){
        this.element = ele;
        this.next = next;
    }
    public SLNode getNext(){
        return next;
    }
    public void setNext(SLNode next){
        this.next = next;
    }
    /****************Methods of Node Interface*******************/
    public Object getData(){
        return element;
    }
    public void setData(Object obj){
        element = obj;
    }
}

/*这是一个 Java 类，它实现了 Node 接口。该类包含了以下几个成员变量和函数：

成员变量：
element：表示该节点存储的数据，类型为 Object。
next：表示该节点的下一个节点，类型为 SLNode。
构造函数：
SLNode()：无参构造函数，将 element 和 next 都设置为 null。
SLNode(Object ele, SLNode next)：带参构造函数，接收一个 Object 类型的数据和一个 SLNode 类型的下一个节点。
成员函数：
getNext()：返回该节点的下一个节点。
setNext(SLNode next)：设置该节点的下一个节点。
getData()：从 Node 接口中继承的函数，返回该节点存储的数据。
setData(Object obj)：从 Node 接口中继承的函数，设置该节点存储的数据。
该类的作用是定义一个单向链表节点的基本属性和行为。可以使用该类来创建一个单向链表，每个节点都包含了一个存储的数据和指向下一个节点的指针。

*/