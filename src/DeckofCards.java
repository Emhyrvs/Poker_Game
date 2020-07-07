
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Powerzak
 */
public class DeckofCards {
    private Card[] deck;
    private int currentCard;
    private Object raster;
    
/**
 * 
 * @param deck
 * @param currentCard 
 */
    public DeckofCards() throws IOException {
        String[] faces={"Ace ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","Jack ","Quuen " ,"King ", };
        String[] suits={"Clubs","Diamonds","Hearts","Spades"};
        
        deck =new Card[52];
        currentCard = 0;
        //Information used to extract individual card from the 1 image holding all 
        final int width=77;
        final int height =124;
        final int rows = 4;
        final int cols =13;
        BufferedImage bigImage= ImageIO.read(new File("cards.png"));
        BufferedImage tempCardImage;
        Card a;
        int idx=0;
                for(int suit =0; suit <4 ; suit ++)
                {
                    for(int faceNum =0 ; faceNum <13; faceNum ++)
                    {
                   tempCardImage = ImageIO.read(new File("cards" + idx++ +".png"));
                       

                         deck[faceNum+(suit*13)]=new Card(suits[suit],faces[faceNum],faceNum+2,tempCardImage);
                        
                    }
                   
                   
                }
    }
    public void displayDeck()
    {
        for(Card card : deck )
        {
            System.out.println(card);
        }
    }
    /**
     * this method will shuffle the Card object in the deck 
     *  
     */
   public void shuffle()
   {
       SecureRandom randomNumber = new SecureRandom();
       
       currentCard =0;
       //for each card in the deck, pick another random card and swamp them 
       for(int frist = 0; frist <deck.length;frist ++)
       {
           //select the Random card 
           int second =randomNumber.nextInt(52);
           Card temp =deck[frist];
           deck[frist]=deck[second];
           deck[second]=temp;
       
   }
   }
  
    
   public void dziel() throws IOException
   {
        final int width=77;
        final int height =124;
        final int rows = 4;
        final int cols =13;
        BufferedImage bigImage= ImageIO.read(new File("cards.png"));
        BufferedImage tempCardImage;
        int idx=0;
                for(int suit =0; suit <4 ; suit ++)
                {
                    for(int faceNum =0 ; faceNum <13; faceNum ++)
                    {
                        //extract the image 
                       
                  
                        if(faceNum%2==0)
                        {
                          ImageIO.write(bigImage.getSubimage( width*faceNum+faceNum*2, suit*height, width,height), "png", new File("cards" + idx++ + ".png"));
                        }
                        else
                       ImageIO.write(bigImage.getSubimage( width*faceNum+faceNum*2, suit*height, width,height), "png", new File("cards" + idx++ + ".png"));
                    }
                   
                   
                }
   }
  public Card[] getDeck()
  {
      return deck;
  }
   
     
    
}
