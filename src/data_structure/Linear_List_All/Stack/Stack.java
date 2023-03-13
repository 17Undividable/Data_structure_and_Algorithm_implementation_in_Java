package data_structure.Linear_List_All.Stack;


public interface Stack {
    // 接口只能定义public static final变量，对象共享且不可修改，此处没有需要的此类变量
    // 对于所有堆栈都必要的方法
    public int getSize();
    public boolean isEmpty();
    public void push(Object e);
    public Object pop() throws StackEmptyException;
    public Object peek() throws StackEmptyException; // 读取栈顶元素，不出栈
    public void printStack();
    public Object reverse();
}
