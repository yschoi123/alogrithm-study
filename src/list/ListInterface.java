package list;

public interface ListInterface<E> {
    public void inesrtElement(int i, E data);   // 특정 위치에 데이터 추가
    public void addElement(E data);             // 맨 뒤에 데이터 추가
    public E removeElement(int i);              // 특정 위치 데이터 제거 및 반환
    public E getElement(int i);                 // 특정 위치 데이터 반환
    public int getSize();                       // 가지고 있는 요소 개수 반환
    public void removeAll();                    // 모든 요소 제거
    public void printAll();                     // 모든 요소 출력
    public boolean isEmpty();                   // 비었는지 확인
}
