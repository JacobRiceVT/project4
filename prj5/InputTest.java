package prj5;

import student.TestCase;

/**
 * Tests the implimentation of the class
 * 
 * @author Holden Weston
 * @verion 11/18/2022
 *
 */
public class InputTest extends TestCase {
    private Input iReader;

    public void setUp() {
        iReader = new Input("SampleInput1_2022.csv");
    }

    public void testGetMonthInfo() {
        Month[] m = iReader.getMonthInfo();
        for(int i=0;i<m.length;i++) {
            System.out.println();
            System.out.println(m[i].getName());
            LinkedList channels=m[i].getChannels();
            for(int j=0;j<channels.size();j++) {
                Channel channel=channels.get(j);
                System.out.println(channel.getUsername());
                System.out.println(channel.getChannelName());
                System.out.println(channel.getCountry());
                System.out.println(channel.getMainTopic());
                System.out.println(channel.getLikes());
                System.out.println(channel.getPosts());
                System.out.println(channel.getFollowers());
                System.out.println(channel.getComments());
                System.out.println(channel.getViews());
                System.out.println();
            }
        }

        assertEquals("January", m[0].getName()); 
        assertEquals("Febuary", m[1].getName()); 
        assertEquals("March", m[2].getName()); 
        assertEquals("April", m[3].getName()); 
        assertEquals("actionDan", m[0].getChannels().get(3).getUsername()); 
        
    }
    
}

