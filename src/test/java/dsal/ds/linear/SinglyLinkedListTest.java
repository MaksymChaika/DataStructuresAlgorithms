
package dsal.ds.linear;

import dsal.ds.linear.SinglyLinkedList;
import dsal.ds.linear.SinglyLinkedList.Node;
import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SinglyLinkedListTest {
    
    private SinglyLinkedList<Object> testList; 
    
    public SinglyLinkedListTest() {
        
    }
    
    @Before
    public void setUp() {
        testList    = new SinglyLinkedList<Object>();
    }
    
    @After
    public void tearDown() {
        testList    = null;
    }

    /**
     * Test of size method of class SinglyLinkedList.
     */
    @Test
    public void testSize() {
                
        int expResult   = 0;
        int result      = testList.size();
        assertEquals(expResult, result);
        
        Object first    = new Object();
        Object second   = new Object();
        
        testList.addLast(first);
        
        result = testList.size();
        assertEquals(1, result);
        
        testList.addLast(second);
        result = testList.size();
        assertEquals(2, result);
        
    }

    /**
     * Test of contains method, of class SinglyLinkedList.
     */
    @Test
    public void testContains() {

        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();

        Object first    = new Object();
        Object second   = new Object();
        Object third    = new Object();

        list.addLast(first);
        list.addLast(second);

        boolean result = list.contains(first);
        assertEquals(true, result);

        result = list.contains(second);
        assertEquals(true, result);

        result = list.contains(third);
        assertEquals(false, result);

    }

    /**
     * Test of contains method of class SinglyLinkedList.
     */
    @Test
    public void testContainsEmpty() {

        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();

        Object first    = new Object();

        boolean result = list.contains(first);
        assertEquals(false, result);


    }

    /**
     * Test of addLast method, of class SinglyLinkedList.
     */
    @Test
    public void testAddLast() {
        
        Object first    = new Object();
        Object second   = new Object();
        
        testList.addLast(first);                  
        testList.addLast(second);
        
        Object value = testList.get(1);
        assertEquals(value, second);
    }

    /**
     * Test of addFirst method, of class SinglyLinkedList.
     */
    @Test
    public void testAddFirst() {
                
        Object first    = new Object();
        Object second   = new Object();
        
        testList.addFirst(first);                  
        testList.addFirst(second);
        
        Object value = testList.get(0);
        assertEquals(value, second);
    }


        
    /**
     * Test of clear method, of class SinglyLinkedList.
     */
    @Test
    public void testClear() {
        
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
        
        Object first    = new Object();
        Object second   = new Object();
        
        list.addLast(first);
        int result = list.size();
        assertEquals(1, result);
        
        list.clear();
        result      = list.size();
        assertEquals(0, result);
        
        list.addLast(second);
        result = list.size();
        assertEquals(1, result);
        
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet(){
                       
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
        
        Object first    = new Object();
        Object second   = new Object();
        
        list.addLast(first);
        list.addLast(second);

        Object value = list.get(0);
        assertEquals(first, value);
        
        // throw exception
        value = list.get(3);              
    }
    
    
    @Test()
    public void testReverse(){
                       
        SinglyLinkedList<Object> list = new SinglyLinkedList<Object>();
        
        Object first    = new String("first");
        Object second   = new String("second");
        Object third    = new String("third");
        
        list.addLast(first);
        list.addLast(second);
        list.addLast(third);
        
        System.out.println("list="+list);
        
        list.reverse();
        
        System.out.println("list="+list);

        Object value = list.get(0);
        assertEquals(third, value);
        
        value = list.get(1);
        assertEquals(second, value);
        
        value = list.get(2);
        assertEquals(first, value);  
        
        Node head = list.getHeadNode();      
        assertNotNull(head);
        assertNotNull(head.next);
        assertNotNull(head.value);
        assertEquals(head.value, third); 
        
        Node tail = list.getTailNode();      
        assertNotNull(tail);
        assertNull(tail.next);
        assertNotNull(tail.value);
        assertEquals(tail.value, first); 
    }
}
