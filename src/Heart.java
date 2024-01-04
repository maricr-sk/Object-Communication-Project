public class Heart {

    private int hr;
    public final int RESTINGHR = 72;

    public Heart(){
        hr = RESTINGHR;
    }

    public void beatFaster(){
        this.hr += 30;
    }

    public void beatSlower(){
        this.hr -= 30;
    }

    @Override public String toString(){
        return "Heartrate = " + this.hr;
    }

}
