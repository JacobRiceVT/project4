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
        assertEquals("January", m[0].getName());
        assertEquals("Febuary", m[1].getName());
        assertEquals("March", m[2].getName());
        assertEquals("April", m[3].getName());
        assertEquals("actionDan", m[0].getChannels().get(3).getUsername());

    }

}
