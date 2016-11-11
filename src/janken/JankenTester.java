/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janken;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author c14005
 */
public class JankenTester {
    public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int handh =0;
    Random rand = new Random();
    int retry;
    do{
        int handc = rand.nextInt(3);
    Player[] player = {new Human(handh),new Cpu(handc)};
    int user;
    
    
    do{
        System.out.print("じゃんけん");
            for(int i=0;i<3;i++){
                player[0].setHand(i);
                System.out.printf("(%d)%s",i,player[0].getHand_name());
            }
            user = stdIn.nextInt();
    }while(user<0||user>2);
    
    player[0].setHand(user);
    System.out.println(player[0].toString());
    System.out.println(player[1].toString());
    int judge = (player[0].getHand()-player[1].getHand()+3)%3;
    switch(judge){
        case 0:System.out.println("引き分けです"); break;
        case 1:System.out.println("あなたの負けです"); break;
        case 2:System.out.println("あなたの勝ちです"); break;
    }
    
    do{
        System.out.println("もう一回？　はい/1　いいえ/0");
        retry = stdIn.nextInt();
    }while(retry !=0 && retry != 1);
    }while(retry == 1);
    }
    
}
