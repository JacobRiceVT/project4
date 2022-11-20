package prj5;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
import java.text.DecimalFormat;

public class Channel {
    /**
     * Fields
     */
    private String username;
    private String channelName;
    private String country;
    private String mainTopic;
    private int likes;
    private int posts;
    private int followers;
    private int comments;
    private int views;
    private final static  DecimalFormat df =new DecimalFormat(".0");;

    /**
     * Constructor
     * 
     * @param username
     *            username of the person running the channel
     * @param channelName
     *            name of the channel
     * @param country
     *            country the channel is in
     * @param mainTopic
     *            main topic of the channel
     * @param likes
     *            number of likes the channel received in this month
     * @param posts
     *            number of posts the channel had in this month
     * @param followers
     *            number of follower the channel had in this month
     * @param comments
     *            number of comments the channel had in this month
     * @param views
     *            number of views the channel had in this month
     */
    public Channel(
        String username,
        String channelName,
        String country,
        String mainTopic,
        int likes,
        int posts,
        int followers,
        int comments,
        int views) {
        this.username = username;
        this.channelName = channelName;
        this.country = country;
        this.mainTopic = mainTopic;
        this.views = views;
        this.likes = likes;
        this.posts = posts;
        this.followers = followers;
        this.comments = comments;
    }


    /**
     * getting the username
     * 
     * @return username
     */
    public String getUsername() {
        return username;
    }


    /**
     * getting the channelName
     * 
     * @return channelName
     */

    public String getChannelName() {
        return channelName;
    }


    /**
     * getting the country
     * 
     * @return country
     */
    public String getCountry() {
        return country;
    }


    /**
     * getting the mainTopic
     * 
     * @return mainTopic
     */
    public String getMainTopic() {
        return mainTopic;
    }


    /**
     * getting the amount of likes
     * 
     * @return likes
     */
    public int getLikes() {
        return likes;
    }


    /**
     * getting the amount of posts
     * 
     * @return posts
     */
    public int getPosts() {
        return posts;
    }


    /**
     * getting the amount of followers
     * 
     * @return followers
     */
    public int getFollowers() {
        return followers;
    }


    /**
     * getting the amount of comments
     * 
     * @return comments
     */

    public int getComments() {
        return comments;
    }


    /**
     * getting the amount of views
     * 
     * @return views
     */
    public int getViews() {
        return views;
    }


    /**
     * setting the number of views
     * 
     * @param views
     *            the new amount of views
     */
    public void setViews(int views) {
        this.views = views;
    }


    /**
     * setting the amount of likes
     * 
     * @param likes
     *            the new amount of likes
     */
    public void setLikes(int likes) {
        this.likes = likes;
    }


    /**
     * setting the number of posts
     * 
     * @param posts
     *            the new amount of posts
     */
    public void setPosts(int posts) {
        this.posts = posts;
    }


    /**
     * setting the amount of followers
     * 
     * @param followers
     *            the new amount of followers
     */
    public void setFollowers(int followers) {
        this.followers = followers;
    }


    /**
     * setting the amount of comments
     * 
     * @param comments
     *            the new amount of comments
     */
    public void setComments(int comments) {
        this.comments = comments;
    }


    /**
     * getting the traditional engagement rate of the channel this month
     * 
     * @return the traditional engagement rate
     */
    public double getTEngagementRate() {
        double totalEngagement = comments + likes;
        double rate = (totalEngagement / followers) * 100;
        return Double.valueOf(df.format(rate));
    }


    /**
     * getting the reach engagement rate of the channel this month
     * 
     * @return the reach engagement rate
     */

    public double getREngagementRate() {
        double totalEngagement = comments + likes;
        double rate = (totalEngagement / views) * 100;
        return Double.valueOf(df.format(rate));
    }


    /**
     * 
     * 
     * @return int a number > 0 if the current userName String is higher
     *         alphabetically than the other
     *         number < 0 if the current userName String is lower alphabetically
     *         then the other
     */
    public int compareName(Channel chan) {
        return (this.getUsername().toLowerCase().compareTo(chan.getUsername().toLowerCase()));
    }
    /**
     * 
     * 
     * @return int a number > 0 if the current userName traditional engagement rate is higher
     *         than the other
     *         number < 0 if the current userName traditional engagement rate is lower 
     *         then the other
     */
    public int compareTraditional(Channel chan){
        if(this.getTEngagementRate()<chan.getTEngagementRate())
            return -1;
        if(this.getTEngagementRate()>chan.getTEngagementRate())
            return 1;
        return (0);
    }
    /**
     * 
     * 
     * @return int a number > 0 if the current userName reach engagement rate is higher
     *         than the other
     *         number < 0 if the current userName reach engagement rate is lower 
     *         then the other
     */
    public int compareReach(Channel chan){
        if(this.getREngagementRate()<chan.getREngagementRate())
            return -1;
        if(this.getREngagementRate()>chan.getREngagementRate())
            return 1;
        return (0);
    }

}
