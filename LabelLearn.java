import java.awt.*;


public class LabelLearn {
    public static void main(String[] args)
    {
        Frame frame = new Frame("Basic");
         frame.setLayout(new FlowLayout());

        Label label = new Label("Hello World!");
         //label.setAlignment(label.CENTER); 
        Label lab2 =  new Label("Welcome in the world of java!!");
         
         frame.add(label);
          frame.add(lab2);

     frame.setSize(400, 200);
        // Setting Visibility of Frame
        frame.setVisible(true);
      
    
    }  
}
