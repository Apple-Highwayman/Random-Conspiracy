package src.randomGenerator;


public class RandomConspiracyDriver {

    public static void main(String[] args) {

        RandomConspiracy conspiracy = new RandomConspiracy(6820, 147);
        System.out.println("Random Conspiracy Generator!");
        System.out.println();
        System.out.println("Culprit: " + conspiracy.object);
        System.out.println();
        System.out.println("Act: " + conspiracy.verb);
        System.out.println();
        System.out.println("Victim: " + conspiracy.subject);


    } // main

} // RandomConspiracy
