package ali.weatheroramaobserver;


/** Class Observer. */
public abstract class Observer {

  //
  // Fields
  //

  protected int pressure;
  protected int humidity;
  protected int temperature;
  
  //
  // Constructors
  //
  public Observer() { }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /** Set the value of pressure.
   * @param newVar the new value of pressure
   */
  public void setPressure(int newVar) {
    pressure = newVar;
  }

  /** Get the value of pressure.
   * @return the value of pressure
   */
  public int getPressure() {
    return pressure;
  }

  /** Set the value of humidity.
   * @param newVar the new value of humidity
   */
  public void setHumidity(int newVar) {
    humidity = newVar;
  }

  /** Get the value of humidity.
   * @return the value of humidity
   */
  public int getHumidity() {
    return humidity;
  }

  /** Set the value of temperature.
   * @param newVar the new value of temperature
   */
  public void setTemperature(int newVar) {
    temperature = newVar;
  }

  /** Get the value of temperature.
   * @return the value of temperature
   */
  public int getTemperature() {
    return temperature;
  }

  //
  // Other methods
  //

  /** Update observers.
   * @param        humidity humidity to display.
   * @param        pressure pressure to display.
   * @param        temperature temperature to display.
   */
  void update(int humidity, int pressure, int temperature) {
    this.humidity = humidity;
    this.pressure = pressure;
    this.temperature = temperature;
  }

  /** Show data in some way. */
  public abstract void showData();
}
