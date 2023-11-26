public class Players extends Person {
    /*
    !!! CALL-OUT !!!
    CHILD CLASS
    */
    private double score;
    private String players;
    public Players() {
        score = 0;
    }
    public void setMoney(double moneyAmnt) {
        score = moneyAmnt;
    }

    public double getMoney() {
        return score;
    }


    @Override
    public String toString() { return "Name: " + getFirstName() + " " + getLastName() + " Money: $" + score; }

}