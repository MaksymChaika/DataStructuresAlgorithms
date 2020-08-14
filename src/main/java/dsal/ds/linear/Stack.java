package dsal.ds.linear;

/**
 * <h1>Stack </h1>
 * A collection of objects that are inserted and removed according to the last-in
 * first-out principle.
 * @author Chaika Maksym
 * @version 1.0
 * @param <E> element in stack
 * @since 2020-05-08
 */
public interface Stack<E> {
    
    int size( );
    
    boolean isEmpty( );
    
    void push(E e);
    
    E top( );
    
    E pop( );
}
