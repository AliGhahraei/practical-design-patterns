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
        return new ChicagoHawaiianPizza();
      case "pepperoni":
        return new ChicagoHawaiianPizza();
      case "veggie":
        return new ChicagoVeggiePizza();
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
