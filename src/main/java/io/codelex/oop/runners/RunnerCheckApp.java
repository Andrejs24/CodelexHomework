package io.codelex.oop.runners;

public class RunnerCheckApp {


    public static void main(String[] args) {
        int time1 = 132;
        int time2 = 62;
        int time3 = 361;


        Runner fitnessLevel1 = Runner.getFitnessLevel(time1);
        Runner fitnessLevel2 = Runner.getFitnessLevel(time2);
        Runner fitnessLevel3 = Runner.getFitnessLevel(time3);

        System.out.println(fitnessLevel1);
        System.out.println(fitnessLevel2);
        System.out.println(fitnessLevel3);
    }


}
