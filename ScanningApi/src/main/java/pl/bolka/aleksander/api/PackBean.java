package pl.bolka.aleksander.api;

public interface PackBean {

  default void getName(){
    System.out.println(getClass().getSimpleName());
  }

}
