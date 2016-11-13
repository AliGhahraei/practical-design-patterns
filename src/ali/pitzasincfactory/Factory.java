package ali.pitzasincfactory;

/**
 * Class Factory
 */
abstract public class Factory {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Factory () { }
  
  //
  // Methods
  //
  public void preparePizza(String pizza){
    System.out.println("Preparing " + cookPizza(pizza));
    System.out.println("Preparing the dough");
    System.out.println("Adding the sauce");
    System.out.println("Adding ingredients");
    System.out.println("Cooking in the oven 25 mins at 180 degrees");
    System.out.println("Cutting the pizza in slices");
    System.out.println("Putting the pizza in its box");
  }

  public abstract Pizza cookPizza(String pizza);

  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
