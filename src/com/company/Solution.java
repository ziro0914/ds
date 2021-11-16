package com.company;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] lottos ={44, 1, 0, 0, 31, 25};
        int[] win_nums ={31, 10, 45, 1, 6, 19};

        solution(lottos,win_nums);

    }



    int[] lottos ={44, 1, 0, 0, 31, 25};
    int[] win_nums ={31, 10, 45, 1, 6, 19};

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        System.out.println(Arrays.stream(lottos).sorted());

        return answer;
    }
}
