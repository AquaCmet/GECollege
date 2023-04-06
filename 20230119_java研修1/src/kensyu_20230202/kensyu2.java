package kensyu_20230202;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class kensyu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = ((String)sc.nextLine()).split(" ");
	    Set<String> ary = new LinkedHashSet<String>();
	    
/*
		Scanner scnum = new Scanner(System.in);
		int []num = ((String)scnum.nextInt()).split(" ")
        Set<Integer> numary = new LinkedHashSet<Integer>();
  */      
        
		for (int i=0 ; i< input.length;i++) {
			ary.add(input[i]);
		}
        System.out.println(ary.size());
        sc.close();
	}

}


/*
  LinkedHashSetは順序を守る
  HashSetは順序は維持されませんが
  */
