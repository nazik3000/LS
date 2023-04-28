package lists.LinkedList;

import java.util.List;

public interface LinkelList<T> {
    
    void add(T element);
    void deleteElementByIndex(int index);
    void changeElemByIndex(int index, T element);
    Object[] getAll(LinkedListCore list);
    T getElemByIndex(int index);
}
