package dsal.ds.linear;

/**
 * <h1>Singly linked list </h1>
 * Implementation of singly linked list
 * @author Chaika Maksym
 * @version 1.0
 * @param <T> type of elements in this list
 * @since 2020-05-08
 */
public class SinglyLinkedList<T> implements List<T>{

   
    /**
     * 
     * @param <T> 
    */
    static class Node<T>{
        
        T value;
    
        Node<T> next;
    }
    
    
    private Node<T> head;
        
    private Node<T> tail;
    
    private int size;
    
    /**
     * Create empty list
     */
    public SinglyLinkedList(){
        
    }
    
    SinglyLinkedList(Node<T> head, Node<T> tail, int size){
        
        this.head   = head;
        this.tail   = tail;
        this.size   = size;
                
    }
    
    
    /**
     * Return count elements in the list. Complexity O(1)
     * @return count of element in this list
     */
    @Override
    public int size() { 
        return this.size;
    }


    /**
     * Check if value existed in list.
     * Complexity O(n)
     * @param value value which check
     * @return true if value o is in the list
     */
    @Override
    public boolean contains(Object value) {
        
        if(this.head == null){
            return false;
        }else{
            
            Node<T> currentNode = this.head;
            
            while(currentNode != null){
                
                if( currentNode.value == value
                      ||  currentNode.value.equals(value)){
                    return true;
                }
                
                currentNode = currentNode.next;               
            }
        }
        
        return false;
    }

    /**
     * Add value to the end of the list.
     * Complexity O(1)
     * @param e new value
     */
    @Override
    public void addLast(T e) {
                
        Node<T> node = new Node<>();
        node.value  = e;
        
        if(head == null && tail == null){
            // fist element 
            this.head   = node;
            this.tail   = node;           
        }else{
            // Add element to the end
            this.tail.next  = node;
            this.tail       = node;
        }
        
        ++this.size;
        
    }
    
    /**
    * Add value to the begining of the list.
    * Complexity O(1)
    * @param e new value
    */
    @Override
    public void addFirst(T e){
        
        Node<T> node = new Node<>();
        node.value  = e;
        
        if(head == null && tail == null){
            // fist element 
            this.head   = node;
            this.tail   = node;  
        }else{
            
            node.next   = this.head;
            this.head   = node;
        }   
        
        ++this.size;
    }


    /**
     * Remove value from list.
     * Complexity O(n)
     * @param o value which must be remove
     * @return true if value was found and remove
     */
    @Override
    public boolean remove(Object o) {
        
        if(this.size() == 0){
            return false;
        }
               
        if((this.size == 1) ){
            
            Node<T> currentNode    = this.head;
            
            if( (currentNode.value == o)
                   || (currentNode.value != null 
                        && currentNode.value.equals(o))){
                
                 this.head   = null;
                 this.tail   = null;
                 this.size   = 0;
                 return true; 
            }  
                      
        }else{
            
          return removeInMiddle(o);
            
        }

        return false;
    }

    private boolean removeInMiddle(Object o){

        if( (this.head.value == o)
                || (this.head.value != null
                && this.head.value.equals(o))){

            --this.size;
            this.head   = this.head.next;
            return true;
        }

        Node<T> previousNode   = this.head;
        Node<T> currentNode    = this.head.next;

        while(currentNode != null){

            if( (currentNode.value == o)
                    ||(currentNode.value != null
                    && currentNode.value.equals(o))){

                deleteNode(previousNode, currentNode);
                return true;
            }

            // Case when value and o  equals null
            if(currentNode.value == o){

                deleteNode(previousNode, currentNode);
                return true;
            }

            previousNode    = currentNode;
            currentNode     = currentNode.next;
        }

        return false;
    }


    private void deleteNode(Node<T> previousNode, Node<T> currentNode){
        
        previousNode.next  = currentNode.next;
        currentNode.next   = null;
        --this.size;

        // Delete last node in list
        if(this.tail == currentNode){
            this.tail   = previousNode;
        } 
        
    }

    /**
     * Delete all value from the list.
     * Complexity O(1)
     */
    @Override
    public void clear() {
        this.size   = 0;
        this.head   = null;
        this.tail   = null;
    }
    
    
    /**
     * Return first ( head) node of the list.
     * Complexity O(1)
     * @return head node of the list
     */
    Node<T> getHeadNode(){
        return this.head;
    }
    
    /**
    * Return last ( tail) node of the list.
    * Complexity O(1)
    * @return tail node of the list
    */
    Node<T> getTailNode(){
        return this.tail;
    }
    
    /**
     * Return value by index.
     * Complexity O(n)
     * @param index - index of list
     * @return value by index
     */
    @Override
    public T get(int index){
        
        if(index > (this.size()-1)){
            throw new IndexOutOfBoundsException();
        }
        
        Node<T> currentNode     = this.head;
        int currentIndex        = 0;
        
        while(currentIndex != index ){
            
            currentNode = currentNode.next;
            currentIndex++;
            
        }
               
        return currentNode.value;
    }
    
    /**
     * Set value by index.
     * Complexity O(n)
     * @param index index of list
     * @param value new value
     */
    @Override
    public void set(int index, T value){
        
        if(index > (this.size()-1)){
            throw new IndexOutOfBoundsException();
        }
        
        Node<T> currentNode     = this.head;
        int currentIndex        = 0;
        
        while(currentIndex != index ){
            
            currentNode = currentNode.next;
            currentIndex++;
            
        }
        
        currentNode.value   = value;
    }
    
    /**
    * Reverse list.
    * Complexity O(n)
    */   
    @Override
    public void reverse() {
        
        if(this.size() <= 1){
            return;
        }
        
        Node<T> currentNode    = this.head.next;
        this.tail           = this.head; 
        this.tail.next      = null;
        this.head           = currentNode;
       
        Node<T> prevNode    = this.tail;

        while(currentNode!= null){

            Node<T> nextNode    = currentNode.next;
            
            currentNode.next    = prevNode;
            this.head           = currentNode;
            
            prevNode            = currentNode;
            currentNode         = nextNode;
  
        }
        
        

    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder(2+this.size*2);
        
        sb.append("{");
        
        Node<T> node   = this.head;
        int i       = 0;
        
        while(node != null){
            if(i == 0){
              sb.append(node.value); 
              i++;
            }else{
              sb.append(",");
              sb.append(node.value);
            }
            node    = node.next;
        }
        sb.append("}");
        
        return sb.toString(); //To change body of generated methods, choose Tools | Templates.
    }


   
    
}
