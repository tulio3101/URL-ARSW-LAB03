
import java.net.MalformedURLException;
import java.net.URL;

public class URLObject {

  public static void main(String args[]) {

    try {
      URL nasaSite = new URL("https://www.nasa.gov/");

      System.out.println("El protocolo de este sitio es: " + nasaSite.getProtocol());
      System.out.println("La autoridad de este sitio es: " + nasaSite.getAuthority());
      System.out.println("El host de este sitio es: " + nasaSite.getHost());
      System.out.println("El puerto de este sitio es: " + nasaSite.getPort());
      System.out.println("El path de este sitio es: " + nasaSite.getPath());
      System.out.println("El query de este sitio es: " + nasaSite.getQuery());
      System.out
          .println("El archivo que puede retornoar lo mismo que mi query de este sitio es: " + nasaSite.getFile());
      System.out.println("La referencia de este archivo es : " + nasaSite.getRef());

    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

}
