/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

/**
 *
 * @author c14005
 */
public abstract class Player {
    private String hand_name[]={"グー","チョキ","ぱー"};
    private int hand;
    
    public Player(int hand){
        setHand(hand);
    }
    
    public String getHand_name(){
        return hand_name[hand];
    }
    public int getHand(){
        return hand;
    }
    
    public void setHand(int hand){
        this.hand = hand;
    }
  
 }
