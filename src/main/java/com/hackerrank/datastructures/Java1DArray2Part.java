package com.hackerrank.datastructures;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Nika Zurbaevi
 */
public class Java1DArray2Part {
    public static boolean canWin(int leap, int[] game) {
        boolean result;
        Set<Integer> walkedBackwardsPositions = new HashSet<>();
        int currentPosition = 0;
        LinkedList<Integer> previousIndexesBeforeLeap = new LinkedList<>();
        int startIndexOfPreviousLeap = 0;
        while (true) {

            if (leap + currentPosition > game.length - 1) {
                result = true;
                break;
            } else if (leap + currentPosition == game.length - 1 && game[leap + currentPosition] == 0) {
                result = true;
                break;
            } else if (leap + currentPosition < game.length - 1 && game[leap + currentPosition] == 0
                    && !previousIndexesBeforeLeap.contains(currentPosition)) {
                previousIndexesBeforeLeap.add(currentPosition);
                currentPosition += leap;
            } else if (1 + currentPosition == game.length - 1 && game[currentPosition + 1] == 0) {
                result = true;
                break;
            } else if (1 + currentPosition < game.length - 1 && game[currentPosition + 1] == 0
                    && !walkedBackwardsPositions.contains(currentPosition)) {
                currentPosition++;
            } else if (currentPosition - 1 >= 0 && game[currentPosition - 1] == 0) {
                currentPosition--;
                walkedBackwardsPositions.add(currentPosition);
            } else if ((previousIndexesBeforeLeap.size() - 1 - startIndexOfPreviousLeap) >= 0) {
                currentPosition = previousIndexesBeforeLeap
                        .get(previousIndexesBeforeLeap.size() - 1 - startIndexOfPreviousLeap);
                startIndexOfPreviousLeap++;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
