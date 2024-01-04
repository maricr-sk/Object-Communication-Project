public class Human {
    private String name;
    private Heart myHeart;
    private Brain myBrain;
    private Lung leftLung;
    private Lung rightLung;

    public Human(String name) {
        this.name = name;
        this.myHeart = new Heart();
        this.myBrain = new Brain(myHeart, this);
        this.leftLung = new Lung("Left Lung");
        this.rightLung = new Lung("Right Lung");
        this.leftLung.setOtherLung(this.rightLung);
        this.rightLung.setOtherLung(this.leftLung);
    }

    public void senseDanger(){
        //print the old hr
        //increase the hr
        // print the new hr

        System.out.println(myHeart);
        this.myBrain.increaseHeartRate();
        System.out.println(myHeart);
    }



}
