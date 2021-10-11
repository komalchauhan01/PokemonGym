/**
 * @author      Komal Chauhan <komal.chauhan@student.tdsb.on.ca>
 * @date     November 9 2018                 (date of program creation)
 * @code       ICS 4U1          (course code)
 */


import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
public class Pokemon{
  //class body
  Random rand= new Random();
  public String name;
  public int health;
  public int healthRemaining;
  public String type;
  public String phrase;
  int healcount=0;
  int play=0;
  
 /**
 * Will store all of the attributes of the pokemon                          
 *
 * @param String name, int health,String type, String phrase                                  
 * @return N/A
 */
  
  public Pokemon( String name, int health,String type, String phrase){
    
    this.name=name;
    this.health=health;
    healthRemaining=health;
    this.type=type;
    this.phrase=phrase;
    
  }
  
   /**
 * Will get the name of the pokemon                         
 *
 * @param  N/A                                
 * @return name
 */
  public String getName(){
    return name;
  }
  
  /**
 * Will get the health of the pokemon                         
 *
 * @param  N/A                                
 * @return health
 */
  public int getHealth(){
    return health;
  }
  /**
 * Will get the remaining health of the pokemon                         
 *
 * @param  N/A                                
 * @return healthRemaining
 */
  
  public int getRemaining(){
    return healthRemaining;
  }
 /**
 * Will get the type of the pokemon                         
 *
 * @param  N/A                                
 * @return type
 */
  
  public String getType(){
    return type;
  }
  
  /**
 * Will get the pokemons normal phrase                      
 *
 * @param  N/A                                
 * @return phrase
 */
  public String getPhrase(){
    return phrase;
  }
  
   /**
 * Will subtract a few points from when it dodges an attack and will set the new health                    
 *
 * @param  N/A                                
 * @return void
 */
  public void dodge(){
    int random=rand.nextInt(10)+2;
    healthRemaining=healthRemaining-random;
     if(healthRemaining<=0){
      healthRemaining=0;
    }
    
    JOptionPane.showMessageDialog(null,"You lost "+random+" hp while dodging and have "+healthRemaining+" hp left!");
  }
    /**
 * Will subtract points when it gets attacked and will set new health                     
 *
 * @param  N/A                                
 * @return void
 */
  
  public void attack(){
    int random=rand.nextInt(100)+10;
    healthRemaining=healthRemaining-random;
    //System.out.println(random);
    if(healthRemaining<=0){
      healthRemaining=0;
    }
    
    JOptionPane.showMessageDialog(null,"You lost "+random +" hp while attacking and have "+healthRemaining+" hp left");
    
  }
  /**
 * Will gain a few points when it tries to heal and will set new health                     
 *
 * @param  N/A                                
 * @return void
 */
  public void heal(){
    healcount++;
    if(healcount>3){
      do{ 
        JOptionPane.showMessageDialog(null,"You can only use heal max 3 times!\nChoose another option.");
        String[] action={"Dodge","Attack","Heal"};
        
        play=JOptionPane.showOptionDialog(
                                          null,
                                          "What would you like your pokemon to do","Player 1",
                                          JOptionPane.DEFAULT_OPTION,
                                          JOptionPane.QUESTION_MESSAGE,
                                          null,
                                          action,
                                          action[0]);
      }
      while(play==2);
      if(play==0){
        dodge();
      }
      else if(play==1){
        attack();
      }
    }
    else if(healcount<=3){
      if(healthRemaining==health){
        JOptionPane.showMessageDialog(null,"You already have full health. You can not heal. You have lost a turn.");
      }
      else{
        int random=rand.nextInt(10);
        if(healthRemaining+random>=health){
          healthRemaining=health;
        }
        else if(healthRemaining+random<health){
          healthRemaining=healthRemaining+random;
          JOptionPane.showMessageDialog(null,"You have gained "+random+" hp.\nYou now have "+healthRemaining+" hp left");
        }
      }
      
    }
  }
  /**
 * Will gain a few points when it tries to heal and will set new health                     
 *
 * @param  N/A                                
 * @return void
 */
  public void heal2(){
    healcount++;
    if(healcount>3){
      do{ 
        JOptionPane.showMessageDialog(null,"You can only heal max 3 times!\nChoose another option.");
        String[] action={"Dodge","Attack","Heal"};
        play=JOptionPane.showOptionDialog(
                                          null,
                                          "What would you like your pokemon to do","Player 2",
                                          JOptionPane.DEFAULT_OPTION,
                                          JOptionPane.QUESTION_MESSAGE,
                                          null,
                                          action,
                                          action[0]);
      }
      while(play==2);
      if(play==0){
        dodge();
      }
      else if(play==1){
        attack();
      }
    }
    else if(healcount<=3){
      if(healthRemaining==health){
        JOptionPane.showMessageDialog(null,"You already have full health. You can not heal. You have lost a turn.");
      }
      else{
        int random=rand.nextInt(10);
        if(healthRemaining+random>=health){
          healthRemaining=health;
        }
        else if(healthRemaining+random<health){
          healthRemaining=healthRemaining+random;
          JOptionPane.showMessageDialog(null,"You have gained "+random+" hp.\nYou now have "+healthRemaining+" hp left");
        }
      }
      
    }
  }
  
  
  
  
  /**
 * Will return pokemon information               
 *
 * @param  N/A                                
 * @return string
 */
  
  public String toString(){
    return name+" "+health+" "+healthRemaining+" "+type+" "+phrase;
  }
  
  
  
  
}



