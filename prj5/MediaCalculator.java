package prj5;


/**
 * @author Jung Chang
 * @version 11.18.22
 */
public class MediaCalculator {
    /**
     * Fields
     */
    private Quarter quarter;

    /**
     * Constructor
     * 
     * @param fileName
     *            the name of the file
     */
    public MediaCalculator(String fileName) {
        Input reader = new Input(fileName);
        Month[] months = reader.getMonthInfo();
        Month month1 = months[0];
        Month month2 = months[1];
        Month month3 = months[2];
        quarter = new Quarter(month1, month2, month3);
    }


    /**
     * Tests the getQuarter method
     * @return quarter1
     */
    public Quarter getQuarter() {
        return quarter;
    }

}
