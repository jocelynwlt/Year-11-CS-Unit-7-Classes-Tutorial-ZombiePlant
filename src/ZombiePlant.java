public class ZombiePlant {
    public int potency;
    public int treatment;

    public ZombiePlant(int potency, int treatment){
        this.potency = potency;
        this.treatment = treatment;
    }
    public int getPotency(){
        return potency;
    }

    public int treatmentsNeeded(){
        return treatment;
    }

    public boolean isDangerous(){
        return treatment>0;
    }

    public void treat(int potent){
        if(potent>potency){
            treatment++;
        }
        else if(potent>0&&treatment>0){
            treatment--;
        }
    }
}
