package prj5;

import java.util.Arrays;
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


    /**
     * Tests the getUsername method
     */
    public void testGetUsername() {
        assertEquals(c1.getUsername(), "aafootball");
        assertEquals(c2.getUsername(), "fashion22");
    }


    /**
     * Tests the getChannel method
     */

    public void testGetChannelName() {
        assertEquals(c1.getChannelName(), "allaboutfootball");
        assertEquals(c2.getChannelName(), "fitnessandfashion");
    }


    /**
     * Tests the getCountry method
     */

    public void testGetCountry() {
        assertEquals(c1.getCountry(), "ES");
        assertEquals(c2.getCountry(), "US");
        assertEquals(c3.getCountry(), "");
    }


    /**
     * Tests the getMainTopic method
     */

    public void testGetMaintTopic() {
        assertEquals(c1.getMainTopic(), "Sports");
        assertEquals(c2.getMainTopic(), "Fashion");
    }


    /**
     * Tests the getLikes and setLikes method
     */

    public void testGetSetlikes() {
        assertEquals(c1.getLikes(), 22876452);
        assertEquals(c2.getLikes(), 43048545);
        c3.setLikes(123);
        assertEquals(c3.getLikes(), 123);
    }


    /**
     * Tests the getPosts and setPosts method
     */

    public void testGetSetPosts() {
        assertEquals(c1.getPosts(), 333);
        assertEquals(c2.getPosts(), 692);
        c3.setPosts(123);
        assertEquals(c3.getPosts(), 123);
    }


    /**
     * Tests the getFollowers and setFollowers method
     */

    public void testGetSetFollowers() {
        assertEquals(c1.getFollowers(), 4650272);
        assertEquals(c2.getFollowers(), 3566876);
        c3.setFollowers(123);
        assertEquals(c3.getFollowers(), 123);
    }


    /**
     * Tests the getComments and setComments method
     */

    public void testGetSetComments() {
        assertEquals(c1.getComments(), 518);
        assertEquals(c2.getComments(), 475);
        c3.setComments(123);
        assertEquals(c3.getComments(), 123);
    }


    /**
     * Tests the getViews and setViews method
     */

    public void testGetSetViews() {
        assertEquals(c1.getViews(), 170095);
        assertEquals(c2.getViews(), 228755);
        c3.setViews(123);
        assertEquals(c3.getViews(), 123);
    }


    /**
     * Tests the getTEngagementRate method
     */

    public void testGetTEngagementRate() {
        assertEquals(c4.getTEngagementRate(), 118.3, .01);
    }


    /**
     * Tests the getREngagaementRate method
     */

    public void testGetREngagaementRate() {
        assertEquals(c4.getREngagementRate(), 7.7, .01);
    }
    
    /** 
     * Tests the compareName method 
     */
    public void testCompareName() { 
        boolean a;
        a = (c1.compareName(c2) < 0);  
        assertEquals(0, c1.compareName(c1));
        assertTrue(a); 
        
        a = (c2.compareName(c1) > 0);  
        assertTrue(a); 
        
        Channel[] channels = new Channel[3]; 
        channels[0] = c3; 
        channels[1] = c2;
        channels[2] = c1;
        
    }
}
