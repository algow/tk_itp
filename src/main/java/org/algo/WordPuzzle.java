package org.algo;

import java.util.ArrayList;
import java.util.Scanner;

public class WordPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {

            int promptAnswer = 10;

            int levels = 3;
            String[] word = {"dettli", "secaen", "hkrneo"};
            String[][] answer = {
                    {"die", "led", "lei", "let", "lid", "lie", "lit", "tie", "deli", "diet", "edit", "idle", "lied", "tide", "tied", "title", "tilt", "tilde", "tiled", "title", "tilted", "titled"},
                    {"can", "cane", "scan", "scene", "case", "cease", "ace", "sane", "encase", "acne"},
                    {"honk", "honker", "ore", "hen", "her", "one", "hero", "horn", "kern", "nor", "heron"}
            };

            ArrayList<Integer> scores = new ArrayList<>();
            int totalScore = 0;

            System.out.println("Coepoe Word Puzzle");
            System.out.println("====================");
            System.out.println();
            System.out.println("Rules:");
            System.out.println("1. Create a word using given characters, min 3 characters & max 6 characters.");
            System.out.println("2. Each level, you have 10 chances to answer correctly.");
            System.out.println("3. To get through to next level, you have to score 70 points each level.");
            System.out.println();

            for (int i = 0; i < levels; i++) {
                int currLvl = i + 1;
                System.out.println();
                System.out.println("Level " + currLvl);
                System.out.println("========");
                System.out.println(word[i]);

                int currScore = 0;

                for (int j = 0; j < promptAnswer; j++) {
                    int num = j + 1;
                    String userAnswer;

                    do {
                        System.out.println(num + ") Your Answer: ");
                        userAnswer = sc.nextLine();

                        if (contains(answer[i], userAnswer) == true) {
                            currScore += 10;
                            System.out.println("# Right. Score: " + currScore);
                        } else {
                            System.out.println("# Wrong. Score: " + currScore);
                        }

                    } while (userAnswer.length() < 3 || userAnswer.length() > 6);
                }

                scores.add(currScore);
                totalScore += currScore;

                System.out.println();

                System.out.println("You had answered 10 times with " + currScore / 10 + " right answers");

                System.out.println();

                System.out.println("Correct answers:");

                for (int j = 0; j < answer[i].length; j++) {
                    System.out.print(answer[i][j] + " ");
                }

                System.out.println();
            }

            System.out.println("Overall score: " + totalScore);

            if (passed(scores)) {
                System.out.println("You win!!!");
                System.out.println("Press ENTER to exit");
                sc.nextLine();
            } else {
                System.out.println("You lose!! Try again.");
                System.out.println("Do you want to retry? [y/t]]: ");
                String yt = sc.nextLine();

                if (yt.equalsIgnoreCase("y")) {
                    ulang = true;
                } else {
                    ulang = false;
                }
            }
        }
    }

    public static boolean contains(String[] array, String v) {
        for (int i = 0; i < array.length; i++) {
            if(v.toLowerCase().equals(array[i])) {
                return true;
            }
        }

        return false;
    }

    public static boolean passed(ArrayList<Integer> list) {
        int min = 70;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) < min) {
                return false;
            }
        }

        return true;
    }
}
