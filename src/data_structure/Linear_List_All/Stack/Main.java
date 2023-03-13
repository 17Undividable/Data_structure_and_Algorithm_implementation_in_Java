package data_structure.Linear_List_All.Stack;

public class Main {
    // 初始化

    public static void main(String[] args) { // 静态方法，不能直接引用非静态变量
//        Stack_Linked_Test(); // 用反转单链栈测试栈功能是否完好
        Stack_Array_Test(); //
//        baseConverse(122); //堆栈应用1：进制转换
//        System.out.println(bracketMatch("{(){}})")); //堆栈应用2：括号匹配检测
    }

    private static void Stack_Linked_Test(){
        System.out.println("用反转单链栈测试栈功能是否完好");
        StackLinkedList SL1 = new StackLinkedList();
        for(int i = 0; i<8; i++)
            SL1.push(i*i);
        SL1.printStack();

        System.out.println("反转后");
        StackLinkedList SLnew = SL1.reverse();
        SLnew.printStack();
    }
    private static void Stack_Array_Test(){
        System.out.println("用反转单链栈测试栈功能是否完好");
        StackArrayList SL1 = new StackArrayList();
        for(int i = 0; i<8; i++)
            SL1.push(i*i);
        SL1.printStack();
        System.out.println("反转后");
        SL1.reverse().printStack();
    }
    private static StackLinkedList baseConverse(int base10){
        System.out.println("堆栈应用1：进制转换");
        System.out.print(base10+"的8进制是：");
        StackLinkedList base8 = new StackLinkedList();
        int tmp = base10;
        while(tmp != 0){
            base8.push(tmp % 8);
            tmp = tmp /8;
        }
        while(!base8.isEmpty()){
            System.out.print(base8.pop());
        }
        System.out.println();
        return base8;
    }
    private static boolean bracketMatch(String s){
        System.out.println("堆栈应用2：括号匹配检测");
        System.out.print(s+"括号是否匹配：");
        StackLinkedList tmp = new StackLinkedList();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            switch(c){
                case '{':
                case '[':
                case '(': {
                    tmp.push(c);
                    break;
                }
                case ')': {
                    if(tmp.isEmpty()){
                        return false;
                    } else if((Character) tmp.peek() =='('){
                        tmp.pop();
                    } else {
                        return false;
                    }
                    break;
                }
                case ']':{
                    if(tmp.isEmpty()){
                        return false;
                    } else if((Character)tmp.peek() =='['){
                        tmp.pop();
                    } else {
                        return false;
                    }
                    break;
                }
                case '}':{
                    if(tmp.isEmpty()){
                        return false;
                    } else if((Character)tmp.peek() =='{'){
                        tmp.pop();
                    } else {
                        return false;
                    }
                    break;
                }
            }
        }
        if(tmp.isEmpty()){
            return true;
        } else{
            return false;
        }
    }



    public static class OutOfCapacity extends RuntimeException{
        public OutOfCapacity(String err){
            super(err);
        }
    }
}
