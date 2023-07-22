package lek1;
//НЕТ СИТУАЦИИ КОГДА ЕСТЬ ХВОСТ НО НЕТ ГОЛОВЫ
public class List {
    Node head;
//    Node tail;

//    public void adding(int value){
//        Node node = new Node();
//        node.value=value;
//        if (head == null){
//            head = node;
//            tail = node;
//        }else{
//            tail.next=node;
//            node.previous = tail;
//            tail = node;
//        }
//    }
//    public void add(int value, Node node){
//        Node next  = node.next;
//        Node currentNode = new Node();
//        currentNode.value = value;
//        currentNode.previous = node;
//        node.next = currentNode;
//        if(next == null ){
//            tail = currentNode;
//        }else{
//        next.previous = currentNode;
//        currentNode.next = next;}
//    }
//    public void delete(Node node){
//        Node previous = node.previous;
//        Node next = node.next;
//        if(previous!=null && next!=null){
//            previous.next = next;
//            next.previous = previous;
//        } else{
//            if (next==null){
//                previous.next=null;
//            }
//            if (previous==null){
//                next.previous=null;
//            }
//        }
//    }
//    public void u_turn(){
//        Node currentNode= head;
//        while (currentNode!=null){
//            Node next = currentNode.next;
//            Node previous = currentNode.previous;
//            currentNode.next = previous;
//            currentNode.previous = next;
//            if (previous == null){
//                tail = currentNode;
//            }
//            if (next==null){
//                head = currentNode;
//            }
//            currentNode = next;
//
//        }
//
//    }
//    public Node find(int value){
//        Node currentNode = head;
//        while (currentNode!=null){
//            if (currentNode.value==value){
//                return currentNode;
//            }
//            currentNode = currentNode.next;
//        }
//        return null;
//    }
    //Work with stack
    public void push(int value){
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }
    public Integer pop(){
        Integer result = null;
        if (head!=null){
            result =head.value;
            head = head.next;
        }
        return result;
    }
    //Work with stack

    public void revert(){
        if (head!=null && head.next!=null){
            Node temp = head;
            revert(head.next,head);
            temp.next=null;
        }
    }
    private void revert(Node currentnode, Node previous){
        if (currentnode.next==null){
            head = currentnode;
        } else{
            revert(currentnode.next,currentnode);
        }
        currentnode.next = previous;
        previous.next = null;
    }
    public class Node{
        int value;
        Node next;
//        Node previous;
    }
}
