import LinkedLists.GeneralLinkedList;
import LinkedLists.GeneralSingleLinkedList;

public class Main {
    static GeneralLinkedList<Integer> n = new GeneralLinkedList<>();
    static GeneralLinkedList<Double> m = new GeneralLinkedList<>();
    static GeneralLinkedList<String> s = new GeneralLinkedList<>();
    static GeneralLinkedList<Character> c = new GeneralLinkedList<>();
    static GeneralStack<Integer> stacc = new GeneralStack<>();
    static GeneralArrayListStack<Integer> stacc2 = new GeneralArrayListStack<>();
    static GeneralSingleLinkedList<Integer> lincc = new GeneralSingleLinkedList<>();
    static GeneralSingleLinkedList<Integer> lincc2 = new GeneralSingleLinkedList<>();
    public static void main(String[] args)
    {
        for(int i = 0; i <= 25;i++)
            stacc.push(i);
        System.out.println("Top element: " + stacc.peek());
        while(stacc.peek()!=null) {
            System.out.print("[" + stacc.pop() + "]");
        }
        System.out.println("");
        for(int i = 0; i <= 25;i++)
            stacc2.push(i);
        System.out.println("Top element: " + stacc2.peek());
        while(stacc2.size() != 0) {
            System.out.print("[" + stacc2.pop() + "]");
        }
        System.out.println("");
        for(int i = 0; i <= 25; i++) {
            lincc.addToTail(i);
        }
        lincc.print();
        System.out.println("");
        for(int i = 0; i <= 25; i++)
        {
            lincc2.addToHead(i);
        }
        lincc2.print();
        lincc2.removeAtCursor();
        lincc2.moveToElement(0);
        lincc2.removeAtCursor();
        lincc2.moveToElement(16);
        lincc2.removeAtCursor();

        System.out.println("");
        lincc2.print();
        System.out.println("");
    }
}
