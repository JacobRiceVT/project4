package prj5;

/**
 * 
 * @author Jacob Rice
 * @version 11.17.22
 * @param <T>
 *            objects
 */

public class LinkedList<T> {
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
        private E data;

        /**
         * Constructor
         * 
         * @param newdata
         *            new data for new node
         */
        public Node(E newdata) {
            data = newdata;
        }


        /**
         * Constructor
         * 
         * @param newdata
         *            new data for new node
         * @param nextNode
         *            next Node
         */

        public Node(E newdata, Node<E> nextNode) {
            data = newdata;
            next = nextNode;

        }


        /**
         * Setting next node
         * 
         * @param nextNode
         *            new next node
         */

        public void setNext(Node<E> nextNode) {
            next = nextNode;
        }


        /**
         * Setting data
         * 
         * @param newdata
         *            new data for node
         */
        public void setData(E newdata) {
            data = newdata;
        }


        /**
         * getting next node
         * 
         * @return next Next node.
         */
        public Node<E> getNext() {
            return next;
        }


        /**
         * getting data
         * 
         * @return data current node data
         */
        public E getData() {
            return data;
        }

    }

    /**
     * Fields!
     */

    private Node head;
    private int size;

    /**
     * Constructor
     */
    public LinkedList() {
        head = null;
        size = 0;
    }


    /**
     * @return size size of the list
     */
    public int size() {
        return size;
    }


    /**
     * clears the list
     */
    public void clear() {
        head.setNext(null);
        head=null;
        size = 0;
    }

    /**
     * @param data
     *            data to be added
     */
    public void add(T data) {
        Node add=new Node(data);
        add.setNext(head.getNext());
        head.setNext(add);
        size++;
    }
    /**
     * @param index
     *            index to go to
     * @return raw data
     */
    public T get(int index) {
        return (T)goToNode(index).getData();
    }
    /**
     * @param index
     *            index to go to
     * @return a node, returns null when index is not positive.
     */
    public Node goToNode(int index) {
        if (index >= 0) {
            Node iterator = head;
            for (int i = 0; i < index; i++) {
                iterator = iterator.getNext();
            }
            return iterator;
        }
        return null;
    }
    /**
     * @param index
     *            index to search
     * @param data
     *            data to be added
     */
    public void add(int index, T data) {
        Node newNode=new Node(data);
        Node tempNode = goToNode(index);
        if (index == 0) {
            newNode.setNext(tempNode.getNext());
            head = newNode;
        }
        else {

            newNode.setNext(tempNode);
            goToNode(index - 1).setNext(newNode);
        }
        size++;
    }

}
    
}
