package dsal.ds.linear;

import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SinglyLinkedListSetTest {
    
    /**
    * Test of set method, of class SinglyLinkedList.
    * set one value into empty list
    */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetEmpty() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        
        list.set(0, first);                  
                       
    }
    
    /**
    * Test of set method, of class SinglyLinkedList.
    * set one value into list with one element
    */
    @Test()
    public void testSetOne() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        Object second   = new Object();
        
        list.addLast(first);
        list.set(0, second);      
        
        Object value = list.get(0);
        
        assertNotNull(value);
        assertEquals(second, value);
    
    }
}
