package prj5;

import student.TestCase;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
public class ChannelTest extends TestCase {
    private Channel c1;
    private Channel c2;
    private Channel c3;
    private Channel c4;

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
    }


    public void testGetUsername() {
        assertEquals(c1.getUsername(), "aafootball");
        assertEquals(c2.getUsername(), "fashion22");
    }


    public void testGetChannelName() {
        assertEquals(c1.getChannelName(), "allaboutfootball");
        assertEquals(c2.getChannelName(), "fitnessandfashion");
    }


    public void testGetCountry() {
        assertEquals(c1.getCountry(), "ES");
        assertEquals(c2.getCountry(), "US");
        assertEquals(c3.getCountry(), "");
    }


    public void testGetMaintTopic() {
        assertEquals(c1.getMainTopic(), "Sports");
        assertEquals(c2.getMainTopic(), "Fashion");
    }


    public void testGetSetlikes() {
        assertEquals(c1.getLikes(), 22876452);
        assertEquals(c2.getLikes(), 43048545);
        c3.setLikes(123);
        assertEquals(c3.getLikes(), 123);
    }


    public void testGetSetPosts() {
        assertEquals(c1.getPosts(), 333);
        assertEquals(c2.getPosts(), 692);
        c3.setPosts(123);
        assertEquals(c3.getPosts(), 123);
    }


    public void testGetFollowers() {
        assertEquals(c1.getFollowers(), 4650272);
        assertEquals(c2.getFollowers(), 3566876);
        c3.setFollowers(123);
        assertEquals(c3.getFollowers(), 123);
    }


    public void testGetComments() {
        assertEquals(c1.getComments(), 518);
        assertEquals(c2.getComments(), 475);
        c3.setComments(123);
        assertEquals(c3.getComments(), 123);
    }


    public void testGetViews() {
        assertEquals(c1.getViews(), 170095);
        assertEquals(c2.getViews(), 228755);
        c3.setViews(123);
        assertEquals(c3.getViews(), 123);
    }


    public void testGetTEngagementRate() {
        assertEquals(c4.getTEngagementRate(), 118.3, .01);
    }


    public void testGetREngagaementRate() {
        assertEquals(c4.getREngagementRate(), 7.7, .01);
    }
}
