public class HW_16_1_Student {
    
    private String firstName;
    private String lastName;
    private int markVolleyaball;
    private int markBadminton;
    private int markSwimming;
    private int markBoxing;
    private int markBilliard;

    public HW_16_1_Student() {
    }

    public HW_16_1_Student(String firstName, String lastName, int markVolleyaball, int markBadminton, int markSwimming, int markBoxing, int markBilliard) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.markVolleyaball = markVolleyaball;
        this.markBadminton = markBadminton;
        this.markSwimming = markSwimming;
        this.markBoxing = markBoxing;
        this.markBilliard = markBilliard;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getMarkVolleyBall() {
        return markVolleyaball;
    }
    public int getMarkBadminton() {
        return markBadminton;
    }
    public int getMarkSwimming() {
        return markSwimming;
    }
    public int getMarkBoxing() {
        return markBoxing;
    }
    public int getMarkBilliard() {
        return markBilliard;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMarkVolleyball(int markVolleyaball) {
        this.markVolleyaball = markVolleyaball;
    }
    public void setMarkBadminton(int markBadminton) {
        this.markBadminton = markBadminton;
    }
    public void setMarkSwimming(int markSwimming) {
        this.markSwimming = markSwimming;
    }
    public void setMmarkBoxing(int markBoxing) {
        this.markBoxing = markBoxing;
    }
    public void setMarkBilliard(int markBilliard) {
        this.markBilliard = markBilliard;
    }
    
}