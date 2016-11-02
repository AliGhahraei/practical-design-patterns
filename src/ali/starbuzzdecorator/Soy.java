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

/** Soy condiment. */
class Soy extends Condiment {
  Soy(Beverage decoratedBeverage) {
    super(decoratedBeverage);
  }

  @Override
  public String toString() {
    return "execrable " + getClass().getSimpleName() + applicationMessage;
  }
}