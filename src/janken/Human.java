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
public class Human extends Player{

    public  Human(int hand){
        super(hand);
    }
      public String toString(){
        return "Player : " +getHand_name();
    }
}
