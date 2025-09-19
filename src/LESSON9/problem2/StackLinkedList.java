package LESSON9.problem2;

public class StackLinkedList {
    Node top;
    public class Node{
        Integer data;
        Node next;

        public Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    public void push(Integer data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    public Integer pop(){
        if(isEmpty()){
            return null;
        }
        int popped = top.data;
        top = top.next;
        return  popped;
    }
    public Integer peek(){

        if(isEmpty()){
            return null;
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
    @Override
    public String toString() {
        if(top == null) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node current = top;
        while(current != null){
            sb.append(current.data);
            if(current.next != null){
                sb.append(",  ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
    public static void main(String[] args){
        StackLinkedList sll  = new StackLinkedList();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.peek();
        System.out.println(sll.peek());
        System.out.println(sll);; // the output: 30 20 10
        System.out.println(sll.pop());
    }
}
