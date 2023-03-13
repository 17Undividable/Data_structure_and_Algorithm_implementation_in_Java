package data_structure.Linear_List_All.Sequence.Vector;

import data_structure.Linear_List_All.LinkedList.Doubly_Linked_List.OutOfBoundaryException;

public class Vector_Array implements Vector{
    private int capacity;
    private int size;
    private Object[] elements;

    public Vector_Array() {
        this(0);
    }

    public Vector_Array(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Object replaceAtRank(int r, Object e) {
        if(elements[r]==null || r>size-1){
            throw new RuntimeException("错误：无此Rank");
        }
        Object tmp = elements[r];
        elements[r] = e;
        return tmp;
    }

    @Override
    public Object insertAtRank(int r, Object e) {
        if(size>=capacity){
            throw new RuntimeException("错误：已满");
        }else if (r>size || r<0){
            throw new RuntimeException("错误：不在当前秩范围内");
        }
        Object original = elements[r];
        Object pre = e;
        Object tmp;
        for(int i = r; i<size; i++){
            tmp = elements[i]; //保存当前值
            elements[i] = pre; //当前值改为之前结点的值
            pre = tmp; //修改pre
        }
        elements[size++] = pre;
        return original;
    }

    @Override
    public Object removeAtRank(int r) {
        if(isEmpty()){
            throw new RuntimeException("错误：空的");
        } else if (r>=size || r<0){
            throw new RuntimeException("错误：不在当前秩范围内");
        }
        Object original = elements[r];
        Object next = elements[r+1];
        Object tmp;
        for(int i=r; i>0; i--){
            tmp = elements[i];
            elements[i] = next;
            next = tmp;
        }
        size--;
        return original;
    }

    @Override
    public Object getAtRank(int r) {
        if(r>=size || r<0){
            throw new RuntimeException("错误：不在当前秩范围内");
        }
        return elements[r];
    }

    @Override
    public void printVector() {
        for(int i=0; i<size; i++){
            System.out.print(elements[i]+"\t");
        }
        System.out.println();
    }
}
