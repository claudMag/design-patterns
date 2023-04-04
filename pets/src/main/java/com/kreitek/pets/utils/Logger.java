package com.kreitek.pets.utils;

public class Logger {
  private static volatile Logger instance = null;
  private static int contador = 0;
  private Logger() {
    if (instance != null){
      throw new RuntimeException("Usage getInstance() method to create");
    }
  }

  public static Logger getInstance() {
    if (instance == null) {
      synchronized(Logger.class) {
        if (instance == null) {
          instance = new Logger();
        }
      }
    }
    return instance;
  }

  public void debug(String logTexto){
    contador++;
    System.out.printf("[debug][%d] - %s%n", contador, logTexto);

  }

}
