package LinkedLists;

import sun.java2d.loops.FillRect;

public class GeneralSingleLinkedList<T> {
    private GeneralSingleNode<T> head = null;
    private GeneralSingleNode<T> tail = null;
    private GeneralSingleNode<T> cursor = null;

    public GeneralSingleLinkedList(){ }
    //O(1)
    public void addToTail(T input){
        if(head == null) {
            cursor = head = tail = new GeneralSingleNode<>(input);
        }
        else{
            tail.setNextNode(new GeneralSingleNode(input));
            tail = tail.getNext();
            cursor = tail;
        }
    }
    public void addToHead(T input){
        if(head == null) {
            cursor = head = tail = new GeneralSingleNode<>(input);
        }
        else{
            GeneralSingleNode<T> n = new GeneralSingleNode<>(input);
            n.setNextNode(head);
            head = n;
            cursor = head;
        }
    }
    public void insertAfterCursor(T input){
        if(cursor == null){
            if(head == null) {
                cursor = head = tail = new GeneralSingleNode<>(input);
            }
            else
                return;
        }
        else {
            GeneralSingleNode<T> n = new GeneralSingleNode<>(input);
            n.setNextNode(cursor.getNext());
            cursor.setNextNode(n);
            cursor = cursor.getNext();
        }//sidenote: 'we're going to east' - dovid
    }
    public boolean moveToElement(T element)
    {
        if(head != null) {
            cursor = head;
        }
        else {
            return false;
        }
        if(element instanceof Object || element instanceof String) {
            while(cursor != null) {
                if(cursor.getData().equals(element)) {
                    return true;
                }
                cursor = cursor.getNext();
            }
        }
        else
        {
            while(cursor != null) {
                if(cursor.getData() == element) {
                    return true;
                }
                cursor = cursor.getNext();
            }
        }
        return false;
    }
    public void print() {
        if (head != null){
            cursor = head;
            while(cursor != null)
            {
                System.out.print("[" + cursor.getData() + "]");
                cursor = cursor.getNext();
            }
            cursor = head;
        }
    }
    public T removeAtCursor(){
        if(cursor == null)
            return null;
        T data = cursor.getData();
        if(cursor == head) {
            if(head.getNext() == null) {
                head = null;
            }
            else {
                head = head.getNext();
                cursor = head;
            }
        }
        else {
            GeneralSingleNode n = head;
            while(n.getNext() != cursor) {
                n = n.getNext();
            }
            if (cursor.getNext() != null) {
                cursor = cursor.getNext();
                n.setNextNode(cursor);
            }
            else if (cursor.getNext() == null) {
                cursor = n;
                cursor.setNextNode(null);
            }
            return data;
        }
        return data;
    }
    public boolean isEmpty(){
        if(head == null || tail == null || cursor == null){
            boolean h =  head == null;
            boolean t = tail  == null;
            boolean c = cursor  == null;
            System.out.println((h + " " + t + " " + c));
            return true;
        }
        return false;
    }
}
