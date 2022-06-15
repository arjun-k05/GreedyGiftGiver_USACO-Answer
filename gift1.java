/*
 ID: --------
 LANG: JAVA
 TASK: gift1
 */

import java.util.*;
import java.io.*;
public class gift1 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("gift1.in.txt"));
        PrintWriter pw = new PrintWriter(new File("gift1.out.txt"));
        
        int numOfPpl = sc.nextInt();
        String[] people = new String[numOfPpl];
        int[] money = new int[numOfPpl];
        for (int i = 0; i < numOfPpl; i++) {
            people[i] = sc.next();
        }
        
        // System.out.println("People array: " + Arrays.toString(people) + "; Money array: " + Arrays.toString(money));
        
        // System.out.println("Giver: " + giver + "; moneyGiven: " + moneyGiven + "; numOfRecievers: " + numOfRecievers);
        
        while (sc.hasNext()) {
            int position = 0;
            String giver = sc.next();
            int moneyGiven = sc.nextInt();
            int numOfRecievers = sc.nextInt(); 
            if (numOfRecievers != 0) {
                for (int i = 0; i < numOfRecievers; i++) {
                    String reciever = sc.next();
                    for (int j = 0; j < people.length; j++) {
                        if (people[j].equals(reciever))
                            position = j;
                    }
                    money[position] += moneyGiven / numOfRecievers;
                }

                for (int i = 0; i < people.length; i++) {
                    if (people[i].equals(giver)) {
                        money[i] += (moneyGiven * -1) + moneyGiven % numOfRecievers;
                    }
                }
            }
        }
        
        for (int i = 0; i < numOfPpl; i++) {
            pw.println(people[i] + " " + money[i]);
        }

        pw.close();
    }    
}   
