package prj5;

import student.TestCase;

/** 
 * This class tests the MediaCalculat
 * 
 * @author Holden Weston 
 * @version 11/18/2022
 *
 */
public class MediaCalculatorTest extends TestCase{
    private MediaCalculator mc;
    
    /** 
     * Sets up the test cases 
     */
    public void setUp() { 
        mc = new MediaCalculator("SampleInput1_2022.csv"); 
    }
    
    /** 
     * tests the getSortedChannelByName method 
     */
    public void testGetSortedChannelByName() { 
        LinkedList<Channel> chanList = mc.getSortedChannelByName(); 
        assertEquals("ArtAllDay", chanList.get(0).getChannelName());
        assertEquals("australian_wildlife", chanList.get(1).getChannelName());
    }
    
    /** 
     * tests the getSortedChannelByName method 
     */
    public void testGetSortedTraditional() { 
        LinkedList<Channel> chanList = mc.getSortedTraditional(); 
        boolean a = (16.77 == chanList.get(0).getTEngagementRate()); 
        assertTrue(a);
        
        a = (13.95 == chanList.get(1).getTEngagementRate()); 
        assertTrue(a);
    }
    
    
}
