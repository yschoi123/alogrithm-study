package list.arrayList;

import list.ListInterface;
public class MyArrayList<E> implements ListInterface<E> {
    private int count;          // 실제 저장된 요소의 개수
    private E[] objectList;     // 객체를 담을 배열

    private int DEFAULT_CAPTACITY =10; // 기본 메모리 할당 크기

    public MyArrayList() {
        objectList = (E[]) new Object[DEFAULT_CAPTACITY];
    }

    public MyArrayList(int size) {
        DEFAULT_CAPTACITY = size;
        objectList = (E[]) new Object[DEFAULT_CAPTACITY];
    }

    @Override
    public void inesrtElement(int index, E data) {
        if(count >= DEFAULT_CAPTACITY) {
            throw new RuntimeException("not enough memory");
        }

        if(index < 0 || index > count) {
            throw new RuntimeException("insert position error");
        }

        if(index == count ) {
            objectList[count++] = data;
            return;
        }

        for(int i= count-1; i>=index; i--) {
            objectList[i+1] = objectList[i];
        }
        objectList[index] = data;
        count++;
    }

    @Override
    public void addElement(E data) {
        if(count >= DEFAULT_CAPTACITY) {
            throw new RuntimeException("not enough memory");
        }

        objectList[count++] = data;
    }

    @Override
    public E removeElement(int index) {
        if(isEmpty()) {
            throw new RuntimeException("no element");
        }

        if(index <0 || index >=count) {
            throw new RuntimeException("remove position error");
        }

        E element = objectList[index];
        for(int i = index; i<count-1; i++) {
            objectList[i] = objectList[i+1];
        }

        count--;
        return element;
    }

    @Override
    public E getElement(int i) {
        return objectList[i];
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public void removeAll() {
        objectList = (E[]) new Object[DEFAULT_CAPTACITY];
        count = 0;
    }

    @Override
    public void printAll() {
        if(isEmpty()) {
            System.out.println("Array is empty");
            return;
        }

        for(int i=0; i<count; i++) {
            System.out.println(objectList[i]);
        }
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
