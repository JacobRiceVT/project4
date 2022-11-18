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
     * @param months
     *            the lists of months
     */
    public MediaCalculator(Month[] months) {
        month1 = months[0];
        month2 = months[1];
        month3 = months[2];
        quarter = new Quarter(month1, month2, month2);
    }


    public LinkedList<Channel> getSortedChannelByName(LinkedList<Channel> channels) {
        
    }


    public LinkedList<Channel> getSortedTraditional(LinkedList<Channel> channels) {

    }


    public LinkedList<Channel> getSortedReach(LinkedList<Channel> channels) {

    }

}
