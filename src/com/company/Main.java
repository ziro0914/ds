package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] lottos ={44, 1, 0, 0, 31, 25};
        int[] win_nums ={31, 10, 45, 1, 6, 19};

        solution(lottos,win_nums);

    }



    int[] lottos ={44, 1, 0, 0, 31, 25};
    int[] win_nums ={31, 10, 45, 1, 6, 19};

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] temp = new int[6];
        Arrays.sort(lottos); //정렬
        Arrays.sort(win_nums); //정렬
        int minCnt = 0;
        int maxCnt = 0;
        int basicCnt = 0;
        int tempArr = 0;
        // 최소 등급 체크
        for(int i=0; i < lottos.length; i++){
            if(lottos[i] <1 ){
                basicCnt ++;
            }else{
                temp[tempArr] = lottos[i];
                tempArr++;
            }
        }

        for(int k=0; k < temp.length; k++){

            for(int j=0; j < win_nums.length; j++){
                if(temp[k] == win_nums[j]){
                    minCnt ++;
                }
            }
        }

        maxCnt = basicCnt + minCnt;


        answer[0] = setLottos(maxCnt);
        answer[1] = setLottos(minCnt);


        return answer;
    }

    public static int setLottos(int num){
        int winCount= 0;
        if(num == 6){
            winCount = 1;
        }else if(num == 5){
            winCount = 2;
        }else if(num == 4){
            winCount = 3;
        }else if(num == 3){
            winCount = 4;
        }else if(num == 2) {
            winCount = 5;
        }else{
            winCount = 6;
        }
        return winCount;
    }
}
