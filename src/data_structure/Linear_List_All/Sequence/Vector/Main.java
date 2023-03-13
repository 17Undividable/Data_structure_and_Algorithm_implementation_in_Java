package data_structure.Linear_List_All.Sequence.Vector;

public class Main {

    public static void main(String[] args) {
        int capacity = 8;
        Vector_Array va = new Vector_Array(capacity);
        for (int i = 0; i < capacity; i++) {
            int e = i*i;
            va.insertAtRank(i, e);
        }
        va.printVector();
    }
}
