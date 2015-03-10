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

    public static void main() {
        double redBallRadius = 0;
        double redBallX = 0;
        double redBallY = 0;
        double redBallVelocityX = 0;
        double redBallVelocityY = 0;
        double blueBallRadius = 0;
        double blueBallX = 0;
        double blueBallY = 0;
        double blueBallVelocityX = 0;
        double blueBallVelocityY = 0;
        double grain = 0;

        if (args.length == 0) {
                System.out.println("Usage: java AngryBallsSimulation <redradius> <red x> <red y> <red velocity x>" +
                "<red velocity y> <blue radius> <blue x> <blue y> <blue velocity x> <bluevelocity y> [ <grain> ]" + 
                    
                "All sizes are in meters and the grain is in seconds. The grain is optional and defaults to 1 second if not supplied."); 
            return;

       try { 
        double redBallRadius = Double.parseDouble[1];
        double redBallX = Double.parseDouble[2];
        double redBallY = Double.parseDouble[3];
        double redBallVelocityX = Double.parseDouble[4];
        double redBallVelocityY = Double.parseDouble[5];
        double blueBallRadius = Double.parseDouble[6];
        double blueBallX = Double.parseDouble[7];
        double blueBallY = Double.parseDouble[8];
        double blueBallVelocityX = Double.parseDouble[9];
        double blueBallVelocityY = Double.parseDouble[10];
        double grain = Double.parseDouble[11];

        double radius = redBallRadius;
        } catch { 
            System.out.println("The arguments supplied do not match whatAngryBallsSimulation expects.");
            }
        }
    }
}
