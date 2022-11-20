package prj5;

/**
 * 
 * @author Jacob Rice
 * @version 11.17.22
 * @param <Channel>
 *            Channel objects
 */

public class LinkedList {
    /**
     *
     * @author Jacob Rice
     *
     */
    private static class Node {

        /**
         * Fields
         */
        private Node next;
        private Channel data;

        /**
         * Constructor
         * 
         * @param newdata
         *            new data for new node
         */
        public Node(Channel newdata) {
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

        public Node(Channel newdata, Node nextNode) {
            data = newdata;
            next = nextNode;

        }


        /**
         * Setting next node
         * 
         * @param nextNode
         *            new next node
         */

        public void setNext(Node nextNode) {
            next = nextNode;
        }


        /**
         * Setting data
         * 
         * @param newdata
         *            new data for node
         */
        public void setData(Channel newdata) {
            data = newdata;
        }


        /**
         * getting next node
         * 
         * @return next Next node.
         */
        public Node getNext() {
            return next;
        }


        /**
         * getting data
         * 
         * @return data current node data
         */
        public Channel getData() {
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
        head = null;
        size = 0;
    }


    /**
     * @param data
     *            data to be added
     */
    public void add(Channel data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }


    /**
     * @param index
     *            index to go to
     * @return raw data
     */
    @SuppressWarnings("unchecked")
    public Channel get(int index) {
        return goToNode(index).getData();
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
    public void add(int index, Channel data) {
        Node newNode = new Node(data);
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


    /**
     * sort the nodes by name
     */
    public void sortByName() {
        if (size > 1) {
            Node unsortedPart = head.getNext();
            Node sortedpart = head;
            sortedpart.setNext(null);
            while (unsortedPart != null) {
                Node nodeToInsert = unsortedPart;
                unsortedPart = unsortedPart.getNext();
                insertInOrderByName(nodeToInsert);

            }
        }
    }


    /**
     * insert the nodes in order by name
     */
    private void insertInOrderByName(Node nodeToInsert) {
        Channel item = nodeToInsert.getData();
        Node currentNode = head;
        Node previousNode = null;
        while ((currentNode != null) && (item.compareName(currentNode
            .getData()) < 0)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (previousNode != null) {
            previousNode.setNext(nodeToInsert);
            nodeToInsert.setNext(currentNode);
        }
        else {
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        }
    }


    /**
     * sort the nodes by traditionalRate
     */
    public void sortByTraditionalRate() {
        if (size > 1) {
            Node unsortedPart = head.getNext();
            Node sortedpart = head;
            sortedpart.setNext(null);
            while (unsortedPart != null) {
                Node nodeToInsert = unsortedPart;
                unsortedPart = unsortedPart.getNext();
                insertInOrderByTraditionalRate(nodeToInsert);

            }
        }
    }


    /**
     * insert the nodes in order by traditional rate
     */
    private void insertInOrderByTraditionalRate(Node nodeToInsert) {
        Channel item = nodeToInsert.getData();
        Node currentNode = head;
        Node previousNode = null;
        while ((currentNode != null) && (item.compareTraditional(currentNode
            .getData()) > 0)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (previousNode != null) {
            previousNode.setNext(nodeToInsert);
            nodeToInsert.setNext(currentNode);
        }
        else {
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        }
    }


    /**
     * insert the nodes in order by reach rate
     */
    public void sortByReachRate() {
        if (size > 1) {
            Node unsortedPart = head.getNext();
            Node sortedpart = head;
            sortedpart.setNext(null);
            while (unsortedPart != null) {
                Node nodeToInsert = unsortedPart;
                unsortedPart = unsortedPart.getNext();
                insertInOrderByReachRate(nodeToInsert);

            }
        }
    }


    /**
     * insert the nodes in order By reach rate
     */
    private void insertInOrderByReachRate(Node nodeToInsert) {
        Channel item = nodeToInsert.getData();
        Node currentNode = head;
        Node previousNode = null;
        while ((currentNode != null) && (item.compareReach(currentNode
            .getData()) > 0)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (previousNode != null) {
            previousNode.setNext(nodeToInsert);
            nodeToInsert.setNext(currentNode);
        }
        else {
            nodeToInsert.setNext(head);
            head = nodeToInsert;
        }
    }

}
