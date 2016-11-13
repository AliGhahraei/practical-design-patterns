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

package ali.pitzasincfactory;

/**
 * Created by ali on 11/12/16
 */
public class Main {
  public static void main(String args[]){
    Factory testNYFactory = new NYFactory();
    Factory testChicagoFactory = new ChicagoFactory();

    testNYFactory.preparePizza("hawaiian");
    System.out.println();
    testChicagoFactory.preparePizza("hawaiian");
    System.out.println();

    testNYFactory.preparePizza("pepperoni");
    System.out.println();
    testChicagoFactory.preparePizza("veggie");
    System.out.println();
  }
}
