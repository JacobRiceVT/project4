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
        public void Node(E newdata) {
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

        public void Node(E newdata, Node<E> nextNode) {
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
    private Node tail;
    private int size = 0;

    /**
     * Constructor
     */
    public LinkedList() {
        tail = new Node();
        head = new Node();

        tail = head;
        head.setNext(tail);

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
        tail = new Node();
        head = new Node();

        tail.setPrevious(head);
        head.setNext(tail);

        size = 0;
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
     * @param newNode
     *            new Node
     */
    public void add(Node newNode) {
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }


    /**
     * @param index
     *            index to search
     * @param newNode
     *            new node to take over
     */
    public void add(int index, Node newNode) {
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
