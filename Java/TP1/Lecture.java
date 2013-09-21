import java.io.*;

public class Lecture {
  static BufferedReader flot = new BufferedReader(new InputStreamReader(System.in));

  static String lireString() {
    String s=null;
    try {
      s=flot.readLine();
    }
    catch (IOException e) {
      System.err.println("Erreur de lecture");
    }
    return s;
  }

  static int lireInt() {
    String s=null;
    try {
      s=flot.readLine();
    }
    catch (IOException e) {
      System.err.println("Erreur de lecture");
    }
    return Integer.parseInt(s);
  }

  static double lireDouble() {
    String s=null;
    try {
      s=flot.readLine();
    }
    catch (IOException e) {
      System.err.println("Erreur de lecture");
    }
    return Double.valueOf(s).doubleValue();
  }



}



