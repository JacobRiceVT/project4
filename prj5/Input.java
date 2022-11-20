package prj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

/**
 * This class reads input from the text files
 * 
 * @author Holden Weston
 *
 */
public class Input {
    private Month[] months;
    private String fileName;

    public Input(String fName) {
        months = new Month[4];

        Month january = new Month("January");
        Month febuary = new Month("Febuary");
        Month march = new Month("March");
        Month april = new Month("April");

        months[0] = january;
        months[1] = febuary;
        months[2] = march;
        months[3] = april;

        fileName = fName;
    }


    public Month[] getMonthInfo() {
        try {
            this.readDataFile(fileName);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        return months;
    }


    private void readDataFile(String fileName)
        throws FileNotFoundException,
        java.text.ParseException {

        // 10 per line
        Scanner file = new Scanner(new File(fileName));
        int dataCount = 0;
        file.nextLine();
        while (file.hasNextLine()) {
            String read = file.nextLine();
            Scanner currLine = new Scanner(read).useDelimiter(",");
            String tokens[] = new String[10];
            int tokenCount = 0;
            while (currLine.hasNext()) {
                String tokenData = currLine.next();
                tokens[tokenCount++] = tokenData;
            }
            currLine.close();
            if (tokenCount == 10) {
                // Internal Logic for generation
                String mName = tokens[0];
                String username = tokens[1];
                String channelName = tokens[2];
                String country = tokens[3];
                String mainTopic = tokens[4];
                int likes = Integer.parseInt(tokens[5]);
                int posts = Integer.parseInt(tokens[6]);
                int followers = Integer.parseInt(tokens[7]);
                int comments = Integer.parseInt(tokens[8]);
                int views = Integer.parseInt(tokens[9]);

                Channel c = new Channel(username, channelName, country,
                    mainTopic, likes, posts, followers, comments, views);
                if (mName.equals("January")) {
                    months[0].addChannel(c);
                }
                else if (mName.equals("February")) {
                    months[1].addChannel(c);
                }
                else if (mName.equals("March")) {
                    months[2].addChannel(c);
                }
                else if (mName.equals("April")) {
                    months[3].addChannel(c);
                }
                else {

                }
            }
            else {
                throw new java.text.ParseException("parse exception", 1);
            }
        }

        /*
         * Notes
         * 
         * month,username,channel name,country,main
         * topic,likes,posts,followers,comments,views
         */

        file.close();
    }


    /**
     * The project runner method
     */
    public static void main(String[] strings) {
        MediaCalculator calc=new MediaCalculator("SampleInput1_2022.csv");
        if(strings.length!=0) {
            calc = new MediaCalculator(strings[0]);
        }
        Quarter quarter1 = calc.getQuarter();
        LinkedList quarterChannels = quarter1.getQuarterChannels();
        quarterChannels.sortByName();
        for (int i = 0; i < quarterChannels.size(); i++) {
            Channel channel = quarterChannels.get(i);
            System.out.println(channel.getChannelName());
            System.out.println("traditional: " + channel.getTEngagementRate());
            System.out.println("==========");
        }
        System.out.println("**********\r\n" + "**********");
        quarterChannels.sortByReachRate();
        for (int i = 0; i < quarterChannels.size(); i++) {
            Channel channel = quarterChannels.get(i);
            System.out.println(channel.getChannelName());
            System.out.println("reach: " + channel.getREngagementRate());
            System.out.println("==========");
        }
    }
}
