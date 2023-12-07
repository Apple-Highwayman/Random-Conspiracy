package src.randomGenerator;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Random;


public class RandomConspiracy {
    
    int subjectNum;
    int verbNum;
    int objectNum;
    String subject;
    String verb;
    String object;


    public RandomConspiracy(int nounBound, int verbBound) {
        Random random = new Random();
        subjectNum = random.nextInt(nounBound);
        verbNum = random.nextInt(verbBound);
        objectNum = random.nextInt(nounBound);
    
        try (BufferedReader br = new BufferedReader(new FileReader("nounlist.txt"))) {
            for (int i = 0; i < Math.min(subjectNum, objectNum) - 1; i++) {
                br.readLine();
            }
            if (subjectNum > objectNum) {
                subject = br.readLine();
            } else {
                object = br.readLine();
            }
            for (int i = 0; i < Math.max(subjectNum, objectNum) - Math.min(subjectNum, objectNum); i++) {
                br.readLine();
            }
            if (subjectNum > objectNum) {
                object = br.readLine();
            } else {
                subject = br.readLine();
            }

        } catch (IOException e) {
            System.err.println(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("verblist.txt"))) {
            for (int i = 0; i < verbNum; i++) {
                br.readLine();
            }
            verb = br.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }
    }

} // RandomConspiracy
