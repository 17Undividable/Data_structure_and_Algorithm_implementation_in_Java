package data_structure.Linear_List_All.Sequence.Vector;

public interface Vector {
    public int getCapacity();
    public boolean isEmpty();
    public Object getAtRank(int r);
    public Object replaceAtRank(int r, Object e);
    public Object insertAtRank(int r, Object e);
    public Object removeAtRank(int r);
    public void printVector();
}
