package ali.weatheroramaobserver;


/** Class Monitor. */
public class Monitor extends Observer {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public Monitor() { }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /** Display all data in the screen. */
  public void showData() {
    System.out.println("Temperature: " + temperature + "\nHumidity: " + humidity
        + "\nPressure: " + pressure);
  }
}
