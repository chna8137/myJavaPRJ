package Beakjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Beakjoon_11758 {
    static int[][] point = new int[3][2];	//3개의 좌표 저장 배열
    static public void  main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for(int i=0;i<3;i++){
            st = new StringTokenizer(br.readLine()," ");
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }
        int result = cal();		//방향 계산
        bw.write(result + "\n");	//방향 BufferedWriter 저장
        bw.flush();
        bw.close();
        br.close();
    }
    static int cal(){
        int sumA = point[0][0]*point[1][1] + point[1][0]*point[2][1] + point[2][0]*point[0][1];
        int sumB = point[1][0]*point[0][1] + point[2][0]*point[1][1] + point[0][0]*point[2][1];
        int temp = sumA - sumB;
        if(temp>0)	//반시계
            return 1;
        else if(temp<0)	//시계
            return -1;
        else		//일직선
            return 0;
    }
}
