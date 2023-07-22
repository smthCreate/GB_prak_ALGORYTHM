package lek1;

public class HW3_List2chain {
    Node head;
    Node tail;
    public void adding(int value){
        Node node = new Node();
        node.value = value;
        if (head!=null){
            node.previous = tail;
            tail.next = node;
            tail = node;
        } else {
            head = node;
            tail = node;

        }
    }
    public void view_list(){
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.value+" ");
            currentNode = currentNode.next;
        }
    }
    public void revese(){
        Node currentNode = head;
        while(currentNode!=null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (next==null){
                head = currentNode;
            }
            if (previous == null){
                tail = currentNode;
            }
            currentNode=next;
        }
    }
    public class Node{
        int value;
        Node next;
        Node previous;
    }
}
