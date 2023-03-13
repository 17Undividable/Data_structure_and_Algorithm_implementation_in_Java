package data_structure.Linear_List_All.Queue.DoubleEndedQueue;

public class Main {
    public static void main(String[] args) {
//        DoubleEndedQueue_Vector dequeVector = new DoubleEndedQueue_Vector(8);
        DoubleEndedQueue_DoublyLinkedList dequeVector = new DoubleEndedQueue_DoublyLinkedList(8);
        for(int i=0; i<4; i++){
            dequeVector.printQueue();
            dequeVector.insertFirst(i);
            dequeVector.insertLast(i);
        }
        dequeVector.printQueue();
    }
}
