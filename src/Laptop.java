
import javax.swing.*;

public class Laptop extends Computer{

    private boolean touchScreen;

    public void setTouchScreen(boolean touchScreen)
    {
        this.touchScreen = touchScreen;
    }

    public boolean getTouchScreen()
    {
        return touchScreen;
    }

    public Laptop()
    {
        this.touchScreen = false;

    }

    public Laptop(boolean touchScreen)
    {
        this.touchScreen = touchScreen;
    }



}
