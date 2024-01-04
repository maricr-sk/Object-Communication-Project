public class Brain {

    private Heart h;
    private Human owner;

    public Brain(Heart h, Human owner){
        this.h = h;
        this.owner = owner;
    }

    public void increaseHeartRate(){
        this.h.beatFaster();
        this.sweat();
    }

    public void sweat(){
        System.out.println("I am sweating.");
        //make my human sweat

    }

}
