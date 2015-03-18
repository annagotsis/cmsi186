public class VectorTestHarness {

    private static int attempts = 0;
    private static int successes = 0;

    public static void main(String[] args) {
        attempts = 0;
        successes = 0;

        test_Vector();
        test_add();
        test_scale();
        test_accelerate();
        test_move();
        test_collision();

        System.out.println(successes + "/" + attempts + " tests passed.");
    }

	private static void displaySuccessIfTrue(boolean value) {
        attempts++;
        successes += value ? 1 : 0;

        System.out.println(value ? "success" : "failure");
    }

	private static void displayFailure() {
        displaySuccessIfTrue(false);
    }

    private static void test_Vector() {
        System.out.println("Testing Vector...");

		Vector v = new Vector(5,10);        
        try {
            displaySuccessIfTrue(5 == v.x());
        } catch(Exception exc) {
            displayFailure();
        }

        try {
            displaySuccessIfTrue(10 == v.y());
        } catch(Exception exc) {
            displayFailure();
        }
	}

	private static void test_add() {
        System.out.println("Testing addition...");
        Vector v = new Vector(2,3),
        	   w = new Vector(5, -2),
        	 sum = v.add(w);
        try {
            displaySuccessIfTrue(7 == sum.x());
        } catch(Exception exc) {
            displayFailure();
        }

        try {
            displaySuccessIfTrue(1 == sum.y());
        } catch(Exception exc) {
            displayFailure();
        }

    }

    private static void test_scale() {
        System.out.println("Testing scale...");
        Vector g = new Vector(5,10);
        Vector xg = g.scale(2);
        try {
            displaySuccessIfTrue(10 == xg.x());
        } catch(Exception exc) {
            displayFailure();
        }

        try {
            displaySuccessIfTrue(20 == xg.y());
        } catch(Exception exc) {
            displayFailure();
        }

	}

	private static void test_accelerate() {
		System.out.println("Testing acceleration...");
        Vector testLocation = new Vector(10,20);
        Vector testInitialVelocity = new Vector(20,20);
        Ball testBall = new Ball(10, testLocation, testInitialVelocity);
        testBall.accelerate(new Vector(0, -9.8), 1);
        testBall.move(1);
		try {
            displaySuccessIfTrue(10 == testBall.x());
        } catch(Exception exc) {
            displayFailure();
        }

        try {
            displaySuccessIfTrue(11.2 == testBall.y());
        } catch(Exception exc) {
            displayFailure();
        }

        try {
            displaySuccessIfTrue(21 == testBall.z());
        } catch(Exception exc) {
            displayFailure();
        }

	} 

    private static void test_move() {
        System.out.println("Testing movement...");

    }

    private static void test_collision() {
        System.out.println("Testing collision...");
    }
}







