public class Ball {

    // Declare my instance variables!
    private double radius;
    private Vector location;
    private Vector initialVelocity;
    private Vector acceleration;
    private double grain;
    
    public Ball(double radius, Vector location, Vector initialVelocity) {
        // Implement me!
        this.radius = radius; 
        this.location = location; 
        this.initialVelocity = initialVelocity;
        Ball[] balls = new Ball[2];
    }

    public Vector getLocation() {
        // Implement me!
        return this.location;
    }

    public double getRadius() {
        // Implement me!
        return this.radius;
    }
    
    public void accelerate(Vector acceleration, double grain) {
        // Implement me!
    }

    public void move(double grain) {
        // Implement me!
    }

}
