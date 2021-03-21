import org.graalvm.compiler.hotspot.nodes.CurrentLockNode;

public class MyList<E> implements ListInterface<E>{
	

 /*Implements a singly linked list of generic types*/


/* We first defining the inner node class */

    private static class Node<E>{

        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){

            element = e;
            next = n;


        }

        public E getElement{return element; }
        public Node<E> getNext() {return next; }
        public void setNext(Node<E> n){next = n; }
    }

    /* We then define the instance variables */

    private Node<E> head = null; // head node of the list
    private Node<E> tail = null;
    private int size = 0;

    // Constructor: construct initially empty list
    public MyList() {
        LinkedList<Card> cardDeck = new LinkedList<>();
    }


    /* Methods from ListInterface */

    public boolean isEmpty(){ 

    /******************************************************************/
        return (head == null);
	/* 
        Alternatively, we can also use
        if(cardDeck.size() == 0){
            return true;
        } 
        */
    /******************************************************************/


    }
    public int numElem(){
    /******************************************************************/
        int length = 0;
        Node<Type> current = head;
        while (current != null) {
            current = current.Next();
            length++;
        }
        return length;
	    
	/* 
        Alternatively, we can also use
        return cardDeck.size();
        */
    /******************************************************************/



    } // 
    public void addFirst(E e){

    /******************************************************************/
        Node newNode = new Node(e);  
        if(head == null) {  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            Node temp = head;  
            newNode.next = temp;  
            head = newNode; 
        }
	
	/* 
	Alternatively, we can also use
	cardDeck.addFirst(e);
	*/
    /******************************************************************/



    } 
    public void addLast(E e){
    /******************************************************************/
        Node newNode = new Node(e);  
        if(head == null) {    
            head = newNode;  
            tail = newNode;  
        }  
        else {    
            tail.next = newNode;  
            tail = newNode;  
        }
	    
	/* 
	Alternatively, we can also use
	cardDeck.addLast(e);
	*/
    /******************************************************************/




    } 
    public E removeFirst(){
    /******************************************************************/
        if (!isEmpty()) {
            Node<Type> toBeRemoved = head;
            head = head.getNext();
            toBeRemoved.setNext(null); 
        }
	    
	/* 
	Alternatively, we can also use
	return cardDeck.removeFirst(); 
	*/
    /******************************************************************/

    }  
    public void insert(int position, E e){
    /******************************************************************/
        int size = length(e);
        if(position > size+1 || position < 1){
            break;
        }
        Node newNode = new Node(e);
        if(position==1){
            newNode.next = head;
        }
        else{
            Node previous = head;
            int count = 1;
            while(count<position-1){
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }

    }
	
    /* 
    Alternatively, we can also use
    List<Card> list = new ArrayList<Card>(cardDeck);    // converting linked list to arraylist to use ArrayList.add() method
    list.add(position, e);
    List<Card> cardDeck = new LinkedList<Card>(list);   // converting back to linkedlist 
    */
    /******************************************************************/



    } 
                                            
    public E remove(int position, E e){
    /******************************************************************/ 
        int size = length(e);
        if(position > size || position < 1){
            return head;
        }
        else if(position == 1){
            Node temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        }
        else {
            Node previous = head;
            int count = 1;
            while(count < position-1){
                previous = previous.next;
                count++;
            }
            Node current = previous.next;
            previous.next = current.next;
            current.next = null;
            return current;
        }
	    
	/* 
	Alternatively, we can also use
	return cardDeck.remove(position); 
	*/

    /******************************************************************/

    } 

    public E checkFirst(){
    /******************************************************************/
        if (head == null) { 
            throw new Exception( 
                "No elemets found in Linked List"); 
        } 
        return head.data;
        
	/* 
	Alternatively, we can also use
	return cardDeck.getFirst(); 
	*/
    /******************************************************************/




    }  
    public E checkLast(){
    /******************************************************************/
        if (head == null) { 
            throw new Exception( 
                "No elements found in Linked List"); 
        } 

        Node<E> temp = head; 
        while (temp.next != null) { 
            temp = temp.next; 
        } 
        return temp.data; 
	    
	/* 
	Alternatively, we can also use
	return cardDeck.getLast();
	*/
    /******************************************************************/




    } 
    public E checkElement(int position){
    /******************************************************************/
        Node current = head;
        int count = 0; // index of Node we are currently looking at
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
        // if we get to this line, the caller was asking for a non-existent element
        return 0;
	    
	/* 
	Alternatively, we can also use
	return cardDeck.get(position);
	*/
    /******************************************************************/


    }  




}
