import java.util.ArrayList;

public class GeneralArrayListStack<T> {
    public ArrayList<T> content = new ArrayList<>();
    public int curIndex = -1;
    public GeneralArrayListStack(){}
    public void push(T input){
        content.add(input);
        curIndex++;
    }
    public T pop(){
        if(curIndex >= 0){
            return content.remove(curIndex--);
        }
        return null;
    }
    public T peek(){
        if(curIndex >= 0){
            return content.get(curIndex);
        }
        return null;
    }
    public int size(){
        return curIndex + 1;
    }
}
