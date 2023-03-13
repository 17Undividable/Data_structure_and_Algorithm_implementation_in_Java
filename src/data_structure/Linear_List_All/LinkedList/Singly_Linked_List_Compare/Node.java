package data_structure.Linear_List_All.LinkedList.Singly_Linked_List_Compare;

public interface Node {
    // 获取结点数据(读)
    public Object getData();
    // 设置结点数据域（写）
    public void setData(Object obj);
}

/*
这是一个 Java 接口，名为 Node。该接口包含了两个函数：

getData()：用于获取节点存储的数据，返回类型为 Object。
setData(Object obj)：用于设置节点存储的数据，传入参数为 Object 类型。

该接口的作用是定义了一个节点的基本属性和行为，任何实现了该接口的类都必须实现这两个函数，以便能够对节点的数据进行读写操作。
这样，在实现单向链表等数据结构时，可以通过实现该接口来定义链表节点的属性和行为，使得代码更加规范和易于维护。

*/
