package ali.pitzasincfactory;

import java.util.Arrays;

/** Class Pizza. */
public abstract class Pizza {

  //
  // Fields
  //
  private String[] ingredients;

  //
  // Constructors
  //
  public Pizza(String[] ingredients) {
    this.ingredients = ingredients;
  }
  
  //
  // Methods
  //

  /** Returns the simple class name as the representation of this class.
   *
   * @return string representation.
   */
  @Override
  public String toString() {
    return getClass().getSimpleName();
  }

  //
  // Accessor methods
  //

  /** Returns the ingredients as a single string.
   *
   * @return a string containing the ingredients joined by a comma.
   */
  String getIngredientsString() {
    return String.join(",", Arrays.asList(this.ingredients));
  }


  //
  // Other methods
  //

}
