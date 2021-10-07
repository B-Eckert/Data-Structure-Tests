import LinkedLists.GeneralSingleNode;

public class GeneralLinkedListQueue<T> {
    GeneralSingleNode<T> rear = null;
    GeneralSingleNode<T> front = null;
    public GeneralLinkedListQueue(){ }
    public void enqueue(T input){
        if(front == null) {
            front = rear = new GeneralSingleNode<>(input);
        }
        else {
            rear.setNextNode(new GeneralSingleNode<>(input));
            rear = rear.getNext();
        }
    }
    public T dequeue(){
        if(front == null)
           return null;
        else {
            GeneralSingleNode<T> n = front;
            front = front.getNext();
            return n.getData();
        }
    }
    public boolean isEmpty(){
        if(front == null)
            return true;
        else
            return false;
    }
}
