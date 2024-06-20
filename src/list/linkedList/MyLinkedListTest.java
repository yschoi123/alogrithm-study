package list.linkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addElement("A");
        list.addElement("B");
        list.addElement("C");
        list.printAll();
        list.removeElement(1);
        list.printAll();

        list.removeElement(0);
        list.removeElement(0);
//        list.removeElement(10);
        list.printAll();

        list.inesrtElement(0, "A-1");
        list.printAll();
        System.out.println(list.getSize());

        list.removeElement(0);
        list.addElement("ABC");
        list.printAll();
        System.out.println(list.getElement(2));
    }
}
