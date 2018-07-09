public class HW_16_1_Student {
    
    private String firstName;
    private String lastName;
    private double markVolleyaball;
    private double markBadminton;
    private double markSwimming;
    private double markBoxing;
    private double markBilliard;

    public HW_16_1_Student() {
    }

    public HW_16_1_Student(String firstName, String lastName, double markVolleyaball, double markBadminton, double markSwimming, double markBoxing, double markBilliard) {
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
    public double getMarkVolleyBall() {
        return markVolleyaball;
    }
    public double getMarkBadminton() {
        return markBadminton;
    }
    public double getMarkSwimming() {
        return markSwimming;
    }
    public double getMarkBoxing() {
        return markBoxing;
    }
    public double getMarkBilliard() {
        return markBilliard;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMarkVolleyball(double markVolleyaball) {
        this.markVolleyaball = markVolleyaball;
    }
    public void setMarkBadminton(double markBadminton) {
        this.markBadminton = markBadminton;
    }
    public void setMarkSwimming(double markSwimming) {
        this.markSwimming = markSwimming;
    }
    public void setMmarkBoxing(double markBoxing) {
        this.markBoxing = markBoxing;
    }
    public void setMarkBilliard(double markBilliard) {
        this.markBilliard = markBilliard;
    }
    
}