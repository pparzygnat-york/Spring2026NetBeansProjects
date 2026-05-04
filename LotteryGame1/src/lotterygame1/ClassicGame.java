/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterygame1;

import java.util.Random;

/**
 *
 * @author administrator
 */
public class ClassicGame {
    private 
      int lotterySelection[] = new int[6];
      int gameType; // 3,4,5,6
    public
      void playClassic(int type){
        int selectionCount = type;
        int selectionBound = 63;
        Random seed = new Random();
        Random rv1 = new Random(selectionBound);
        rv1.setSeed(seed.nextInt(100000));
        for(int i = 0; i < selectionCount; i++) {
            lotterySelection[i] = rv1.nextInt(selectionBound) + 1;
        }
        System.out.println("You are playing Take " + type);
        System.out.println("Your Take " + type + " Numbers: ");
        for(int i = 0; i < selectionCount; i++) {
            System.out.print("[" + lotterySelection[i] + "]");
        }
        System.out.println();
        System.out.println();
      }
}
