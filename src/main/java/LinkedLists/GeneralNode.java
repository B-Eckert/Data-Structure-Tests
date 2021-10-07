package LinkedLists;

public class GeneralNode<T> {
    private T data;
    private GeneralNode prevNode;
    private GeneralNode nextNode;
    public GeneralNode(T input) {
        data = input;
    }

    public void setNextNode(GeneralNode nextNode) {
        this.nextNode = nextNode;
    }
    public void setPrevNode(GeneralNode nextNode)
    {
        this.prevNode = nextNode;
    }
    public GeneralNode<T> getNext()
    {
        return nextNode;
    }
    public GeneralNode<T> getPrev(){
        return prevNode;
    }
    public void setData(T input)
    {
        data = input;
    }
    public T getData()
    {
        return data;
    }
    public boolean equals(Object n) {
        if(n instanceof GeneralNode) {
            GeneralNode<T> f = (GeneralNode)n;
            if(f.getData() instanceof Object || f.getData() instanceof String) {
                return f.getData().equals(data);
            }
            else {
                return f.getData() == data;
            }
        }

        return false;
    }
}
