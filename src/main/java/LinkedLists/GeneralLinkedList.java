package LinkedLists;

public class GeneralLinkedList<T> {
    GeneralNode<T> head = null;
    GeneralNode<T> tail = null;
    GeneralNode<T> cursor = null;
    private int length = 0;
    private final int CHAR_DIFFERENCE = 32;
    public GeneralLinkedList() { }
    public void addToTail(T element) {
        addToTail(new GeneralNode<>(element));
    }
    public void addToTail(GeneralNode<T> element)
    {
        if(head == null) {
            head = element;
            tail = head;
            cursor = element;
            length++;
        }
        else {
            tail.setNextNode(element);
            element.setPrevNode(tail);
            tail = element;
            cursor = tail;
            length++;
        }
    }
    public void insertAtCursor(T element){
        insertAtCursor(new GeneralNode<>(element));
    }
    public void insertAtCursor(GeneralNode<T> node)
    {
        if(head != null && cursor != null){
            if(cursor == head)
            {
                head.setPrevNode(node);
                node.setNextNode(head);
                head = node;
                length++;
            }
            else if(cursor == tail)
            {
                node.setPrevNode(tail.getPrev());
                tail.getPrev().setNextNode(node);
                node.setNextNode(tail);
                tail.setPrevNode(node);
                length++;
            }
            else
            {
                node.setNextNode(cursor);
                node.setPrevNode(cursor.getPrev());
                cursor.getPrev().setNextNode(node);
                cursor.setPrevNode(node);
                cursor = node;
                length++;

            }
        }
    }
    public void insertAtPosition(int pos, T element)
    {
        if(pos <= length && pos > 0)
        {
            cursor = head;
            int counter = 0;
            while(counter <= pos)
            {
                cursor = cursor.getNext();
            }
            insertAtCursor(new GeneralNode<>(element));
        }
    }
    public boolean addSortedly(T element) {
        return addSortedly(new GeneralNode<>(element));
    }
    public boolean addSortedly(GeneralNode<T> element) {
        if(element.getData() instanceof Integer || element.getData() instanceof Double || element.getData() instanceof Character) {
            double data = 0;
            if(element.getData() instanceof Integer) {
                data = (int) element.getData();
            }
            else if(element.getData() instanceof Character)
            {
                data = (char) element.getData();
            }
            else {
                data = (double) element.getData();
            }
            if (head == null) {
                head = element;
                tail = head;
                cursor = head;
                length++;
                return true;
            } else {
                cursor = head;
                while (cursor != null) {
                    if(cursor.getData() instanceof Integer) {
                        if (data > (int) cursor.getData()) {
                            cursor = cursor.getNext();
                        } else if (data <= (int) cursor.getData()) {
                            insertAtCursor(element);
                            return true;
                        }
                        if(cursor == tail && data > (int) cursor.getData())
                        {
                            addToTail(element);
                            return true;
                        }
                    }
                    else if(cursor.getData() instanceof Character)
                    {
                        if(data >= 97 && (char)cursor.getData() <= 90) {
                            data -= 32;
                        }
                        if((char) cursor.getData() >= 97 && data <= 90) {
                            data += 32;
                        }
                        if (data > (char) cursor.getData() + 1 - 1) {
                            cursor = cursor.getNext();
                        } else if (data <= (char) cursor.getData() + 1 - 1) {
                            insertAtCursor(element);
                            return true;
                        }
                        if(cursor == tail && data > (char) cursor.getData() + 1 - 1)
                        {
                            addToTail(element);
                            return true;
                        }
                    }
                    else
                    {
                        if(data > (double) cursor.getData()){
                            cursor = cursor.getNext();
                        }
                        else if(data <= (double) cursor.getData())
                        {
                            insertAtCursor(element);
                            return true;
                        }
                        if(cursor == tail && data > (double) cursor.getData())
                        {
                            addToTail(element);
                            return true;
                        }
                    }
                }
            }
        }
        else if(element.getData() instanceof String)
        {
            if(head == null) {
                head = element;
                tail = head;
                cursor = head;
                length++;
                return true;
            }
            else
            {
                cursor = head;
                char[] x = ((String) element.getData()).toCharArray();
                while(cursor != null){
                    char[] f = ((String) cursor.getData()).toCharArray();
                    int i = 0;
                    boolean loop = true;
                    if(((String) element.getData()).toLowerCase().equals(((String) cursor.getData()).toLowerCase())){
                        insertAtCursor(element);
                        return true;
                    }
                    while(loop){
                        if(x[i] >= 97 && f[i] <= 90) {
                            x[i] -= 32;
                        }
                        if(f[i] >= 97 && x[i] <= 90){
                            x[i] += 32;
                        }
                        if(x[i] > f[i]) {
                            loop = false;
                        }
                        else if(x[i] < f[i])
                        {
                            insertAtCursor(element);
                            return true;
                        }
                        else{
                            i++;
                        }
                        if(cursor == tail && x[i] > f[i]) {
                            addToTail(element);
                            return true;
                        }
                    }
                    cursor = cursor.getNext();
                }
            }
        }
        return false;
    }
    public void removeAtCursor(){
        if(cursor != null) {
            cursor.getNext().setPrevNode(cursor.getPrev());
            cursor.getPrev().setNextNode(cursor.getNext());
            cursor = cursor.getNext();
            length--;
        }
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
            System.out.println("\nLength:" + length);
        }
    }
    public String toString(){
        String end = "";
        if (head != null){
            cursor = head;
            while(cursor != null)
            {
                end += ("[" + cursor.getData() + "]");
                cursor = cursor.getNext();
            }
            end += ("\nLength:" + length + "\n");
        }
        else
            end = "Empty.";
        return end;
    }
}
