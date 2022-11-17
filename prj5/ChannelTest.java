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

    /**
     * sets up the test cases
     */
    public void setUp() {
        c1=new Channel("aafootball","allaboutfootball","ES","Sports",22876452,333 ,4650272 ,518 ,170095 );
        c2=new Channel("fashion22","fitnessandfashion","US","Fashion",43048545 ,692 ,3566876 ,475 , 228755 );
        c2=new Channel("mmario","artiseverywhere","","Art",4670492,88 ,3470330 ,470 ,117616 );
    }
    public void testGetUsername() {
        assertEquals(c1.getUsername(),"aafootball");
        assertEquals(c2.getUsername(),"fashion22");
        assertEquals(c3.getUsername(),"mmario");
    }
}
