import java.awt.*;
class First extends Frame{
    First(){
        Button b = new Button("Click me");
        b.setBounds(100,120,60,40);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
}
public interface AwtButton {
    public static void main(String[] args) {
        First f = new First();
    }
}
