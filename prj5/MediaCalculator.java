package prj5;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Jung Chang
 * @version 11.18.22
 */
public class MediaCalculator {
    /**
     * Fields
     */
    private Month month1;
    private Month month2;
    private Month month3;
    private Quarter quarter;
    private Input reader;

    /**
     * Constructor
     * 
     * @param months
     *            the lists of months
     */
    public MediaCalculator(String fileName) {
        reader = new Input(fileName);
        Month[] months = reader.getMonthInfo();
        month1 = months[0];
        month2 = months[1];
        month3 = months[2];
        quarter = new Quarter(month1, month2, month3);
    }


    /**
     * Tests the getQuarter method
     */
    public Quarter getQuarter() {
        return quarter;
    }

}
