package leewookjong_kadai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Mondai2 {
	
	Scanner scan = new Scanner(System.in);

	int num;
	
	ArrayList<String> list = new ArrayList<String>();
	ArrayList<String> listForInput = new ArrayList<String>();
	ArrayList<String> listForCompare = new ArrayList<String>();
	
	int input, inputSelf;
	int cnt = 7;

	private ArrayList<String> RandomDemo() {
		for(int i = 0 ; i < cnt ; i++) {
			
			Random random = new Random();
			num = random.nextInt(49)+1;
			String parseNum = Integer.toString(num);	
			
			if(list.contains(parseNum) == true) {
				i --;
				Random reroll = new Random();
				num = reroll.nextInt(49)+1;
			}else {
						
				list.add(i, parseNum);
			}
			
		}
		
		System.out.println(list);
		return list;		
		
	}
	
	private void InitGame() {
		System.out.println("=== 人生逆転'LOTO7'ゲーム!! *50以下の数字  ===");
		System.out.println("=== １．自分で数字を入力　2．ランダムに数字を生成  ===");
		StartingGame();
	}
	
	private void CompareNumber() {
		System.out.println("正解　 = " + list);
		System.out.println("入力 　= " + listForInput);
		
		for(int i = 0 ; i < cnt ; i++) {
			if(list.get(i).equals(listForInput.get(i))) {
				listForCompare.add(i, "O ");
			}else if(!list.get(i).equals(listForInput.get(i))) {
				listForCompare.add(i, "X ");
			}
		}
		
		System.out.println("結果 　= " + listForCompare);
	}
	
	private void StartingGame() {
		
		input = scan.nextInt();
		
		if(input == 1) {
			System.out.println("値を打ち込んでください");
			for(int i = 0;i<cnt;i++) {
				
				inputSelf = scan.nextInt();
				String inputSelfToString = Integer.toString(inputSelf);
				if(listForInput.contains(inputSelfToString)) {
					System.out.println("値が中腹されています");					
					i --;
				}else {
					listForInput.add(i, inputSelfToString);	
				}
				
				if(inputSelf < 1 || inputSelf > 50) {
					System.out.println("1~50の数を入力してください");
					listForInput.remove(i);
					i --;
				}
				
				if(i == 6) {
					System.out.println("回数7番をこえました！\r\n" + 
								"再挑戦!! 値の初期化中。。\r\n" + 
								"");
						//System.out.println(listForInput);
						System.out.println("* 入力  *");
						//i = -1;
						
					}
			}
			
			CompareNumber();
			
		}else if(input == 2) {
			for(int i = 0 ; i < cnt ; i++) {
				
				Random random = new Random();
				num = random.nextInt(49)+1;
				String parseNum = Integer.toString(num);	
				
				if(listForInput.contains(parseNum) == true) {
					i --;
					Random reroll = new Random();
					num = reroll.nextInt(49)+1;
				}else {
							
					listForInput.add(i, parseNum);
				}
				
			}
			CompareNumber();
		}else {
			System.out.println("１もしくは２を入力してください");
			InitGame();
		}
		
		
	}
	public static void main(String[] args) {
		Mondai2 mon2 = new Mondai2();
		
		try {
			mon2.RandomDemo();
			mon2.InitGame();
		} catch (Exception e) {
			System.out.println("=== INPUT ERROR ===");		
		}
	}

	
}

