
import java.awt.List;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Powerzak
 */
public class Card {
     private   String faceName, suit;
    private   int faceValue;
    private   BufferedImage cardImage;
    
/**
 * constructor class  
 * @param faceName "spades","clubs","diamonds","hearts"
 * @param suit "2,7,4,5,...,9,10,Jack,Queen,King,Ace
 * @param faceValue =2,3,4,5,....,12,13,14
 * @param cardImage = image that represent the card 
 */
    public Card( String suit,String faceName, int faceValue, BufferedImage cardImage) {
      
        this.suit = suit;
          this.faceName = faceName;
        this.faceValue = faceValue;
        this.cardImage = cardImage;
    }
 
   /**
    * 
    * @return name card 
    */
   public String  toString()
   {
       return faceName+"of "+suit;
   }
   /**
    * 
    * @return value of card  
    */
   public int getFaceValue()
   {
       return faceValue;
       
   }
   public  BufferedImage getCardImage()
{
return cardImage;
}
  public int compareTo(Card o) {
    if(o.getFaceValue()==this.getFaceValue())
    {
        return 0;
    }
    else if(o.getFaceValue()>this.getFaceValue())
    {
        return 1;
    }
    return -1;
    }

    public String getFaceName() {
        return faceName;
    }

    public String getSuit() {
        return suit;
    }
    
}
