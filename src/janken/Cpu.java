/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;
import java.util.Random;

/**
 *
 * @author c14005
 */
public class Cpu extends Player{

    
    public Cpu(int hand){
      super(hand);
    }
      public String toString(){
        return "CPU : " +getHand_name();
    }
}
