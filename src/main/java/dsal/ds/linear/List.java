
package dsal.ds.linear;

/**
 * <h1>List </h1>
 * @author Chaika Maksym
 * @version 1.0
 * @param <T> type of elements in this list
 * @since 2020-05-08
 */
public interface List<T> {

    /**
     * Add value to the beginning of the list.
     * @param e new value
     */
    void addFirst(T e);

    /**
     * Add value to the end of the list.
     * @param e new value
     */
    void addLast(T e);

    /**
     * Delete all value from the list.
     */
    void clear();

    /**
     * Check if value existed in list
     * @param value value which check
     * @return true if value o is in the list
     */
    boolean contains(Object value);

    /**
     * Return value by index.
     * @param index - index of list
     * @return value by index
     */
    T get(int index);

    /**
     * Remove value from list.
     * @param o value which must be remove
     * @return true if value was found and remove
     */
    boolean remove(Object o);

    /**
     * Set value by index.
     * @param index index of list
     * @param value new value
     */
    void set(int index, T value);

    /**
    * Return count elements in the list.
    * @return count of element in this list
    */
    int size();
    
    /**
     * Reverse list 
     * Complexity O(n)
     */   
    public void reverse();
}
