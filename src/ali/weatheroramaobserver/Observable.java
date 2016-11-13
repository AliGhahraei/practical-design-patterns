package ali.weatheroramaobserver;


import java.util.ArrayList;

/** Class Observable. */
public abstract class Observable {

  //
  // Fields
  //

  protected ArrayList<Observer> observers;
  
  //
  // Constructors
  //
  public Observable() {
    observers = new ArrayList<>();
  }
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /** Set the value of observers.
   * @param newVar the new value of observers
   */
  public void setObservers(ArrayList<Observer> newVar) {
    observers = newVar;
  }

  /** Get the value of observers.
   * @return the value of observers
   */
  private ArrayList<Observer> getObservers() {
    return observers;
  }

  //
  // Other methods
  //

  /** Register a new observer.
   * @param        observer a new observer
   */
  public void register(ali.weatheroramaobserver.Observer observer) {
    this.observers.add(observer);
  }


  /** Remove an observer.
   * @param        observer the observer to remove
   */
  public void remove(ali.weatheroramaobserver.Observer observer) {
  }


  /** Notify all observers. */
  public abstract void notifyObservers();
}
