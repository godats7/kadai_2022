package leewookjong_kadai1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mondai1 {
	
	Scanner scan = new Scanner(System.in);	
	
	int input;
	
	HashMap<String, String> map = new HashMap<>();	
	List list = new ArrayList<String>();
	
	String name;

	int irekaemae, irekaego;	
	
	private void InitZoo() {
		
		String title1 = "１．家を作る、動物を入れる";
		String title2 = "２．状況確認";
		String title3 = "３．動物入れ替え";
		String title4 = "４．名前検索";
		String title5 = "５．．終了";
		System.out.println(title1 + " " + title2 + " " + title3 + " " + title4 + " " + title5);		
		RunZoo();

	}
	
	private void CondZoo() {
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(i + "番目には" + list.get(i) + "が入っています");	
		}
	}
	
	private void RunZoo() {
		input = scan.nextInt();
		
		if(input == 1) {
			System.out.println("入れたい動物名前を入力");
			name  = scan.next();
			list.add(name);
			System.out.println(name + "が入りました");
			System.out.println(list.size());
			
			InitZoo(); 
		}else if(input == 2) {

			CondZoo();
			InitZoo(); 
			
		}else if(input == 3) {

			CondZoo();
			System.out.println("入れたい番号を入力");
			irekaemae = scan.nextInt();
			System.out.println("入れ替え対象の番号入力");
			irekaego = scan.nextInt();
			
			Collections.swap(list, irekaemae, irekaego);
			
			System.out.println(irekaemae + "番目と" + irekaego +"番目入れ替え完了");
			//CondZoo();
			InitZoo(); 
			
		}else if(input == 4) {
			System.out.println("検索したい名前を入力してください");
			name  = scan.next();
			
			boolean chkValue = list.contains(name);
			
			if(chkValue == true) {
				System.out.println("その動物は動物園にあります");
			}else {
				System.out.println("その動物は動物園にありません");
			}

			InitZoo();
			
		}else if(input == 5) {
			System.out.println("終了します");
		}else {
			System.out.println("1～5を入力してください");
			InitZoo(); 
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Mondai1 mon1 = new Mondai1();
		
		try {
			mon1.InitZoo();
		} catch (Exception e) {
			System.out.println("=== INPUT ERROR ===");		
		}
		
	}

}
