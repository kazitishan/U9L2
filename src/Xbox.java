public class Xbox extends Consoles{
    private boolean XboxGold;

    public Xbox(String name, boolean isOn, boolean xboxGold) {
        super(name, isOn);
        XboxGold = xboxGold;
    }

    public boolean isXboxGold() {
        return XboxGold;
    }

    public void setXboxGold(boolean xboxGold) {
        XboxGold = xboxGold;
    }

    public String buyXboxGold(){
        XboxGold = true;
        return "Great I have Xbox Gold now. I have access to many Halo games";
    }
}
