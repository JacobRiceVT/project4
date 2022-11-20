package prj5;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
public class Quarter {
    /**
     * Fields
     */
    private Month month1;
    private Month month2;
    private Month month3;
    private LinkedList month1Channels;
    private LinkedList month2Channels;
    private LinkedList month3Channels;
    private LinkedList quarterChannels;

    /**
     * Constructor
     * 
     * @param month1
     *            the first month of the quarter
     * @param month2
     *            the second month of the quarter
     * @param month3
     *            the third month of the quarter
     */
    public Quarter(Month month1, Month month2, Month month3) {
        this.month1 = month1;
        this.month2 = month2;
        this.month3 = month3;
        month1Channels = month1.getChannels();
        month2Channels = month2.getChannels();
        month3Channels = month3.getChannels();
        quarterChannels = new LinkedList();
        addMonthlyChannels(month1Channels);
        addMonthlyChannels(month2Channels);
        addMonthlyChannels(month3Channels);
    }
    
    /**
     * checking if a Channel exists in the quarterChannels list
     * 
     * @return the index of the existing channel. Returns -1 if it does not
     *         exist.
     */
    private int getIndexOf(Channel channel) {
        for (int i = 0; i < quarterChannels.size(); i++) {
            if (quarterChannels.get(i).getChannelName().equals(channel
                .getChannelName())) {
                return i;
            }
        }
        return -1;
    }

    

    /**
     * adding the channels in the months to the general channels of the quarter
     */
    private void addMonthlyChannels(LinkedList monthChannels) {
        for (int i = 0; i < monthChannels.size(); i++) {
            Channel channel = monthChannels.get(i);
            int existsIndex = getIndexOf(channel);
            if (existsIndex == -1) {
                quarterChannels.add(channel);
            }
            else {
                Channel exists = quarterChannels.get(existsIndex);
                exists.setLikes(exists.getLikes() + channel.getLikes());
                exists.setPosts(exists.getPosts() + channel.getPosts());
                exists.setFollowers(channel.getFollowers());
                exists.setComments(exists.getComments() + channel
                    .getComments());
                exists.setViews(exists.getViews() + channel.getViews());
            }
        }
    }


    /**
     * getting the quarterChannels list
     * 
     * @return quarteChannels
     */
    public LinkedList getQuarterChannels() {
        return quarterChannels;
    }
}
