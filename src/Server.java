import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String args[]) {

      try{
          System.out.println("Waiting for Client...");
          ServerSocket ss = new ServerSocket(1024);
          Socket sock = ss.accept();
          System.out.println(" Connection Established");
          BufferedReader input = new BufferedReader(new InputStreamReader(sock.getInputStream()));
          String str = input.readLine();
          PrintWriter output = new PrintWriter(sock.getOutputStream(),true);
          output.println("The Server Reply: " + str);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }

    }



}



