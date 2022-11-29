package prj5;

import student.TestCase;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
public class MonthTest extends TestCase {
    private Month january;
    private Channel c1;
    private Channel c2;
    private Channel c3;
    private Channel c4;

    /**
     * sets up the test cases
     */
    public void setUp() {
        january = new Month("January");
        c1 = new Channel("aafootball", "allaboutfootball", "ES", "Sports",
            22876452, 333, 4650272, 518, 170095);
        c2 = new Channel("fashion22", "fitnessandfashion", "US", "Fashion",
            43048545, 692, 3566876, 475, 228755);
        c3 = new Channel("mmario", "artiseverywhere", "", "Art", 4670492, 88,
            3470330, 470, 117616);
        c4 = new Channel("actionDan", "wizardHigh", "US", "education", 127499,
            1767, 120343, 14861, 1852612);
    }


    /**
     * Tests the addChannel and getChannel method
     */
    public void testAddGetChannel() {
        january.addChannel(c1);
        january.addChannel(c2);
        january.addChannel(c3);
        january.addChannel(c4);
        assertEquals(january.getChannels().size(), 4);
    }
}
