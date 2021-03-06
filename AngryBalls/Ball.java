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
    }

    public Vector getLocation() {
        // Implement me!
        return location;
    }

    public double getRadius() {
        // Implement me!
        return radius;
    }
    
    public void accelerate(Vector acceleration, double grain) {
        // Implement me!
       this.initialVelocity = this.initialVelocity.add(acceleration.scale(grain));
    }

    public void move(double grain) {
        // Implement me!
        this.location = this.location.add(acceleration.scale(grain));
    }
}
