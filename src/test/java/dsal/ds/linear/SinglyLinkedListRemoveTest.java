
package dsal.ds.linear;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SinglyLinkedListRemoveTest {
    
    
    /**
    * Test of remove method, of class SinglyLinkedList.
    * remove one value from list
    */
    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveOne() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        
        list.addLast(first);                  
        
        list.remove(first);
        int result = list.size();
        assertEquals(0, result);
        
        // throw exception
        Object value = list.get(0);
                
    }
    
    /**
     * Test of remove method, of class SinglyLinkedList.
     * remove first value from list of two elements
     */
    @Test
    public void testRemoveTwoFirst() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        Object second   = new Object();
        
        list.addLast(first);                  
        list.addLast(second);
        
        list.remove(first);
        int result = list.size();
        assertEquals(1, result);
        
        Object value = list.get(0);
        
        assertNotNull(value);
        assertEquals(value, second);
        
        SinglyLinkedList.Node headNode = list.getHeadNode();
        assertNotNull(headNode);
        assertNotNull(headNode.value);
        assertEquals(headNode.value, second);
        
        
        SinglyLinkedList.Node tailNode = list.getTailNode();
        assertNotNull(tailNode);
        assertNotNull(tailNode.value);
        assertEquals(tailNode.value, second);
        
        
        assertEquals(headNode, tailNode);
                
    }
    
    /**
    * Test of remove method, of class SinglyLinkedList.
    * remove second value from list of two elements
    */
    @Test()
    public void testRemoveTwoSecond() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        Object second   = new Object();
        
        list.addLast(first);                  
        list.addLast(second);
        
        list.remove(second);
        int result = list.size();
        assertEquals(1, result);
        
        Object value = list.get(0);
        
        assertNotNull(value);
        assertEquals(value, first);
        
        SinglyLinkedList.Node headNode = list.getHeadNode();
        assertNotNull(headNode);
        assertNotNull(headNode.value);
        assertEquals(headNode.value, first);
        
        
        SinglyLinkedList.Node tailNode = list.getTailNode();
        assertNotNull(tailNode);
        assertNotNull(tailNode.value);
        assertEquals(tailNode.value, first);
               
        assertEquals(headNode, tailNode);
             
    }
    
    /**
    * Test of remove method, of class SinglyLinkedList.
    * remove first value from list of three elements
    */
    @Test()
    public void testRemoveThreeFirst() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        Object second   = new Object();
        Object third    = new Object();
        
        list.addLast(first);                  
        list.addLast(second);
        list.addLast(third);
        
        list.remove(first);
        int result = list.size();
        assertEquals(2, result);
        
        Object value1 = list.get(0);
        Object value2 = list.get(1);
        
        assertNotNull(value1);
        assertEquals(value1, second);
        
        assertNotNull(value2);
        assertEquals(value2, third);
        
        SinglyLinkedList.Node headNode = list.getHeadNode();
        assertNotNull(headNode);
        assertNotNull(headNode.value);
        assertEquals(headNode.value, second);
        
        
        SinglyLinkedList.Node tailNode = list.getTailNode();
        assertNotNull(tailNode);
        assertNotNull(tailNode.value);
        assertEquals(tailNode.value, value2);
             
        assertNotEquals(headNode, tailNode);
        
    }
    
    /**
    * Test of remove method, of class SinglyLinkedList.
    * remove second ( middle) value from list of three elements
    */
    @Test()
    public void testRemoveThreeSecond() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        Object second   = new Object();
        Object third    = new Object();
        
        list.addLast(first);                  
        list.addLast(second);
        list.addLast(third);
        
        list.remove(second);
        int result = list.size();
        assertEquals(2, result);
        
        Object value1 = list.get(0);
        Object value2 = list.get(1);
        
        assertNotNull(value1);
        assertEquals(value1, first);
        
        assertNotNull(value2);
        assertEquals(value2, third);
        
        SinglyLinkedList.Node headNode = list.getHeadNode();
        assertNotNull(headNode);
        assertNotNull(headNode.value);
        assertEquals(headNode.value, value1);
        
        
        SinglyLinkedList.Node tailNode = list.getTailNode();
        assertNotNull(tailNode);
        assertNotNull(tailNode.value);
        assertEquals(tailNode.value, value2);
             
        assertNotEquals(headNode, tailNode);
        
    }

    
    /**
    * Test of remove method, of class SinglyLinkedList.
    * remove third value from list of three elements
    */
    @Test()
    public void testRemoveThreeThird() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
                
        Object first    = new Object();
        Object second   = new Object();
        Object third    = new Object();
        
        list.addLast(first);                  
        list.addLast(second);
        list.addLast(third);
        
        list.remove(third);
        int result = list.size();
        assertEquals(2, result);
        
        Object value1 = list.get(0);
        Object value2 = list.get(1);
        
        assertNotNull(value1);
        assertEquals(value1, first);
        
        assertNotNull(value2);
        assertEquals(value2, second);
        
        SinglyLinkedList.Node headNode = list.getHeadNode();
        assertNotNull(headNode);
        assertNotNull(headNode.value);
        assertEquals(headNode.value, value1);
        
        
        SinglyLinkedList.Node tailNode = list.getTailNode();
        assertNotNull(tailNode);
        assertNotNull(tailNode.value);
        assertEquals(tailNode.value, value2);
             
        assertNotEquals(headNode, tailNode);
        
    }
    
}
