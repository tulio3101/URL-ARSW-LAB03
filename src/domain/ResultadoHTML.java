
import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;

public class ResultadoHTML {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese la direccion a consultar: ");
    String url = scanner.nextLine();
    System.out.println("La url es: " + url);
    try {
      FileWriter writer = new FileWriter("resultado.html");
      URL query = new URL(url);
      BufferedReader bfr = new BufferedReader(new InputStreamReader(query.openStream()));
      String inputLine = null;
      while ((inputLine = bfr.readLine()) != null) {
        writer.write(inputLine);
      }
      writer.close();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException i) {
      i.printStackTrace();
    }
    scanner.close();

  }

}
