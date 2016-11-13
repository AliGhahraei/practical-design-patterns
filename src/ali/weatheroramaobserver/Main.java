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

package ali.weatheroramaobserver;

import static java.lang.Thread.sleep;

/** Main class. */
public class Main {
  /** Main method.
   *
   * @param args command line args.
   */
  public static void main(String[] args) {
    CurrentClimateConditions now = new CurrentClimateConditions(10, 10, 10);
    Monitor testMonitor = new Monitor();
    now.register(testMonitor);

    try {
      changeData(testMonitor, now, 11, 11, 11);
      sleep(2000);
      changeData(testMonitor, now, 12, 12, 12);
      sleep(2000);
      changeData(testMonitor, now, 13, 13, 13);
    } catch (InterruptedException exception) {
      System.out.println("Interrupted");
    }
  }

  private static void changeData(Monitor testMonitor, CurrentClimateConditions now ,int temperature,
                         int humidity, int pressure) {
    now.setTemperature(temperature);
    now.setHumidity(humidity);
    now.setPressure(pressure);
    now.notifyObservers();
    testMonitor.showData();
  }
}
