package Foo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practice2 {
    public static void main(String[] args) {
        boolean canPass = false;

        char[][] board1 = {
                {'+', '+', '+', '0', '+', '0', '0'},
                {'0', '0', '0', '0', '0', '0', '0'},
                {'0', '0', '+', '0', '0', '0', '0'},
                {'0', '0', '0', '0', '+', '0', '0'},
                {'+', '+', '+', '0', '0', '0', '+'}
        };
        System.out.println(row(board1));

    }

    public static ArrayList<Character> row(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            ArrayList<Character> pass = new ArrayList<>();
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == '0') {
                    pass.add(board[i][j]);
                } else if (board[i][j] == '+') {
                    pass.clear();
                    break;
                }
            }
            if (pass.size() == 7) {
                return pass;
            }

        }
        return null;
    }
}

//    public static ArrayList<Character> column(char [][] board) {
//
//        for (int i = 0; i < board.length; i++) {
//
//            ArrayList<Character> pass = new ArrayList<>();
//
//            for (int j = 0; j < board[i].length; j++) {
//
//
//
//        }
//
//    }
//
//}
