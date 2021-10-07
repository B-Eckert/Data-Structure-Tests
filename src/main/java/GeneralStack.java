import LinkedLists.GeneralNode;

public class GeneralStack<T> {
    public GeneralStack(){ }
    GeneralNode<T> top = null;
    public void push(T input){
        if(top == null) {
            top = new GeneralNode<T>(input);
        }
        else {
            GeneralNode<T> n = new GeneralNode<>(input);
            n.setPrevNode(top);
            top.setNextNode(n);
            top = top.getNext();
        }
    }
    public T pop(){
        if (top == null) {
            return null;
        }
        else{
            T temp = top.getData();
            top = top.getPrev();
            if(top != null)
               top.setNextNode(null);
            return temp;
        }
    }
    public T peek(){
        if(top != null)
            return top.getData();
        else
            return null;
    }
}
