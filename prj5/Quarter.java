package prj5;

/**
 * @author Jung Chang
 * @version 11.17.22
 */
public class Quarter {
    private Month month1;
    private Month month2;
    private Month month3;
    private LinkedList<Channel> month1Channels;
    private LinkedList<Channel> month2Channels;
    private LinkedList<Channel> month3Channels;
    private LinkedList<Channel> quarterChannels;
    public Quarter(Month[]months) {
        month1=months[0];
        month2=months[1];
        month3=months[2];
        month1Channels=month1.getChannels();
        month2Channels=month1.getChannels();
        month3Channels=month1.getChannels();
        quarterChannels=new LinkedList<Channel>();
        addMonthlyChannels(month1Channels);
        addMonthlyChannels(month2Channels);
        addMonthlyChannels(month3Channels);
    }
    public int getIndexOf(Channel channel) {
        for(int i=0;i<quarterChannels.size();i++) {
            if(quarterChannels.get(i).getChannelName().equals(channel.getChannelName())){
                return i;
            }
        }
        return -1;
    }
    public void addMonthlyChannels(LinkedList<Channel>monthChannels) {
        for(int i=0;i<monthChannels.size();i++) {
            Channel channel=monthChannels.get(i);
            int existsIndex=getIndexOf(channel);
            if(existsIndex==-1) {
                quarterChannels.add(channel);
            }
            else {
                Channel exists=quarterChannels.get(existsIndex);
                exists.setLikes(exists.getLikes()+channel.getLikes());
                exists.setPosts(exists.getPosts()+channel.getPosts());
                exists.setFollowers(exists.getFollowers()+channel.getFollowers());
                exists.setComments(exists.getComments()+channel.getComments());
                exists.setPosts(exists.getViews()+channel.getViews());
            }
        }
    }
}
