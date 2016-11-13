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
        return new NYHawaiianPizza(new String[]{"pineapple, ham, cheese"});
      case "pepperoni":
        return new NYPepperoniPizza(new String[]{"pepperoni, cheese"});
      case "veggie":
        return new NYVeggiePizza(new String[]{"onion, tomato, jalapeno"});
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
