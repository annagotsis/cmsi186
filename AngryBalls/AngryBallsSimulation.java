public class AngryBallsSimulation {

	public static double grain;
	public static Ball redBall;
	public static Ball blueBall;

	public static String usageError = "Usage: java AngryBallsSimulation <redradius> <red x> <red y> <red velocity x>" +
                "<red velocity y> <blue radius> <blue x> <blue y> <blue velocity x> <bluevelocity y> [ <grain> ]";
    public static String wrongArguments = "The arguments supplied do not match what AngryBallsSimulation expects.";
    public static String sizes = "All sizes are in meters and the grain is in seconds. The grain is optional and defaults to 1 second if not supplied.";
             
	

	public AngryBallsSimulation(double redBallRadius, double redBallX, double redBallY, double redBallVelocityX, double redBallVelocityY, double blueBallRadius, double blueBallX, double blueBallY, double blueBallVelocityX, double blueBallVelocityY, double grain) {
		
		Ball red = new Ball(redBallRadius, new Vector(redBallX, redBallY) , new Vector(redBallVelocityX, redBallVelocityY)); 
		Ball blue = new Ball(blueBallRadius, new Vector(blueBallX, blueBallY), new Vector(blueBallVelocityX, blueBallVelocityY));
		grain = grain;
	}

	public AngryBallsSimulation(double redBallRadius, double redBallX, double redBallY, double redBallVelocityX, double redBallVelocityY, double blueBallRadius, double blueBallX, double blueBallY, double blueBallVelocityX, double blueBallVelocityY) {
		
		Ball red = new Ball(redBallRadius, new Vector(redBallX, redBallY) , new Vector(redBallVelocityX, redBallVelocityY)); 
		Ball blue = new Ball(blueBallRadius, new Vector(blueBallX, blueBallY), new Vector(blueBallVelocityX, blueBallVelocityY));
	}


	public boolean collision (Ball R, Ball B) {
       //if (this.getRadius()
       //if (distance formula) is less than one then return true
        if (((Math.sqrt(((R.getLocation().x() - B.getLocation().x()) * (R.getLocation().x() - B.getLocation().x())) - ((R.getLocation().y() - B.getLocation().y()) * (R.getLocation().y() - B.getLocation().y())))) - B.getRadius() - R.getRadius())  <= 0) {
            return true;
        } else {
            return false;
       }
    } 
	
	public static void main(String[] args) {
		boolean argumentsValid = true;
		double[] pArgs = new double[11];

		if (args.length == 10) {
    		try {
            	for (int i = 0; i < args.length; i++) { 
                    pArgs[i] = Double.parseDouble(args[i]);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(wrongArguments + "\n" + usageError + "\n" + sizes);
            }

			grain = 1.0;
			AngryBallsSimulation sim = new AngryBallsSimulation(pArgs[0], pArgs[1], pArgs[2], pArgs[3], pArgs[4], pArgs[5], pArgs[6], pArgs[7], pArgs[8], pArgs[9], grain);
            sim.simulation(redBall, blueBall, grain);
		
		} else if (args.length == 11) {
			try {
            	for (int i = 0; i < args.length; i++) { 
                    pArgs[i] = Double.parseDouble(args[i]);
                }
            } catch (NumberFormatException nfe) {
                System.out.println(wrongArguments + "\n" + usageError + "\n" + sizes);            }

			grain = pArgs[10];
			AngryBallsSimulation sim = new AngryBallsSimulation(pArgs[0], pArgs[1], pArgs[2], pArgs[3], pArgs[4], pArgs[5], pArgs[6], pArgs[7], pArgs[8], pArgs[9], grain);
            sim.simulation(redBall, blueBall, grain);
		
		} else if (args.length == 0) {
			System.out.println(usageError + "\n" + sizes);
		} else {
			System.out.println(wrongArguments + "\n"+ usageError + "\n" + sizes);
		}
	} 

	public void simulation(Ball red, Ball blue, double grain) {
		int t = 0;
		boolean simul = true;
		boolean collided = false;

		while (simul) {
			System.out.println(redBall.getRadius() + " " + redBall.getLocation() + " " + blueBall.getRadius() + " " + blueBall.getLocation());
			simul = ((redBall.getLocation().y() > 0) && (blueBall.getLocation().y() > 0));
            
			redBall.move(grain);
			blueBall.move(grain);
			redBall.accelerate(new Vector (0, -9.8), grain);
			blueBall.accelerate(new Vector (0, -9.8), grain);
			t += 1;

			if ((collision(blueBall, redBall))) {
              collided = true;
            }

			if (redBall.getLocation().y() <= 0 && blueBall.getLocation().y() <= 0) {
				System.out.println("end");
			}

			if ((simul) && (collided)) {
				System.out.println("end");
				System.out.println("The balls collided at timestamp" + t + "with the red ball at " + redBall.getLocation() + "and the blue ball at "+ blueBall.getLocation());

			}
			if ((!collided) && (!simul)) {
				System.out.println("end");
				System.out.println("The balls did not collide");
			}
		}
	}	
}


