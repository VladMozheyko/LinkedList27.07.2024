//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       LinkedList linkedList = new LinkedList();

       linkedList.add(new Item(1));
        linkedList.add(new Item(2));
        linkedList.add(new Item(3));
        linkedList.add(new Item(4));
        linkedList.add(new Item(5));
        linkedList.showList();
        try {
            linkedList.addToPosition(new Item(9), 30);
        } catch (ListException e) {

        }
        linkedList.add(new Item(6));
        linkedList.add(new Item(7));
        linkedList.showList();
    }
}