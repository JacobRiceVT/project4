package prj5;

import student.TestCase;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
public class QuarterTest extends TestCase {
    /**
     * Fields
     */
    private Quarter quarter;

    /**
     * sets up the test cases
     */
    public void setUp() {
        Month january;
        Month february;
        Month march;
        Channel wizardHigh1;
        Channel justBeatz1;
        Channel australianWildLife1;
        Channel artAllDay1;
        Channel wizardHigh2;
        Channel justBeatz2;
        Channel australianWildLife2;
        Channel artAllDay2;
        Channel wizardHigh3;
        Channel justBeatz3;
        Channel australianWildLife3;
        Channel artAllDay3;
        wizardHigh1 = new Channel("actionDan", "wizardHighSchool", "US",
            "education", 53882, 431, 95800, 4129, 442422);
        wizardHigh2 = new Channel("actionDan", "wizardHighSchool", "US",
            "education", 20260, 402, 94300, 3830, 608010);
        wizardHigh3 = new Channel("actionDan", "wizardHighSchool", "US",
            "education", 53357, 934, 120343, 6902, 802180);
        justBeatz1 = new Channel("BigGiantCircles", "JustBeatz", "US", "music",
            29171, 350, 75043, 27701, 340871);
        justBeatz2 = new Channel("BigGiantCircles", "JustBeatz", "US", "music",
            19075, 367, 78023, 15371, 454132);
        justBeatz3 = new Channel("BigGiantCircles", "JustBeatz", "US", "music",
            30112, 430, 93203, 38021, 416456);
        australianWildLife1 = new Channel("cryptozoologist",
            "australianWildLife", "", "nature", 15654, 702, 1234050, 156548,
            6744523);
        australianWildLife2 = new Channel("cryptozoologist",
            "australianWildLife", "", "nature", 25574, 809, 1456706, 262398,
            7690402);
        australianWildLife3 = new Channel("cryptozoologist",
            "australianWildLife", "", "nature", 8552, 1203, 1705335, 120595,
            2565870);
        artAllDay1 = new Channel("mangledPixel", "artAllDay", "CA", "art",
            965094, 534, 8131230, 398583, 23267961);
        artAllDay2 = new Channel("mangledPixel", "artAllDay", "CA", "art",
            228260, 0, 8300936, 0, 0);
        artAllDay3 = new Channel("mangledPixel", "artAllDay", "CA", "art",
            958214, 654, 7320935, 455632, 42587177);
        january = new Month("January");
        february = new Month("February");
        march = new Month("March");
        january.addChannel(wizardHigh1);
        january.addChannel(justBeatz1);
        january.addChannel(australianWildLife1);
        january.addChannel(artAllDay1);
        february.addChannel(wizardHigh2);
        february.addChannel(justBeatz2);
        february.addChannel(australianWildLife2);
        february.addChannel(artAllDay2);
        march.addChannel(wizardHigh3);
        march.addChannel(justBeatz3);
        march.addChannel(australianWildLife3);
        march.addChannel(artAllDay3);
        quarter = new Quarter(january, february, march);
    }


    /**
     * Tests the getQuartChannel method
     */
    public void testGetQuarterChannel() {
        LinkedList quarterChannels = quarter.getQuarterChannels();
        assertEquals(quarterChannels.size(), 4);
        assertEquals(quarterChannels.get(3).getTEngagementRate(), 41.1, .01);
        assertEquals(quarterChannels.get(2).getTEngagementRate(), 34.6, .01);
        assertEquals(quarterChannels.get(1).getTEngagementRate(), 171.1, .01);
        assertEquals(quarterChannels.get(0).getTEngagementRate(), 118.3, .01);
        assertEquals(quarterChannels.get(3).getREngagementRate(), 4.6, .1);
        assertEquals(quarterChannels.get(2).getREngagementRate(), 3.5, .1);
        assertEquals(quarterChannels.get(1).getREngagementRate(), 13.2, .1);
        assertEquals(quarterChannels.get(0).getREngagementRate(), 7.7, .1);
    }
}
