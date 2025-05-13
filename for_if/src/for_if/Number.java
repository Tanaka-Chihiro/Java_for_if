package for_if;

import java.util.Arrays;
import java.util.Scanner;

public class Number {
	
	//intからStringに変換
	public static String intToStr(int[] numbers) {
		String str = Arrays.toString(numbers)
				.replace("[","")
				.replace("]", "");
		return str;
	}

	//数字を生成する関数
	public static void makeNumber(int number, int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*30 + 1);
		}
		//生成した数字の表示
		System.out.println("生成された数字は、" + intToStr(numbers) + "です。");
	}
	
	//ソートする関数
	public static void sortNumber(int[] numbers) {
		for(int j = 0; j <= numbers.length-1; j++) {
			
			for(int jj = 0; jj < numbers.length-j-1; jj++) {
				if(numbers[jj] < numbers[jj + 1]) {
					//小さい方の数字を入れる変数
					int smallNumber = numbers[jj];
					//数字を入れ替える
					numbers[jj] = numbers[jj + 1];
					numbers[jj + 1] = smallNumber;
				}
			}
		}
		//ソートした数字の表示
		System.out.println("大きい順に並べると、" + intToStr(numbers) + "です。");
	}
	
	public static void number() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//数字の個数の入力
			System.out.print("数字の個数：");
			int number = scanner.nextInt();
			
			if(number >= 1) {
				//生成した数字を格納する配列
				int[] numbers = new int[number];
				
				makeNumber(number, numbers);
				sortNumber(numbers);
				break;
			}else {
				//numberが0以下のとき、再入力させる
				System.out.println("1以上の整数を入力してください");
				continue;
			}
		}
		
	} 
}
