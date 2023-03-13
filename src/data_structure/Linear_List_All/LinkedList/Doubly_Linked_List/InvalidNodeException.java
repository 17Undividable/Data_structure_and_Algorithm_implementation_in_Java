package data_structure.Linear_List_All.LinkedList.Doubly_Linked_List;

public class InvalidNodeException extends RuntimeException{
    public InvalidNodeException(String err){
        super(err);
    }
}
/* p ==null
   p 不在链接表
   p已经是第一个存有数据的结点（getPre时）
   p已经是最后一个；
 */
