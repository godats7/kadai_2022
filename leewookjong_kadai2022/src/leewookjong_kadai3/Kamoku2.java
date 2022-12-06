package leewookjong_kadai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class MenuViewer{
	   public void showMenu() {
	    System.out.println("成績登録システム");
		System.out.println("1.登録　２．終了");
	   }
	
}



public class Kamoku2 {

	String kamokumei;
	String namae;
	int kamokuTennsuu;
    
    
    public Kamoku2() {//init
        kamokumei=null;
        namae=null;
        kamokuTennsuu=0;
    }
    
    public Kamoku2(String major,String name, int score) {
        kamokumei= major;
        namae= name;
        kamokuTennsuu= score;       
    }
    
    //setter getter
    public String getKamokumei() {
		return kamokumei;
	}
	public void setKamokumei(String kamokumei) {
		this.kamokumei = kamokumei;
	}
	public String getNamae() {
		return namae;
	}
	public void setNamae(String namae) {
		this.namae = namae;
	}
	public int getKamokuTennsuu() {
		return kamokuTennsuu;
	}
	public void setKamokuTennsuu(int kamokuTennsuu) {
		this.kamokuTennsuu = kamokuTennsuu;
	}
    
  
	public void runScore() {
		
	}
    public static void main(String[] args) {  
      MenuViewer menu = new MenuViewer();
      Scanner sc = new Scanner(System.in);
      
  	  int num;
  	  int space = 0;
  	  
  	  String inputKamokumei;
  	  
  	  menu.showMenu();
  	  num = sc.nextInt();
      space ++;
  	  Kamoku2 [] storage = new Kamoku2[5];//array
  	
  	  
  	  if(num == 1) {
  		
  		for(int i =0;i<space;i++) {
            storage[i] = new Kamoku2();                 
            System.out.println("名前は：");
            storage[i].setNamae(sc.next());
            
            System.out.println(storage[i].getNamae()+"さんの登録する科目は？　＊終了は０番");
            inputKamokumei = sc.next();            
            
            if(inputKamokumei.equals("0")) {
           		
           	 menu.showMenu();
             num = sc.nextInt();
             
             if(num == 1) {
            	 
             }else if(num ==2) {
            	 for(int k =0;k<storage.length;k++) {
          			 if(storage[k] !=  null) {
          				 if(storage[k].getNamae() != null &&
          	  					storage[k].getKamokumei() != null &&
          	  					storage[k].getKamokuTennsuu() != 0) {
          					 System.out.println(storage[k].getNamae() + "さん、"+storage[k].getKamokumei()+"の点数"
          	  					+storage[k].getKamokuTennsuu() );
          					 //System.out.println("なまえ"＋＋"さんが受けている科目は"＋＋"..");
          					
          	  			 }
          			 }else {  				
          			   System.out.println("Storage Null");
          			 }
          			
                 }
             }
             
            }else {
            	space++;
            	storage[i].setKamokumei(inputKamokumei);
           	 	System.out.println(storage[i].getKamokumei() + "の点数は？");
                storage[i].setKamokuTennsuu(sc.nextInt());
                               
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            }
            
            }
  	  }else if(num == 2) {
  		
  		 for(int i =0;i<storage.length;i++) {
  			 if(storage[i] !=  null) {
  				 if(storage[i].getNamae() != null &&
  	  					storage[i].getKamokumei() != null &&
  	  					storage[i].getKamokuTennsuu() != 0) {
  					System.out.println(storage[i].getNamae() + "さん、"+storage[i].getKamokumei()+"の点数"
      	  					+storage[i].getKamokuTennsuu() );  ;
  	  			 }
  			 }else {  				
  			   System.out.println("Storage Null");
  			 }
  			
         }
  	  }else {
  		System.out.println("他の番号を選んでください");
  		menu.showMenu();
    	num = sc.nextInt();
  	  }
                

        
 
    }

}
