package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone a string with the name
   * @return a string with greet message
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
