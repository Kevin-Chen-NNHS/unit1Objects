import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class yay
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
            "http://th01.deviantart.net/fs71/PRE/f/2012/335/7/6/toothless_by_scourge_the_wolf_f-d5mp58n.jpg");
        JOptionPane.showMessageDialog(null, "Hello", "Title",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon (imageLocation));
    }
}