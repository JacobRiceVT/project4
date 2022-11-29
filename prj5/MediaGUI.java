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
    private Button sortByChannelName= new Button("Sort by Channel Name");
    private Button sortByEngagementRate= new Button("Sort by Engagement Rate");
    private Button quit= new Button("Quit");
    private Button traditionalEngagementRate= new Button("                           ");
    private Button reachEngagementRate= new Button("                     ");
    private Button month1;
    private Button month2;
    private Button month3;
    private Button quarter;
    private TextShape monthSelected= new TextShape(5,5,"Select A Month");
    private TextShape sortmode= new TextShape(5,20,"Select a sorting mode!");
    private TextShape engagementType= new TextShape(5,35,"");
    
    private int windowWidth=800;
    private int windowHeight=500;
    
    /**
     * @param filename
     */
    public MediaGUI(String fileName){
        
        mediaWindow = new Window();
        mediaWindow.setSize(windowWidth, windowHeight);
       calculator= new MediaCalculator(fileName);
        
        
        mediaWindow.addButton(sortByChannelName, WindowSide.NORTH);
        mediaWindow.addButton(sortByEngagementRate, WindowSide.NORTH);
        mediaWindow.addButton(quit, WindowSide.NORTH);
        
        sortByChannelName.onClick(this, "clickedSortByChannelName");
        sortByEngagementRate.onClick(this, "clickedSortByEngagementRate");
        quit.onClick(this, "clickedQuit");
        
        
        
        
        
        month1=new Button(calculator.getMonth1().getName());
        month2=new Button(calculator.getMonth2().getName());
        month3=new Button(calculator.getMonth3().getName());
        quarter=new Button("Whole Quarter");
        
        mediaWindow.addButton(month1, WindowSide.SOUTH);
        mediaWindow.addButton(month2,WindowSide.SOUTH);
        mediaWindow.addButton(month3,WindowSide.SOUTH);
        mediaWindow.addButton(quarter,WindowSide.SOUTH);
        
       
        mediaWindow.addShape(monthSelected);
        mediaWindow.addShape(sortmode);
        mediaWindow.addShape(engagementType);
        
        traditionalEngagementRate.setTitle("Traditional Engagement Rate");
        reachEngagementRate.setTitle("Reach Engagement Rate");
        
        
        
        
    }
    
    /**
     * Quits the program.
     */
    public void clickedSortByChannelName(Button button) {
        sortmode.setText("Sorting by: Channel Name");
        engagementType.setText("");
        
        mediaWindow.removeButton(traditionalEngagementRate, WindowSide.WEST);
        mediaWindow.removeButton(reachEngagementRate, WindowSide.WEST);
        mediaWindow.setSize(windowWidth, windowHeight);
        mediaWindow.repaint();
    }
    
    /**
     * Quits the program.
     */
    public void clickedSortByEngagementRate(Button button) {
        sortmode.setText("Sorting by: Engagement Rate");
        engagementType.setText("Select a sorting algorithm!");
        mediaWindow.addButton(traditionalEngagementRate, WindowSide.WEST);
        mediaWindow.addButton(reachEngagementRate,WindowSide.WEST);
        mediaWindow.setSize(windowWidth, windowHeight);
        mediaWindow.repaint();
        
    }
    
    
    /**
     * Quits the program.
     */
    public void clickedQuit(Button quit) {
        System.exit(0);
    }

}
