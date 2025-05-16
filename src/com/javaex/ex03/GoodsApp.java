package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	ArrayList<Goods> gList = new ArrayList<Goods>();
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("상품을 입력해주세요(종료:q)");
    	while(true) {
    		String line = sc.nextLine();
    		String[] parts = line.split(",");
    		
    		if(line.equals("q")) {
    			System.out.println("[입력완료]");
    			break;
    		}
    		
    		if(parts.length == 3) {
    			String name = parts[0];
    			String p = parts[1];
    			String c = parts[2];
    			
    			int price = Integer.parseInt(p);
    			int count = Integer.parseInt(c);
    			
    			Goods g = new Goods(name, price, count);
    			gList.add(g);
    		}
    	}
    	for(int i = 0 ; i<gList.size() ; i++) {
    		System.out.println(gList.get(i).toString());
    	}
    	
    	sc.close();
    	
    }

}
