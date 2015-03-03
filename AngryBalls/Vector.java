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
        Vector v = new Vector(x,y);
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
        //Vector v = new Vector(a,b),
        //       w = new Vector(c,d),
        //      sum= v.add(w);


        return null;
    }

    public Vector scale(double magnitude) {
        // Implement me!
        // take in the magnitude (.5)
        // and creates a new vector with the values multiplied by .5
        // v1.x.scale()
        return null;
    }

}
