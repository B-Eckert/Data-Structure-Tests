
public class GeneralBinaryTreeNode<T> {
    private T data;
    private GeneralBinaryTreeNode left = null;
    private GeneralBinaryTreeNode right = null;

    public GeneralBinaryTreeNode(T input) {
        data = input;
    }

    public void setLeft(GeneralBinaryTreeNode newLeft) {
        left = newLeft;
    }
    public GeneralBinaryTreeNode<T> getLeft()
    {
        return left;
    }

    public void setRight(GeneralBinaryTreeNode newRight) {
        right = newRight;
    }
    public GeneralBinaryTreeNode<T> getRight()
    {
        return right;
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