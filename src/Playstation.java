public class Playstation extends Consoles{
    private boolean playstationplus;

    public Playstation(String name, boolean isOn, boolean playstationplus) {
        super(name, isOn);
        this.playstationplus = playstationplus;
    }

    public boolean isPlaystationplus() {
        return playstationplus;
    }

    public void setPlaystationplus(boolean playstationplus) {
        this.playstationplus = playstationplus;
    }

    public String buyXboxGold(){
        playstationplus = true;
        return "Great I have playstationplus now. I have access to many Spider-man games";
    }
}
