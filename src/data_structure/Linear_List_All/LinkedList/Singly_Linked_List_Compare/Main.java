package data_structure.Linear_List_All.LinkedList.Singly_Linked_List_Compare;

public class Main {
    public static void main(String[] args) {
        SLtest();

    }

    public static void SLtest(){
        /* **************************** 单链表 ****************************** */
        System.out.println("测试单链表");
        SinglyLinkedList list = new SinglyLinkedList(); // 新建SL
        for(int i=0; i < 5; i++){ // 添加结点
            list.addNode(i*i);
        }
        //getSize()
        System.out.println(list.getSize());;
        //isEmpty()
        if (list.isEmpty()){
            System.out.println("list是空链");
        }else {
            System.out.println("list不是空链接");
        }
        //contains(e)
        System.out.println(list.contains(2));
        System.out.println(list.contains(4));
        //indexOf(e)
        System.out.println(list.indexOf(3));
        System.out.println(list.indexOf(4));
        //insert
        list.insert(2, 25);
        list.insert(6, 25);
        //insertBefore(p, e)
        System.out.println(list.insertBefore(125, 36));
        System.out.println(list.insertBefore(0, -1));
        //insertAfter(p, e)
        System.out.println(list.insertAfter(9, 49));
        System.out.println(list.insertAfter(16, 64));
        //remove(i)
        //remove(e)
        //replace(i, e)
        //get(i)
        System.out.println("!!!!!!!!!!!!!");
        System.out.println(list.getSize());
        list.printList(); // 查看
        // 反转链表
//        list.reverse().printList();

    }

    public static void DLtest(){
        /* **************************** 双向链表 ****************************** */
        System.out.println("测试双向链表");
    }
}

