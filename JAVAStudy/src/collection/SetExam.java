package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExam {
public static void main(String[] args) {
	
	// int -> Integer
	// float -> Float
	
//	HashSet<Integer> set = new HashSet<>();
	ArrayList<Integer> set = new ArrayList<>();
	set.add(10);
	set.add(20);
	set.add(10); // 중복 - 무시
	
	while(true) {
		int n = (int) (Math.random() *45+1);
		set.add(n);
		if(set.size()==6) {
			break;
			}
		}
	System.out.println(set);
	}
}
