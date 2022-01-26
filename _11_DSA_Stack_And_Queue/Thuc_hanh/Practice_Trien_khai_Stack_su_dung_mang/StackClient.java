package _11_DSA_Stack_And_Queue.Thuc_hanh.Practice_Trien_khai_Stack_su_dung_mang;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1. Size of stack after push operation: " + stack.size());
        System.out.println("2. Pop element from stack: ");

        System.out.println(stack.pop());
        System.out.println("\n3. Size of stack after pop operation: " + stack.size());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("\n3. Size of stack after pop operation: " + stack.size());
    }
}
