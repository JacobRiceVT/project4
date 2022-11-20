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
    private Month january;
    private Month february;
    private Month march;
    private Channel wizardHigh1;
    private Channel justBeatz1;
    private Channel australian_wildlife1;
    private Channel ArtAllDay1;
    private Channel wizardHigh2;
    private Channel justBeatz2;
    private Channel australian_wildlife2;
    private Channel ArtAllDay2;
    private Channel wizardHigh3;
    private Channel justBeatz3;
    private Channel australian_wildlife3;
    private Channel ArtAllDay3;

    /**
     * sets up the test cases
     */
    public void setUp() {
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
        australian_wildlife1 = new Channel("cryptozoologist",
            "australian_wildlife", "", "nature", 15654, 702, 1234050, 156548,
            6744523);
        australian_wildlife2 = new Channel("cryptozoologist",
            "australian_wildlife", "", "nature", 25574, 809, 1456706, 262398,
            7690402);
        australian_wildlife3 = new Channel("cryptozoologist",
            "australian_wildlife", "", "nature", 8552, 1203, 1705335, 120595,
            2565870);
        ArtAllDay1 = new Channel("mangledPixel", "ArtAllDay", "CA", "art",
            965094, 534, 8131230, 398583, 23267961);
        ArtAllDay2 = new Channel("mangledPixel", "ArtAllDay", "CA", "art",
            228260, 0, 8300936, 0, 0);
        ArtAllDay3 = new Channel("mangledPixel", "ArtAllDay", "CA", "art",
            958214, 654, 7320935, 455632, 42587177);
        january = new Month("January");
        february = new Month("February");
        march = new Month("March");
        january.addChannel(wizardHigh1);
        january.addChannel(justBeatz1);
        january.addChannel(australian_wildlife1);
        january.addChannel(ArtAllDay1);
        february.addChannel(wizardHigh2);
        february.addChannel(justBeatz2);
        february.addChannel(australian_wildlife2);
        february.addChannel(ArtAllDay2);
        march.addChannel(wizardHigh3);
        march.addChannel(justBeatz3);
        march.addChannel(australian_wildlife3);
        march.addChannel(ArtAllDay3);
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
