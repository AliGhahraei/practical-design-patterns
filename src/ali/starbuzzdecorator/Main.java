/*
 * Copyright (c) 2016 Ali Ghahraei Figueroa.
 *
 * This file is part of practical-design-patterns.
 *
 * practical-design-patterns is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * practical-design-patterns is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with practical-design-patterns.  If not, see <http://www.gnu.org/licenses/>.
 */

package ali.starbuzzdecorator;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;

/** Main class which prepares beverages and prints them. */
public class Main {
  /** Main method of the application in charge of creating beverages with condiments.
   *
   * @param args default command line arguments for main
   */
  public static void main(String[] args) {
    ArrayList<Beverage> beverages = new ArrayList<>();

    //Creating Beverages
    Beverage houseBlenJohann = new HouseBlen();
    Beverage expressoJennifer = new Expresso();
    Beverage decafAndrea = new Whip(new Decaf());
    Beverage darkRoastXochitl = new Milk(new Mocha(new Soy(new Whip(new DarkRoast()))));

    //Adding them to the same collection
    beverages.add(houseBlenJohann);
    beverages.add(expressoJennifer);
    beverages.add(decafAndrea);
    beverages.add(darkRoastXochitl);

    //Delivering them
    deliverBeverages(beverages);
  }

  /**
   * Print all the beverages in the system.
   *
   * @param beverages produced drinks.
   */
  private static void deliverBeverages(ArrayList<Beverage> beverages) {
    System.out.println("The following drinks are ready:");

    //All beverages are treated equally regardless of whether
    // they are decorated with condiments or not.
    for (Beverage beverage: beverages) {
      System.out.println(StringUtils.capitalize(beverage.toString()));
    }
  }
}
