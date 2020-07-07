 
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import static java.lang.System.in;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Powerzak
 */
public class Klient  extends Thread {
     // initialize socket and input output streams 
    private Socket socket            = null; 
    private DataInputStream  in   = null; 
    private DataOutputStream out     = null; 
 private String nazwa; 
 String nazwa2="";
  Thread czytanie;
  String usuwanie="";
   String wynik="";
    String karta="";
    String wiadomosc="";
     
  int i=2;
  String oknos="";
  String pulaa="";
   ArrayList<String> loginy = new ArrayList<String>();
    
   public void  Klient()  throws IOException
   {
    
    
			
   }
   
   public void wysyłanie(String s,logowanie a) throws IOException
   { 
       
       try{
          socket  = new Socket("localhost",2007);
     
        System.out.println("Connected"); 
  
            // takes input from terminal 
              in = new DataInputStream( new BufferedInputStream(socket.getInputStream())); 
  
            // sends output to the socket 
            out    = new DataOutputStream(socket.getOutputStream());
            
           
       
      

				
			
			


    
				System.out.print("Client ->  ");
				
                               out.writeUTF("logowanie");
			out.writeUTF(s);
				
				
				
				
				String data=null;		
				System.out.print("Server, Wait !!! ->  ");
				data=in.readUTF();
				//Czytanie danych ze strumienia wejsciowego (od serwera)
				System.out.println(data);
                               
                                if(data.equals("true"))
                                {
                               a.setVisible(false);
                              nazwa=s;
                              nazwa2=s;
                               int zmiena=in.readInt();
                             
                               String zm;
                               for(int i=0;i<zmiena;i++)
                               {
                                   zm=in.readUTF();
                                   System.out.println(zm);
                                   loginy.add(zm);
                               }
                                
                             
                               
                               wybórprzeciwnika();
              
                        
                                }
                                else 
                                {
                                    a.wyswietl();
                                }
                                
				
				if(data.toLowerCase().equals("exit")){
					//W pzypadku gdy odebrano 'exit' zamykamy strumienie, polaczenie oraz aplikacje
					in.close();
					out.close();
					socket.close();
					System.exit(0);
				}
				System.out.println(data);
				
//KONIEC FAZA 2.				
       }
       catch(Exception e)
       {
           System.out.println("Bład");
       }
 

			
			
		
        }
   public void wybórprzeciwnika() throws InterruptedException
   { Klient a=this;
   
         
                                     java.awt.EventQueue.invokeLater(new Runnable() {
                                        
            public void run() {
                try {
                    System.out.println("logowanie");
                   
                  
                    new wybieranie_przeciwnika(loginy,a,nazwa2).setVisible(true);
                    
                      
                    
                
                   
                   
                } catch (Exception  ex) {
                   
                }
            }
        });
                                     
   }
  
