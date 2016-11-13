package ali.pitzasincfactory;

import java.util.ArrayList;

/**
 * Class Pizza
 */
abstract public class Pizza {

  //
  // Fields
  //
  private String ingredients[];
  
  //
  // Constructors
  //
  public Pizza (String[] ingredients) {
    this.ingredients = ingredients;
  }
  
  //
  // Methods
  //
  @Override
  public String toString(){
    return getClass().getSimpleName();
  }

  //
  // Accessor methods
  //
  public String getIngredientsString() {
    return String.join(",", ingredients);
  }


  //
  // Other methods
  //

}
