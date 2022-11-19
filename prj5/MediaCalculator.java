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
    private InputReader reader; 

    /**
     * Constructor
     * 
     * @param months
     *            the lists of months
     */
    public MediaCalculator(String fileName) {
        reader = new InputReader(fileName); 
        Month[] months = reader.getMonthInfo(); 
        month1 = months[0];
        month2 = months[1];
        month3 = months[2];
        quarter = new Quarter(month1, month2, month2);
    }

    public LinkedList<Channel> getSortedChannelByName() {
        LinkedList<Channel> unSorted = quarter.getQuarterChannels();
        LinkedList<Channel> sorted = new LinkedList<Channel>(); 
        
        Channel[] chans = new Channel[unSorted.size()]; 
        //makes a deep copy
        for (int i = 0; i < unSorted.size(); i++) { 
            chans[i] = unSorted.get(i); 
        }
        
        Arrays.sort(chans); 
        
        for (int i = 0; i < unSorted.size(); i++) { 
            sorted.add(chans[i]);
        }
        
        return sorted; 
    }


    public LinkedList<Channel> getSortedTraditional() {
        LinkedList<Channel> unSorted = quarter.getQuarterChannels();
        LinkedList<Channel> sorted = new LinkedList<Channel>(); 
        
        Channel[] chans = new Channel[unSorted.size()]; 
        //makes a deep copy
        for (int i = 0; i < unSorted.size(); i++) { 
            chans[i] = unSorted.get(i); 
        }
        
        Arrays.sort(chans, traditionalOrder);
        for (int i = 0; i < unSorted.size(); i++) { 
            sorted.add(chans[i]);
        }
        return sorted; 
    }

    private Comparator<Channel> traditionalOrder =  new Comparator<Channel>() {
        public int compare(Channel c1, Channel c2) {
            if (c1.getTEngagementRate() > c1.getTEngagementRate()) {
                return -1; 
            } else if (c1.getTEngagementRate() < c1.getTEngagementRate()) {
                return 1; 
            } else { 
                return 0; 
            }
        }
    };
    
    public LinkedList<Channel> getSortedReach(LinkedList<Channel> channels) {
        return null;
    }

}
