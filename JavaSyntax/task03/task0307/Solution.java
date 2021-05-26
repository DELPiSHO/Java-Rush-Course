package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int z;
        for (z=1;z<11;z++){
            Zerg zerg = new Zerg();
            zerg.name = "bot_zerg" + z;
            System.out.println(zerg.name);
        }
        int i = 1;
        while(i<6){
            Protoss protoss = new Protoss();
            protoss.name = "bot_protoss" + i;
            System.out.println(protoss.name);
            i++;
        }
        int y;
        for(y=1;y<13;y++){
            Terran terran = new Terran();
            terran.name = "bot_terran" + y;
            System.out.println(terran.name);
        }
       // Zerg z1 = new Zerg();
        //z1.name = "Allu";
        //System.out.println(z1.name);
    }


    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
