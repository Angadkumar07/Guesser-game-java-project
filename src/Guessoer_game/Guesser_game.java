package Guessoer_game;

import java.util.Random;
import java.util.*;
class gussor{
    int gussNum;
    int gussingNumber()
    {
        System.out.println("gessor! kindly gess any number by range(10): ");
        //Scanner scan=new Scanner(System.in);
        Random scan=new Random();
        gussNum=scan.nextInt(11); 

        System.out.println("random number gessed by gussor: "+gussNum );
        
        return gussNum;
        
    }
}
class player{
    int gussNum;
    int gussingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("player! kindly gess any number ");
        gussNum=scan.nextInt();
        return gussNum;
    }
}

class ampire
{
    int numFromp1;
    int numFromp2;
    int numFromp3;
    int numberFromGusser;
    int scorep1=0;
    int scorep2=0;
    int scorep3=0;
    void collectNumberFromGusser()
    {
        gussor gc=new gussor();
        numberFromGusser=gc.gussingNumber();

    }
    void collectNumberFromPlayer()
    {
        player p1=new player();
        player p2=new player();
        player p3=new player();
        numFromp1=p1.gussingNumber();
        numFromp2=p2.gussingNumber();
        numFromp3=p3.gussingNumber();

    }
    void compaearNumber()
    {
        if(numberFromGusser==numFromp1){
           if(numberFromGusser==numFromp2 && numberFromGusser==numFromp3){
              System.out.println("All Player won the game!");
              scorep1+=1;
              scorep2+=1;
              scorep3+=1;
              System.out.println("score of player1="+scorep1+" score of player2:"+scorep2+" score of player3="+scorep3);
           }
           else if(numberFromGusser==numFromp2){
              System.out.println("palyer1 and player2 both won the game!");
              scorep1+=1;
              scorep2+=1;
              System.out.println("score of player1="+scorep1+" score of player2="+scorep2+" score of player3= "+scorep3);
           }
           else if(numberFromGusser==numFromp3){
              System.out.println("palyer1 and player3 both won the game!");
              scorep1+=1;
              scorep3+=1;
              System.out.println("score of player1="+scorep1+" score of player2="+scorep2+" score of player3="+scorep3);
           }
           else{
              System.out.println("player1 won the game!");
              scorep1+=1;
              System.out.println("score of player1="+scorep1+" score of player2="+scorep2+" score of player3="+scorep3);
           }
        }
        else if(numberFromGusser==numFromp2 ){
            if(numberFromGusser==numFromp3){
                System.out.println("player2 and player3 both won the game! ");
                scorep2+=1;
                scorep3+=1;
                System.out.println("score of player1="+scorep1+" score of player2="+scorep2+" score of player3="+scorep3);
            }
            else{
                System.out.println("player2 won the game!");
                scorep2+=1;
                System.out.println("score of player1="+scorep1+" score of player2= "+scorep2+" score of player3="+scorep3);
            }
           
        }
        else if(numberFromGusser==numFromp3){
            System.out.println("Player3 won the gmae");
            scorep3+=1;
            System.out.println("score of player1="+scorep1+" score of player2="+scorep2+" score of player3="+scorep3);
        }
        else{
            System.out.println("No winner found from all player!");
            System.out.println("score of player1="+scorep1+" score of player2="+scorep2+" score of player3="+scorep3);
        }
        System.out.println("Enter 1 for play again:");
        Scanner scan=new Scanner(System.in);
        int flag=scan.nextInt();
        if(flag==1){
            collectNumberFromGusser();
            collectNumberFromPlayer();
            compaearNumber();
        }else{
            System.out.println("you have enter wrong key please  try agin!");
           }

    }

    

}
public class Guesser_game {
    public static void main(String[] args){
        System.out.println("Lets start the game!");
        ampire amp=new ampire();
        amp.collectNumberFromGusser();
        amp.collectNumberFromPlayer();
        amp.compaearNumber();
       
    }
    
}
