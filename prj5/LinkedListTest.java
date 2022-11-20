package prj5;

import student.TestCase;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
public class LinkedListTest extends TestCase {
    /**
     * Fields
     */
    private Channel c1;
    private Channel c2;
    private Channel c3;
    private Channel c4;
    private Channel c5;
    private LinkedList channels;

    /**
     * sets up the test cases
     */
    public void setUp() {
        c1 = new Channel("aafootball", "allaboutfootball", "ES", "Sports",
            22876452, 333, 4650272, 518, 170095);
        c2 = new Channel("fashion22", "fitnessandfashion", "US", "Fashion",
            43048545, 692, 3566876, 475, 228755);
        c3 = new Channel("mmario", "artiseverywhere", "", "Art", 4670492, 88,
            3470330, 470, 117616);
        c4 = new Channel("actionDan", "wizardHigh", "US", "education", 127499,
            1767, 120343, 14861, 1852612);
        c5 = new Channel("actionDan", "wizardHigh", "US", "education", 127499,
            1767, 0, 14861, 1852612);
        channels = new LinkedList();
    }


    /**
     * Tests the addSize method
     */
    public void testAddSize() {
        channels.add(c1);
        channels.add(c2);
        channels.add(c3);
        channels.add(c4);
        channels.add(c5);
        assertEquals(channels.size(), 5);
    }


    /**
     * Tests the clear method
     */

    public void testClear() {
        channels.clear();
        assertEquals(channels.size(), 0);
    }


    /**
     * Tests the test method
     */
    public void test() {
        channels.add(c5);
        assertEquals(channels.get(0), c5);
    }


    /**
     * Tests the sortByName method
     */
    public void testSortByName() {
        channels.add(c1);
        channels.add(c2);
        channels.add(c3);
        channels.add(c4);
        channels.sortByName();
        assertEquals(channels.get(0), c3);
    }


    /**
     * Tests the sortByTraditional method
     */

    public void testSortByTraditional() {
        channels.add(c1);
        channels.add(c2);
        channels.add(c3);
        channels.add(c4);
        channels.sortByTraditionalRate();
        assertEquals(channels.get(0), c2);
    }


    /**
     * Tests the sortByReach method
     */

    public void testSortByReach() {
        channels.add(c1);
        channels.add(c2);
        channels.add(c3);
        channels.add(c4);
        channels.sortByReachRate();
        assertEquals(channels.get(0), c2);
    }

}