   public void przeciwnik(String nazwaprzeciwnika ) throws IOException
   {
       out.writeUTF("nazwa");
       out.writeUTF(nazwaprzeciwnika);
       
   }
   public void wyjatek(){
     
 
		  Thread thread = new Thread(new Runnable() {
    @Override
    public void run() {
       
      
      
       
            String bb="";
              String czytanie="";
            
        try {
            
            bb=in.readUTF();
          czytanie=in.readUTF();
             System.out.println("wiadmosc klient" + bb);
            switch(bb)
            {
                case "nowy":
                {
            
                nazwa=czytanie; 
               
            System.out.println("3zczytywanie z strumienia"+ bb);
            bb="";
            
     
              
            break;
                }
                case "usuwanie":
                { 
                   
                       System.out.println("2usuwanie i zczytawanie z strumiene "+ bb);
        
                    usuwanie=czytanie;
                    if(loginy.contains(usuwanie))
                    {
                    loginy.remove(usuwanie);
                    
                    }
                    bb="";
                     
                  
                    break;
                    
                }
                case "granie":
                {
                 
                    System.out.println("granie");
                    CardGame(czytanie,"",1);
                    usuwanie="gram";
                    nazwa="gram";
                    bb="";
                    break;
                }
                case "pass":
                {
                         System.out.println("2usuwanie i zczytawanie z strumiene "+ czytanie);
  oknos=bb;
                       pulaa=czytanie;
                       
                       break;
                }
                    case "obstaw":
                {
                         System.out.println("2usuwanie i zczytawanie z strumiene "+ czytanie);
  oknos=bb;
                       pulaa=czytanie;
                       
                       break;
                }
                       case "gra":
                {
                         System.out.println("2usuwanie i zczytawanie z strumiene "+ czytanie);
  oknos=bb;
                       pulaa=czytanie;
                       
                       break;
                }
                        case "spr":
                {
                         System.out.println("2usuwanie i zczytawanie z strumiene "+ czytanie);
  oknos=bb;
                       wynik=czytanie;
                       pulaa=in.readUTF();
                       karta=in.readUTF();
                       
                       break;
                }
                         case "wiadomosc2":
                {
                      System.out.println("wiadomoscKLIENT");
      oknos=bb;                   
 wiadomosc=czytanie;
                       
                       break;
                }
                case "":
                {
                    
                    
                    break;
                }
             
                       
        }
        } catch (IOException ex) {
        System.out.println("Cos poszło zle" );
        } catch (InterruptedException ex) {
            Logger.getLogger(Klient.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
          
        
    
});
thread.start();
		}
   
   
  public String wyb()
  {
     
      if(i>1)
      {
      i=0;
      }
      else
      {
          i++;
      }
      System.out.println(i);
      return nazwa;
  }
  public String getUsuwanie()
  {
    wyjatek();
     try {
            if(i==0)
            {
            out.writeUTF("nowy");
            }
            else
            {
                out.writeUTF("usuwanie");
            }
        } catch (IOException ex) {
        
        }
       
      return usuwanie;
  }
  public String nazwa()
  {
      wyjatek();
      
      return nazwa2;
  }
   public void CardGame(String login,String mlogin,int i) throws InterruptedException
   { Klient a=this;
   
         
                                     java.awt.EventQueue.invokeLater(new Runnable() {
                                        
            public void run() {
                try {
                    System.out.println("OKNO");
                   
                  
                    new OKNO( login,a ).setVisible(true);
                    if(i==0)
                    {
                    out.writeUTF("granie");
                
                  
                      out.writeUTF(mlogin);
                        out.writeUTF(login);
                    }
                   
                    
                
                   
                   
                } catch (Exception  ex) {
                   
                }
            }
        });
                                     
   }
   
   public void Oknoa(int pula,String z,String przec) throws IOException
   {  System.out.println("Oknoa");
       switch(z)
       {
           case "pass":
           {
                   System.out.println("Oknoa");
               out.writeUTF("pass");
               out.writeUTF(pula+"");
               out.writeUTF(przec);
               break;
           }
           case "obstaw":
           {
               System.out.println("obstawianie");
                out.writeUTF("obstaw");
               out.writeUTF(pula+"");
               out.writeUTF(przec);
               break;
           
           }
           
       }
   }
     public void Okno(String wynik,String pula ,String karta,String przeciwnik  ) throws IOException
   {  
       out.writeUTF("spr");
       out.writeUTF(wynik);
           out.writeUTF(pula);
           out.writeUTF(karta);
            out.writeUTF(przeciwnik);
       
   }
    
 public void Wiadomosc(String wiadomosc,String login  ) throws IOException
   {  
       out.writeUTF("wiadomosc2");
       out.writeUTF(wiadomosc);
           out.writeUTF(login);
           
       
   }
    public String getOknos() throws IOException, InterruptedException {
        
     wyjatek();
        return oknos;
    }

    public String getPulaa() throws IOException {
         
        return pulaa;
    }
      public String getwynok() throws IOException {
         
        return wynik;
    }
public String getkarta() throws IOException {
         
        return karta;
    }
    public void setOknos(String oknos) {
        this.oknos = oknos;
    }
    public String getwiadmosc()
    {
        return wiadomosc;
    }
}
