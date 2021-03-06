import java.net.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class URLParser {

    public static void main(String [] args){
        try{
            URL googleURL = new URL("http:www.google.com:80/docs/index.html");
            System.out.println("Protocol: "+ googleURL.getProtocol());
            System.out.println("Host: "+ googleURL.getHost());
            System.out.println("Port: "+ googleURL.getPort());
            System.out.println("Authority: "+ googleURL.getAuthority());
            System.out.println("Path: "+ googleURL.getPath());
            System.out.println("Query: "+ googleURL.getQuery());
            System.out.println("File: "+ googleURL.getFile());
            System.out.println("Ref: "+ googleURL.getRef());


        }catch (MalformedURLException ex){
            ex.printStackTrace();
        }
    }
}
