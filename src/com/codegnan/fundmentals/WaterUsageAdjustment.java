package com.codegnan.fundmentals;

import java.util.Scanner;

public class WaterUsageAdjustment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// step1 : read number of stations(N) number of queries(Q)
		int numberOfStations = scanner.nextInt();//5
		int numberOfQueries = scanner.nextInt();//2 
		// ste2: read initial water usage of each station
		int[] waterUsage = new int[numberOfStations];//int[] waterUsage=new int[5];
		for (int i = 0; i < numberOfStations; i++) {//0<5
			waterUsage[i] = scanner.nextInt();//10 20 30 40 50 
		}
		// step3: process each query adjustment
		for(int i=0;i<numberOfQueries;i++) {//1<2
			int startStation=scanner.nextInt();// 1- based index//2
			int endStation=scanner.nextInt();//1-based//4
			int adjustment=scanner.nextInt();// positive or negative//10
			//apply adjustment of all stations in the range[L,R]
			for(int j=startStation-1;j<endStation;j++) {//j=1,1<4
				waterUsage[j]+=adjustment;//5 25 35 50 50
				if(waterUsage[j]<0) {
					waterUsage[j]=0;
				}
			}
		}
		//step4 : display the final water usagee of all stations
		for(int i=0;i<numberOfStations;i++) {//5 25 35 50 50
			System.out.print(waterUsage[i]+" ");
			/*if(i<numberOfStations-1) {
				System.out.print(" ");
			}*/
		}
		scanner.close();
	}
}
