package prj5;


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

    /**
     * Constructor
     * 
     * @param fileName
     *            the name of the file
     */
    public MediaCalculator(String fileName) {
        Input reader = new Input(fileName);
        Month[] months = reader.getMonthInfo();
        month1 = months[0];
        month2 = months[1];
        month3 = months[2];
        quarter = new Quarter(month1, month2, month3);
    }


    /**
     * @return quarter1
     */
    public Quarter getQuarter() {
        return quarter;
    }
    
    
    /**
     * @return month 1
     */
    public Month getMonth1() {
        return month1;
    }
    
    /**
     * @return month 2
     */
    public Month getMonth2() {
        return month2;
    }
    
    /**
     * @return month 3
     */
    public Month getMonth3() {
        return month3;
    }

}
