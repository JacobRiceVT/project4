package prj5;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
public class Month {
    /**
     * Fields
     */
    private String name;
    private LinkedList<Channel> channels;
    /**
     * Constructor
     * 
     * @param name
     *            name of the month
     */
    public Month(String name) {
        this.name = name;
        channels = new LinkedList<Channel>();
    }


    /**
     * Adding a channel
     * 
     * @param channel
     *            channel to be added
     */
    public void addChannel(Channel channel) {
        channels.add(channel);
    }


    /**
     * Getting the channels
     * 
     * @return the list of channels of this month
     */
    public LinkedList<Channel> getChannels() {
        return channels;
    }
}
