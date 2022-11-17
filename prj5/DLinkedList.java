package prj5;

/** 
 * 
 * @author Jacob Rice
 *@version 11.17.22
 * @param <T> objects
 */

public class DLinkedList<T> {
    /**
     *
     * @author Jacob Rice
     *
     * @param <E>
     */
    private static class Node<E> {
    
    
    /**
     * Fields
     */
    private Node<E> next;
    private Node<E> previous;
    private E data;
    
    
    /**
     * Constructor
     * @param newdata new data for new node
     */
    public void Node(E newdata) {
        data=newdata;
    }
    /**
     * Constructor
     * @param newdata new data for new node
     * @param nextNode next Node
     */
    
    public void Node(E newdata, Node<E> nextNode, Node<E> previousNode) {
        data=newdata;
        next= nextNode;
        previous=previousNode;
    }
    
    /**
     * Setting next node
     * @param nextNode new next node
     */
    
    public void setNext(Node <E> nextNode) {
        next= nextNode;
    }
    
    /**
     * Setting previous node
     * @param previousNode new previous node
     */
    public void setPrevious(Node <E> previousNode) {
        previous=previousNode;
    }
    
    /**
     * Setting data
     * @param newdata new data for node
     */
    public void setData(E newdata) {
        data= newdata;
    }
    
    /**
     * getting next node
     * @return next Next node.
     */
    public Node<E> getNext(){
        return next;
    }
    
    /**
     * getting prev node
     * @return prev previous node
     */
    public Node<E> getPrevious(){
        return previous;
    }
    /**
     * getting data
     * @return data current node data
     */
    public E getData() {
        return data;
    }
    
    
    }
}

