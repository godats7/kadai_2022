package leewookjong_kadai3;

import java.util.Scanner;


 

public class Mondai3 {
	
	Kamoku[] storage;
	
	int num;
	
	Scanner scan = new Scanner(System.in);	
	
	   public void initMenu() {
		
		System.out.println("成績登録システム");
		System.out.println("1.登録　２．終了");
				
		runMenu();
	   }
	   
	   public void runMenu() {
		   //storage = storage[num];
		   //System.out.println("*******" + storage);
		   //System.out.println("*******" + storage.length);
		    num = scan.nextInt();
		    
		    int space = 0;
		    space ++;
		   // storage[i] = new Kamoku();
		    Kamoku [] storage = new Kamoku[5];//배열 메모리 할당
		  	
		    
	        if(num == 1) {	  
	        	for(int i =0;i<space;i++) {
	        		storage[i] = new Kamoku();
	                
	                System.out.println("名前は：");    
	                storage[i].setNamae(scan.next());
	               
	                System.out.println(storage[i].getNamae()+"さんの登録する科目は？　＊終了は０番");                 
	                storage[i].setKamokumei(scan.next());
	                
	                if(storage[i].getKamokumei().equals("0")) {                	 
	               	 initMenu();
	               	 num = scan.nextInt();
	                }else {
	               	 System.out.println(storage[i].getKamokumei() + "の点数は？");
	                    storage[i].setKamokuTennsuu(scan.nextInt());
	                 
	                    initMenu();
	               	 num = scan.nextInt();	                     
	                }
	                i ++;
	                System.out.println(storage[i]);
	        	}
	        }else if(num == 2) {
	        	for(int k =0;k<storage.length;k++) {
	     			 if(storage[k] !=  null) {
	     				 if(storage[k].getNamae() != null &&
	     	  					storage[k].getKamokumei() != null &&
	     	  					storage[k].getKamokuTennsuu() != 0) {
	     					System.out.println(storage[k].getNamae() + "さん、"+storage[k].getKamokumei()+"の点数"
	         	  					+storage[k].getKamokuTennsuu() );
	     	  			 }
	     			 }else {  				
	     			   System.out.println("Storage Null");
	     			 }
	     			
	            }
	        }else {
	        	System.out.println("他の番号を選んでください");
	        	initMenu();
	        }
	        
		   
	   }

	   
	public static void main(String[] args) {
		
		Mondai3 mon3 = new Mondai3();
		
		mon3.initMenu();


	}

}
