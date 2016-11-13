package ali.pitzasincfactory;

/**
 * Class ChicagoFactory
 */
public class ChicagoFactory extends Factory {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public ChicagoFactory () { }
  
  //
  // Methods
  //
  @Override
  public Pizza cookPizza(String pizza) {
    switch (pizza){
      case "hawaiian":
        return new ChicagoHawaiianPizza(new String[]{"pineapple, ham, cheese"});
      case "pepperoni":
        return new ChicagoPepperoniPizza(new String[]{"pepperoni, cheese"});
      case "veggie":
        return new ChicagoVeggiePizza(new String[]{"onion, tomato, jalapeno"});
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
