package LinkedLists;

public class GeneralSingleNode<T> {
    private T data;
    private GeneralSingleNode nextNode;
    public GeneralSingleNode(T input) {
        data = input;
    }

    public void setNextNode(GeneralSingleNode nextNode) {
        this.nextNode = nextNode;
    }
    public GeneralSingleNode<T> getNext()
    {
        return nextNode;
    }
    public void setData(T input)
    {
        data = input;
    }
    public T getData()
    {
        return data;
    }
}