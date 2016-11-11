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
public class JankenTester3p {
    public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int handh =0;
    Random rand = new Random();
    int retry;
    do{
        int handc = rand.nextInt(3);
        int handm = rand.nextInt(3);
    Player[] player = {new Human(handh),new Cpu(handc),new Cpu(handm)};
    int user;
    
    
    do{
        System.out.print("じゃんけん");
            for(int i=0;i<3;i++){
                player[0].setHand(i);
                System.out.printf("(%d)%s",i,player[0].getHand_name());
            }
            user = stdIn.nextInt();
    }while(user<0||user>2);
    int judge2 =0;
    player[0].setHand(user);
    for(int i=0;i<player.length;i++){
    System.out.println(player[i].toString());
    judge2 += player[i].getHand();
    }
    
    if(judge2%3 == 0){
        System.out.println("引き分けです");
    }else{
     int judge;    
    int Cpujudge = (player[1].getHand()-player[2].getHand()+3)%3;
        switch(Cpujudge){
            case 0://cpu1とcpu2が引き分けの時
                judge = (player[0].getHand()-player[1].getHand()+3)%3;
                switch(judge){
                    case 1:System.out.println("あなたの一人負けです"); break;
                    case 2:System.out.println("あなたの一人勝ちです"); break;
                }
                break;
            case 1://cpu1が負けた時
                judge = (player[0].getHand()-player[1].getHand()+3)%3;
                switch(judge){
                    case 0:System.out.println("cpu2の一人勝ちであなたの負けです"); break;
                    case 2:System.out.println("あなたとcpu2の勝ちです"); break;
                }
                break;
            case 2://cpu1がかった時
                judge = (player[0].getHand()-player[1].getHand()+3)%3;
                switch(judge){
                    case 0:System.out.println("あなたとcpu1の勝ちです"); break;
                    case 1:System.out.println("cpu1の一人勝ちであなたの負けです"); break;
                }
                break;
        }
    
    }
    
    do{
        System.out.println("もう一回？　はい/1　いいえ/0");
        retry = stdIn.nextInt();
    }while(retry !=0 && retry != 1);
    }while(retry == 1);
    }
    
}
