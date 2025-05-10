package for_if;

import java.util.Scanner;

public class Triangle {
	
	public static void makeTriangle() {
		//三角形を作る文字列
		String triangleStr = "$";
		
		//scannerの初期化
		Scanner scanner = new Scanner(System.in);
				
		while(true) {
			//三角形のサイズ入力
			System.out.print("三角形のサイズを入力してください：");
			int triangleSize = scanner.nextInt();
			
			//triangleSizeが1以上のとき、三角形を生成
			if(triangleSize >= 1){
				for(int i = 0; i < triangleSize; i++) {
					
					String repeated = triangleStr.repeat(i + 1);
					System.out.println(repeated);
				}
				break;
			}else{
				//triangleSizeが0以下のとき、再入力させる
				System.out.println("1以上の整数を入力してください");
				continue;
			}
		}
	}

}
