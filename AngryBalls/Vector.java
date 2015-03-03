public class Vector {
    // Declare my instance variables!
        private double x;
        private double y;
        private Vector v;
        private double magnitude;
    
    public Vector(double x, double y) {
        // Impelemnt me!
        this.x = x;
        this.y = y;
    } 
    
    public double x() {
        // Implement me!
        return x;
    }
    
    public double y() {
        // Implement me!
        return y;
    }

    public Vector add(Vector v) {
        // Implement me!
        Vector sum = new Vector(v.x() + this.x, v.y() + this.y);
        return sum;
    }

    public Vector scale(double magnitude) {
        // Implement me!
        // take in the magnitude (.5)
        // and creates a new vector with the values multiplied by .5
        // v1.x.scale()
        Vector product = new Vector(magnitude*x(), magnitude*y());
        return product;
    }

}
