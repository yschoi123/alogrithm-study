package list.linkedList;

import list.ListInterface;

public class MyLinkedList<E> implements ListInterface<E> {

    private ListNode head; // 첫번째 노드를 가리킴
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    @Override
    public void inesrtElement(int pos, E data) {
        ListNode<E> tempNode = head;
        ListNode<E> newNode = new ListNode(data);

        if(pos < 0 || pos > count) {
            throw new RuntimeException("삽입 위치가 잘못되었습니다. 현재 리스트 자료의 개수는 "+count+"개 입니다" );
        }


        if(pos == 0) {
            newNode.next =head;
            head = newNode;
        } else {
            ListNode<E> prevNode = null;
            for(int i=0; i<pos; i++) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }

            newNode.next = tempNode;
            prevNode.next = newNode;
        }

        count++;
    }

    @Override
    public void addElement(E data) {
        ListNode newNode=  new ListNode(data);
        if(head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        count++;
    }

    @Override
    public E removeElement(int pos) {

        ListNode<E> tempNode =head;

        if(pos < 0 || pos > count) {
            throw new RuntimeException("삭제할 위치가 잘못되었습니다. 현재 리스트 자료의 개수는 "+count+"개 입니다" );
        }

        if(pos == 0) {
            head = tempNode.next;
        } else {
            ListNode<E> prevNode =null;
            for(int i=0; i<pos; i++) {
                prevNode = tempNode;
                tempNode = tempNode.next;
            }

            prevNode.next = tempNode.next;
        }

        count--;
        return tempNode.getData();
    }

    @Override
    public E getElement(int pos) {
        ListNode<E> tempNode = head;

        // 유효한 위치인지 확인
        if(pos < 0 || pos > count) {
            throw new RuntimeException("읽을 위치가 잘못되었습니다. 현재 리스트 자료의 개수는 "+count+"개 입니다" );
        }
        if(pos == 0) {
            return tempNode.getData();
        }

        for(int i=0; i<pos; i++) {
            tempNode = tempNode.next;
        }

        return tempNode.getData();
    }

    @Override
    public int getSize() {
        return count;
    }

    @Override
    public void removeAll() {
        head = null;
        count = 0;
    }

    @Override
    public void printAll() {
        if(isEmpty()) {
            System.out.println("출력할 내용이 없습니다");
            return;
        }

        ListNode<E> temp = head;

        while(temp!= null) {
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null) {
                System.out.print("->");
            }
        }
        System.out.println();
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }
}
