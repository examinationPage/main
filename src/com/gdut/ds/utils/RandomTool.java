package com.gdut.ds.utils;

public class RandomTool {

	
	public static void main(String[] args) {
		
		int[] s = randomCommon(1, 15, 5);
		
		for(int i = 0; i < 5; i++){
		
			System.out.println(s[i]);
		}
	}
	
	 /**
	 * 随机指定范围内N个不重复的数
	 * 最简单最基本的方法
	 * @param min 指定范围最小值
	 * @param max 指定范围最大值
	 * @param n 随机数个数
	 */
	public static int[] randomCommon(int min, int max, int n){
		if (n > (max - min + 1) || max < min) {
            return null;
        }
		int[] result = new int[n];
		int count = 0;
		while(count < n) {
			int num = (int) (Math.random() * (max - min)) + min;
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if(num == result[j]){
					flag = false;
					break;
				}
			}
			if(flag){
				result[count] = num;
				count++;
			}
		}
		return result;
	}
}
