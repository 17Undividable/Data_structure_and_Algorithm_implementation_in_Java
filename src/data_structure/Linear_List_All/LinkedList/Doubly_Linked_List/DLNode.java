package data_structure.Linear_List_All.LinkedList.Doubly_Linked_List;

public class DLNode implements Node{
    private Object element;
    private DLNode previous;
    private DLNode next;

    //构造函数
    public DLNode() {
        this(null,null,null); // 一定要写这一句，多个构造函数,用this调用第二个函数初始化成员变量
    }
    public DLNode(Object element, DLNode previous, DLNode next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    //接口方法
    @Override
    public Object getData() {
        return this.element;
    }

    public void setData(Object element){
        this.element = element;
    }

    //方法
    public DLNode getNext(){
        return next;
    }
    public void setNext(DLNode next){
        this.next = next;
    }
    public DLNode getPrevious(){
        return this.previous;
    }
    public void setPrevious(DLNode previous){
        this.previous = previous;
    }
}
