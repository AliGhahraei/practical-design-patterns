package ali.pitzasincfactory;

/** Class Factory. */
public abstract class Factory {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Factory() { }
  
  //
  // Methods
  //

  /** Builder method for a pizza.
   *
   * @param pizza the desired pizza. This is sent to cookPizza (factory method)
   */
  void preparePizza(String pizza) {
    Pizza cookedPizza = cookPizza(pizza);

    System.out.println("Preparing " + cookedPizza.toString());
    System.out.println("Preparing the dough");
    System.out.println("Adding the sauce");
    System.out.println("Adding ingredients: " + cookedPizza.getIngredientsString());
    System.out.println("Cooking in the oven 25 mins at 180 degrees");
    System.out.println("Cutting the pizza in slices");
    System.out.println("Putting the pizza in its box");
  }

  /** Factory method to cook pizzas.
   *
   * @param pizza the desired pizza. Concrete factories decide how to process pizza selection
   * @return an instance of a pizza. Concrete factories determine the pizza.
   */
  public abstract Pizza cookPizza(String pizza);

  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
