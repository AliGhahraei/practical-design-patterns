package ali.pitzasincfactory;

/**
 * Class NYFactory
 */
public class NYFactory extends Factory {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public NYFactory () { }

  //
  // Methods
  //
  @Override
  public Pizza cookPizza(String pizza) {
    switch (pizza){
      case "hawaiian":
        return new NYHawaiianPizza();
      case "pepperoni":
        return new NYPepperoniPizza();
      case "veggie":
        return new NYVeggiePizza();
      default:
        return null;
    }
  }

  //
  // Accessor methods
  //

  //
  // Other methods
  //

}
