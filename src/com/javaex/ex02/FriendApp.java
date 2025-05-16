package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구 3명을 입력해주세요");
    	for(int i = 0 ; i<3 ; i++) {
    		String line = sc.nextLine();
    		String[] parts = line.split(" ");
    		
    		if(parts.length == 3) {
    			String name = parts[0];
    			String hp = parts[1];
    			String school = parts[2];
    			
    			Friend f = new Friend(name, hp, school);
    			fList.add(f);
    		}
    	}
    	
    	for(int i = 0 ; i< fList.size() ; i++) {
    		System.out.println(fList.get(i).toString());
    	}
    	
    	sc.close();

    	
    	
    }

}
