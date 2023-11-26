public class Single extends Person {
    /*
    !!! CALL-OUT !!!
    CHILD CLASS
    */
    private double score;
    private String players;
    public Single() {
        score = 0;
    }

    public void setMoney(double scoreAmnt) {
        score = scoreAmnt;
    }

    public double getMoney() {
        return score;
    }


    @Override
    public String toString() { return "Name: " + getFirstName() + " " + getLastName() + " Money: $" + score; }
}