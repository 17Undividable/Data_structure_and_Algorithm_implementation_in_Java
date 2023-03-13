package data_structure.Linear_List_All.Queue;

public class Main {
    public static void main(String[] args) {
        int capacity = 5;
//        Queue_Array qa = new Queue_Array(capacity);
        Queue_LinkedList qa = new Queue_LinkedList(capacity);
        for(int i=0; i<6*capacity; i++){
            try{
                qa.enqueue(i);

            }catch (data_structure.Linear_List_All.Stack.Main.OutOfCapacity o){
                qa.dequeue();
                qa.enqueue(i);

            }
            qa.printQueue();
        }
    }
}
