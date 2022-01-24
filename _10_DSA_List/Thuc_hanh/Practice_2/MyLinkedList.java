package _10_DSA_List.Thuc_hanh.Practice_2;



public class MyLinkedList {
    private int numNodes = 0;
    private Node head;

    public MyLinkedList(Object data){
        head = new Node(data);
    }

    public void printList() {
    }

    public void addFirst(int i) {
    }

    public void add(int i, int i1) {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        // Thêm đối tượng vào vị trí index trong danh sách
        // Tham số đầu vào: vị trí index, đối tượng thêm
        public void add ( int index, Object data) {
            Node temp = head;
            Node holder;

            for ( int i = 0; i < index -1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(data);
            temp.next.next = holder;
            numNodes++;
        }

        public void addFirst(Object data) {
            Node temp = head;
            head = new Node(data);
            head.next = temp;
            numNodes++;
        }

        public Node get(int index) {
            Node temp = head;
            for ( int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.next;
            }

        }

    }
}
