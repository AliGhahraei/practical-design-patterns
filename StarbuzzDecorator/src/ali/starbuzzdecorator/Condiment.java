/*
 * Copyright 2016 Ali Ghahraei Figueroa
 *
 * This file is part of StarbuzzDecorator
 *
 * StarbuzzDecorator is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * StarbuzzDecorator is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with StarbuzzDecorator.  If not, see http://www.gnu.org/licenses/.
 */

package ali.starbuzzdecorator;

/**
 * Condiment applied to a beverage following the decorator pattern. It has the instance it decorates
 * which is accessed through set and get and also a protected application message and an abstract
 * toString, so each child class must implement it.
 */
abstract class Condiment extends Beverage {
  private Beverage decoratedBeverage;
  private static final String APPLICATION_STRING = " applied to ";

  // String to show which beverage is being decorated.
  protected String applicationMessage;

  Condiment(Beverage decoratedBeverage) {
    setDecoratedBeverage(decoratedBeverage);
  }

  @Override
  public abstract String toString();

  public Beverage getDecoratedBeverage() {
    return this.decoratedBeverage;
  }

  public void setDecoratedBeverage(Beverage decoratedBeverage) {
    this.decoratedBeverage = decoratedBeverage;

    // Form the message to state which beverage is being decorated.
    this.applicationMessage = APPLICATION_STRING + this.decoratedBeverage;
  }
}
