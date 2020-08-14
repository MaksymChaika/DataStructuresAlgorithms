package dsal.ds.linear;

import dsal.ds.linear.SinglyLinkedList.Node;

/**
 *<h1> Collections of utile methods for lists</h1>
 * @author Chayka
 * @since 2020-05-08
 */
public class ListUtils {
    
    private ListUtils(){
        
    }
    
    /**
     * Check if singly linked list has circle
     * @param <T> - type of value in list
     * @param list - list of elements
     * @return true if list has circle
     */
    public static <T> boolean isCircledList(SinglyLinkedList<T> list){
        
        if(list.size() == 0){
            return false;
        }
        
        Node slowPointer    = list.getHeadNode();  
           
        // First step forward
        Node fastPointer    = slowPointer.next;
        
        while(true){

            if(slowPointer == fastPointer){
                return true;
            }else if(fastPointer == null){
                return false;
            }

            // Second step forward fast pointer        
            fastPointer = fastPointer.next;
            
            if(slowPointer == fastPointer){
                return true;
            }else if(fastPointer == null){
                return false;
            }
            
            // Move one step forward each pointer
            slowPointer     = slowPointer.next;
            
            fastPointer     = fastPointer.next;
        }
        
    }
    
    
    
    
    
}
