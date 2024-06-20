package list.arrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        arrayList.addElement(20);
        arrayList.addElement(40);
        arrayList.addElement(60);
        arrayList.inesrtElement(1, 30);
        arrayList.printAll();

        System.out.println("============");
        arrayList.removeElement(2);
        arrayList.printAll();
        System.out.println("============");
        arrayList.addElement(10);
        arrayList.printAll();
        System.out.println("===========");
//        arrayList.removeElement(5);
        arrayList.removeAll();
        arrayList.printAll();
    }
}
