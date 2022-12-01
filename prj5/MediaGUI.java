package prj5;

import java.awt.Color;
import cs2.Button;
import cs2.Shape;
import cs2.TextShape;
import cs2.Window;
import cs2.WindowSide;

public class MediaGUI {
    /**
     * Setting up buttons and other fields
     */
    private Window mediaWindow;
    private MediaCalculator calculator;
    private Button sortByChannelName = new Button("Sort by Channel Name");
    private Button sortByEngagementRate = new Button("Sort by Engagement Rate");
    private Button quit = new Button("Quit");
    private Button traditionalEngagementRate = new Button(
        "                           ");
    private Button reachEngagementRate = new Button("                     ");
    private Button month1;
    private Button month2;
    private Button month3;
    private Button quarter;
    private TextShape monthSelected = new TextShape(5, 5, "Select A Month");
    private TextShape sortmode = new TextShape(5, 20, "Select a sorting mode!");
    private TextShape engagementType = new TextShape(5, 35, "");
    


    private int sortChoice = 0;

    private int windowWidth = 800;
    private int windowHeight = 500;

    /**
     * @param filename
     */
    public MediaGUI(String fileName) {

        mediaWindow = new Window();
        mediaWindow.setSize(windowWidth, windowHeight);
        calculator = new MediaCalculator(fileName);

        mediaWindow.addButton(sortByChannelName, WindowSide.NORTH);
        mediaWindow.addButton(sortByEngagementRate, WindowSide.NORTH);
        mediaWindow.addButton(quit, WindowSide.NORTH);

        sortByChannelName.onClick(this, "clickedSortByChannelName");
        sortByEngagementRate.onClick(this, "clickedSortByEngagementRate");
        quit.onClick(this, "clickedQuit");

        month1 = new Button(calculator.getMonth1().getName());
        month2 = new Button(calculator.getMonth2().getName());
        month3 = new Button(calculator.getMonth3().getName());
        quarter = new Button("Whole Quarter");

        month1.onClick(this, "clickedMonth1");
        month2.onClick(this, "clickedMonth2");
        month3.onClick(this, "clickedMonth3");
        quarter.onClick(this, "clickedQuarter");

        refreshText();
        
        traditionalEngagementRate.onClick(this, "clickedTraditional");
        reachEngagementRate.onClick(this, "clickedReach");

        traditionalEngagementRate.setTitle("Traditional Engagement Rate");
        reachEngagementRate.setTitle("Reach Engagement Rate");

    }
    
    public void refreshText() {
        mediaWindow.addShape(monthSelected);
        mediaWindow.addShape(sortmode);
        mediaWindow.addShape(engagementType);
    }
    
    public void addMonthButtons() {
        refreshText();
        mediaWindow.addButton(month1, WindowSide.SOUTH);
        mediaWindow.addButton(month2, WindowSide.SOUTH);
        mediaWindow.addButton(month3, WindowSide.SOUTH);
        mediaWindow.addButton(quarter, WindowSide.SOUTH);
        monthSelected.setText("Select A Month");
        
    }
    
    public void removeMonthButtons() {
        refreshText();
        mediaWindow.removeButton(month1, WindowSide.SOUTH);
        mediaWindow.removeButton(month2, WindowSide.SOUTH);
        mediaWindow.removeButton(month3, WindowSide.SOUTH);
        mediaWindow.removeButton(quarter, WindowSide.SOUTH);
        
    }


    public void clickedMonth1(Button button) {
        displayData(1,sortChoice);
        monthSelected.setText(month1.getTitle());
        refreshText();
        
        

    }
    
    public void clickedMonth2(Button button) {
        displayData(2,sortChoice);
        monthSelected.setText(month2.getTitle());
        refreshText();

    }
    
    public void clickedMonth3(Button button) {
        displayData(3,sortChoice);
        monthSelected.setText(month3.getTitle());
        refreshText();

    }
    
    public void clickedQuarter(Button button) {
        displayData(4,sortChoice);
        monthSelected.setText("Quarter");
        refreshText();

    }
    
    public void clickedTraditional(Button button) {
        engagementType.setText("Traditional sorting!");
        mediaWindow.repaint();
        refreshText();
        
        addMonthButtons();
        
        sortChoice=2;
    }
    
    public void clickedReach(Button button) {
        engagementType.setText("Sorting by Reach!");
        mediaWindow.repaint();
        refreshText();
        addMonthButtons();
        
        sortChoice=1;
    }


