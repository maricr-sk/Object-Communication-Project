public class Lung {
    private String name;
    private Lung other;

    public Lung(String name){
        this.name = name;
    }
    public void setOtherLung(Lung other){
        this.other = other;
    }
    public void breathe(){
        System.out.println(this.name + " is breathing.");
    }
}
