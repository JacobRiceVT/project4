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
    private LinkedList channels;
    /**
     * Constructor
     * 
     * @param name
     *            name of the month
     */
    public Month(String name) {
        this.name = name;
        channels = new LinkedList();
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
    public LinkedList getChannels() {
        return channels;
    }
    
    /** 
     * Gets the name
     * 
     * @return the name in the form of a String
     */
    public String getName() { 
        return name; 
    }
}
