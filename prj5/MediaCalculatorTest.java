package prj5;

import student.TestCase;

/**
 * This class tests the MediaCalculat
 * 
 * @author Holden Weston
 * @version 11/18/2022
 *
 */
public class MediaCalculatorTest extends TestCase {
    private MediaCalculator mc;

    /**
     * Sets up the test cases
     */
    public void setUp() {
        mc = new MediaCalculator("SampleInput1_2022.csv");
    }

}
