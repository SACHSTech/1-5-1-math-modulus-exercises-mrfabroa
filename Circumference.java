class Circumference extends ConsoleProgram {

  /**
  * A program that computes the circumference of a circle given a radius from the user
  * @author:E. Fabroa
  */
  
  public void run() {
    
    // declare variables
    double dblRadius;
    double dblCircumference;

    // get radius
    dblRadius = readDouble("Enter the radius: ");

    // calculate circumference
    dblCircumference = 2 * Math.PI * dblRadius;

    // output results 
    System.out.println("The circumference of a circle with radius " + dblRadius + " is " + dblCircumference);
  }
}