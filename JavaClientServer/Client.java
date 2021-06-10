import java.io.*;
import java.net.*;
import java.util.Scanner;
  

public class Client 
{
    public static void main(String[] args) throws IOException 
    {
        try
        {
            Scanner scn = new Scanner(System.in);
              
            InetAddress ip = InetAddress.getByName("localhost");
            Socket s = new Socket(ip, 5056);


            OutputStream os = s.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
      
      
            while (true) 
            {
                System.out.println(br.readLine()); 
                String tosend = scn.nextLine();
                pw.println(tosend + "\n");
                
            
                if(tosend.equals("Exit"))
                {
                    System.out.println("Leaving from the server" );
                    Thread.sleep(Server.delay);
                    s.close();
                    System.out.println("Connection closed");
                    break;
                }

                String fromClient = br.readLine();
                System.out.println(fromClient);
            }
        }catch(Exception e){
          
            e.printStackTrace();
        }
    }
}