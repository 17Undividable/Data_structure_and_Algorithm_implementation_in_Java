package data_structure.Linear_List_All.LinkedList.Doubly_Linked_List;


public class LinkedListIterator implements Iterator {
    private LinkedList list;
    private Node current;
    // 构造
    public LinkedListIterator(LinkedList list){
        this.list = list;
        if (list.isEmpty()){
            current = null;
        }else{
            current = list.first();
        }
    }
    // 移动到第一个元素
    public void first(){
        if(list.isEmpty()){
            current = null;
        }else{
            current = list.first();
        }
    }
    // 移动到最后一个元素
    public void next(){
        if(list.isEmpty()){
            current = null;
        } else{
            current = list.last();
        }
    }
    // 检查迭代器中是否还有剩余的元素
    public boolean isDone(){
        return current==null;
    }
    // 返回当前元素
    public Object currentItem(){
        if(this.isDone()){
            throw new OutOfBoundaryException("错误：已经没有元素");
        }
        return current.getData();
    }


}
