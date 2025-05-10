package for_if;

import java.util.Scanner;

public class InvertedTriangle {

	public static void makeTriangle() {
		//三角形を作る文字列
		String triangleStr = "*";
		String triangleSpc = " ";
		
		//scannerの初期化
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			//三角形のサイズ入力
			System.out.print("逆三角形のサイズを入力してください：");
			int triangleSize = scanner.nextInt();
			
			//triangleSizeが1以上のとき、三角形を生成
			if(triangleSize >= 1) {
				for(int i = 0; i <= triangleSize - 1; i++) {
					String repeatedSpc = triangleSpc.repeat(i);
					String repeatedStr = triangleStr.repeat(triangleSize - i);
					System.out.println(repeatedSpc + repeatedStr);
				}
				break;
			}else {
				//triangleSizeが0以下のとき、再入力させる
				System.out.println("1以上の整数を入力してください");
				continue;
			}
		}
	}
}