    /**
     * Quits the program.
     */
    public void clickedSortByChannelName(Button button) {
        sortChoice = 3;
        mediaWindow.removeAllShapes();

        sortmode.setText("Sorting by: Channel Name");
        engagementType.setText("");
        addMonthButtons();
        mediaWindow.removeButton(traditionalEngagementRate, WindowSide.WEST);
        mediaWindow.removeButton(reachEngagementRate, WindowSide.WEST);
        mediaWindow.setSize(windowWidth, windowHeight);
        mediaWindow.repaint();
        
    }


    /**
     * Quits the program.
     */
    public void clickedSortByEngagementRate(Button button) {
        sortChoice = 0;
        mediaWindow.removeAllShapes();
        
        sortmode.setText("Sorting by: Engagement Rate");
        engagementType.setText("Select a sorting algorithm!");
        mediaWindow.addButton(traditionalEngagementRate, WindowSide.WEST);
        mediaWindow.addButton(reachEngagementRate, WindowSide.WEST);
        removeMonthButtons();

        mediaWindow.setSize(windowWidth, windowHeight);
        mediaWindow.removeShape(monthSelected);
        mediaWindow.repaint();

    }
    
    


    /**
     * Quits the program.
     */
    public void clickedQuit(Button quit) {
        System.exit(0);
    }


    /**
     * @param monthChoice
     * @param sortChoice
     * @return month or quarter.
     */
    
    public Object sortData(int monthChoice, int sortChoice) {
        if (monthChoice != 0) {
            if (sortChoice != 0) {
                switch (monthChoice) {
                    case 1:
                        switch (sortChoice) {
                            case 1:
                                calculator.getMonth1().getChannels()
                                    .sortByReachRate();
                                
                                break;
                            case 2:
                                calculator.getMonth1().getChannels()
                                    .sortByTraditionalRate();
                                break;

                            case 3:
                                calculator.getMonth1().getChannels()
                                    .sortByName();
                                break;
                                
                        }
                        return calculator.getMonth1();

                    case 2:
                        switch (sortChoice) {
                            case 1:
                                calculator.getMonth2().getChannels()
                                    .sortByReachRate();
                                break;
                            case 2:
                                calculator.getMonth2().getChannels()
                                    .sortByTraditionalRate();
                                break;

                            case 3:
                                calculator.getMonth2().getChannels()
                                    .sortByName();
                                break;

                        }
                        return calculator.getMonth2();
                    case 3:
                        switch (sortChoice) {
                            case 1:
                                calculator.getMonth3().getChannels()
                                    .sortByReachRate();
                                break;
                            case 2:
                                calculator.getMonth3().getChannels()
                                    .sortByTraditionalRate();
                                break;

                            case 3:
                                calculator.getMonth3().getChannels()
                                    .sortByName();
                                break;

                        }
                        return calculator.getMonth3();
                    case 4:
                        switch (sortChoice) {
                            case 1:
                                calculator.getQuarter().getQuarterChannels()
                                    .sortByReachRate();
                                break;
                            case 2:
                                calculator.getQuarter().getQuarterChannels()
                                    .sortByTraditionalRate();
                                break;

                            case 3:
                                calculator.getQuarter().getQuarterChannels()
                                    .sortByName();
                                break;

                        }
                        return calculator.getQuarter();
                        
                }
            }
        }
        return null;
    }


    /**
     * @param monthChoice
     * @param sortChoice
     */
    public void displayData(int monthChoice, int sortChoice) {
        
        int barWidth=30;
        int barSpace=100;
        int barHeight=100;
        Object sortedData=sortData(monthChoice, sortChoice);
        String barString="Missing data!";
        
        
        if (sortedData.getClass()==calculator.getMonth1().getClass()) {
            
            Month monthData=(Month)sortedData;
            

        

            
            
            
            for(int i=0;i<monthData.getChannels().size();i++) {
                
                    if (sortChoice != 0) {
                        switch (sortChoice) {
                            case 1:
                                barString=Double.toString(monthData.getChannels().get(i).getREngagementRate());
                                break;
                            case 2:
                                barString=Double.toString(monthData.getChannels().get(i).getTEngagementRate());
                            case 3:
                                barString=monthData.getChannels().get(i).getChannelName();
                        }
                    }
                
                
                Shape newShape1=new Shape(200+barSpace*i,200,barWidth,barHeight);
                
                Shape newShape2=new TextShape(200+barSpace*i,barWidth,
                    barString);
                
                mediaWindow.addShape(newShape1);
                mediaWindow.addShape(newShape2);
            }
            
            
        
        }else if (sortedData.getClass()==calculator.getQuarter().getClass()) {
            sortedData=(Quarter)sortedData;

    
        }
    }
}
