import java.io.*;
import java.util.*;
import java.net.*;
  

public class Server 
{   
    static HashMap<String, Integer> serverMap = new HashMap<String, Integer>();
    public static int MAX_CLIENTS = 20;
    public static int CURRENT_USERS = 0;
    public static int delay =  (int)Math.floor(Math.random()*(5000-1000+1)+1000);
    static List<Object> list = new ArrayList<Object>();
    public static void main(String[] args) throws IOException 
    {
        ServerSocket ss = new ServerSocket(5056);
        serverMap.put("audi", 5);
        serverMap.put("volkswagen", 10);
        serverMap.put("mercedes", 2);
        serverMap.put("bmw", 1);
        serverMap.put("opel", 7);
        System.out.println("[SERVER] ALIVE\n");
        while (true) 
        {
            Socket s = null;
          
            try 
            {
                if(CURRENT_USERS < MAX_CLIENTS){
                s = ss.accept();
                Thread.sleep(delay);
                CURRENT_USERS++;
                System.out.println("A new client is connected \n");
                System.out.println("CURRENT USERS ["+ CURRENT_USERS + "/" + MAX_CLIENTS +"]" );
                int user = (int)(Math.random() * 100) + 1;
                String id = "CLIENT_"+ user;

                InputStream is = s.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                OutputStream os = s.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true);
                
                Thread t = new ClientHandler(s, is, br, os ,pw, id);
                Thread.sleep(delay);
                pw.println("OK"); 
                t.start();
            }
            if(CURRENT_USERS >= MAX_CLIENTS){
                s = ss.accept();
                OutputStream os = s.getOutputStream();
                PrintWriter pw = new PrintWriter(os, true);
                Thread.sleep(delay);
                pw.println("REFUSED");
                System.out.println("USER TRIED TO JOIN BUT SERVER IS FULL ACTUALLY");
                s.close();
                break;
            }


            }
            catch (Exception e){
             
                s.close();
                e.printStackTrace();
            }
        }
    }
}
  

class ClientHandler extends Thread 
{
 
    final InputStream is;
    final BufferedReader br;
    final OutputStream os;
    final PrintWriter pw;
    final Socket s;
    public String id;
      
  
  
    public ClientHandler(Socket s, InputStream is, BufferedReader br, OutputStream os, PrintWriter pw, String id) 
    {
        this.s = s;
        this.is = is;
        this.br = br;
        this.os = os;
        this.pw = pw;
        this.id = id;
    }
  
    
    @Override
    public void run() 
    {
        System.out.println("get_audi | get_mercedes | get_volkswagen | get_bmw | get_opel");
        String fromClient = null;
        while (true) 
        {
            try {
              
                    Thread.sleep(Server.delay);
               
                    
                fromClient = br.readLine();
                System.out.println("["+this.id+"]: " + br.readLine());
                
                switch (fromClient) {
                    case "get_audi" :
                            if(Server.serverMap.get("audi") > 0){
                                Audi audi = new Audi(2002, "A6 C5");
                                Server.list.add(audi);
                                int getLess = Server.serverMap.get("audi") -1;
                                Server.serverMap.replace("audi", getLess);
                                Thread.sleep(Server.delay);
                                pw.println("[SERVER]: CLient ["+this.id+"] get " + audi + "\n");
                                System.out.println("User ["+this.id+"] get from server " + audi + "\n");
                            } else {
                                pw.println("[SERVER]: CLient ["+this.id+"] get random" + anyItem() + "\n");
                                System.out.println("User ["+this.id+"] get from server random " + anyItem() + "\n");
                                
                            }
                            break;
                    case "get_opel" :
                            if(Server.serverMap.get("opel") > 0){
                                Opel opel = new Opel(2000, "Vectra");
                                Server.list.add(opel);
                                int getLess = Server.serverMap.get("opel") -1;
                                Server.serverMap.replace("opel", getLess);
                                Thread.sleep(Server.delay);
                                pw.println("[SERVER]: CLient ["+this.id+"] get " + opel + "\n");
                                System.out.println("User ["+this.id+"] get from server " + opel + "\n");
                            } else {
                                pw.println("[SERVER]: CLient ["+this.id+"] get random" + anyItem() + "\n");
                                System.out.println("User ["+this.id+"] get from server random " + anyItem() + "\n");
                                
                            }
                        
                        break;
                    case "get_mercedes" :
                            if(Server.serverMap.get("mercedes") > 0){
                                Mercedes mercedes = new Mercedes(2012, "AMG");
                                Server.list.add(mercedes);
                                int getLess = Server.serverMap.get("mercedes") -1;
                                Server.serverMap.replace("mercedes", getLess);
                                Thread.sleep(Server.delay);
                                pw.println("[SERVER]: CLient ["+this.id+"] get " + mercedes + "\n");
                                System.out.println("User ["+this.id+"] get from server " + mercedes + "\n");
                            } else {
                                pw.println("[SERVER]: CLient ["+this.id+"] get random" + anyItem() + "\n");
                                System.out.println("User ["+this.id+"] get from server random " + anyItem() + "\n");
                                
                            }
                        
                        break;
                    case "get_volkswagen" :
                            if(Server.serverMap.get("volkswagen") > 0){
                                Volkswagen volkswagen = new Volkswagen(2002, "A6 C5");
                                Server.list.add(volkswagen);
                                int getLess = Server.serverMap.get("volkswagen") -1;
                                Server.serverMap.replace("volkswagen", getLess);
                                Thread.sleep(Server.delay);
                                pw.println("[SERVER]: CLient ["+this.id+"] get " + volkswagen + "\n");
                                System.out.println("User ["+this.id+"] get from server " + volkswagen + "\n");
                            } else {
                                pw.println("[SERVER]: CLient ["+this.id+"] get random" + anyItem() + "\n");
                                System.out.println("User ["+this.id+"] get from server random " + anyItem() + "\n");
                                
                            }
                        
                        break;
                    case "get_bmw" :
                            if(Server.serverMap.get("bmw") > 0){
                                Bmw bmw = new Bmw(2002, "A6 C5");
                                Server.list.add(bmw);
                                int getLess = Server.serverMap.get("bmw") -1;
                                Server.serverMap.replace("bmw", getLess);
                                Thread.sleep(Server.delay);
                                pw.println("[SERVER]: CLient ["+this.id+"] get " + bmw + "\n");
                                System.out.println("User ["+this.id+"] get from server " + bmw + "\n");
                            } else {
                                pw.println("[SERVER]: CLient ["+this.id+"] get random " + anyItem() + "\n");
                                System.out.println("User ["+this.id+"] get from server random " + anyItem() + "\n");
                                
                            }
                       
                        break;
                    case "Exit" : 
                            System.out.println(this.id + " sends exit\n");
                            Thread.sleep(Server.delay);
                            Server.CURRENT_USERS--;
                            this.s.close();
                            System.out.println(this.id + "left\n");
                            System.out.println("CURRENT USERS ["+ Server.CURRENT_USERS + "/" + Server.MAX_CLIENTS +"]" );
                            break;
                    default:
                        Thread.sleep(Server.delay);
                        pw.println("[SERVER]: CLient ["+this.id+"] get random " + anyItem() + "\n");
                        System.out.println("User ["+this.id+"] get from server random " + anyItem() + "\n");
                        break;
                }
    
            } catch (IOException e) {
                e.printStackTrace();
                
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            } 
        }
    }

    public Object anyItem(){
        Random random = new Random();
        int index = random.nextInt(Server.list.size());
        Object item = Server.list.get(index);
        return item;
    }

}