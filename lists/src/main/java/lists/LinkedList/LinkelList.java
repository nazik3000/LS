package lists.LinkedList;

import java.util.List;

public interface LinkelList<T> extends Iterable<T>,Comparable<T> {
    
    void add(T element);
    void deleteElementByIndex(int index);
    void changeElemByIndex(int index, T element);
    
    T getElemByIndex(int index);
}

