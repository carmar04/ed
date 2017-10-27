package org.institutoserpis.ed;

public class Vector {

	public static void main(String[] args) {
		int[] v = new int [] {9, 15, 7, 12, 6};
		
		for(int index=0; index<5;index++) {
			System.out.printf("v[%s]=%s ", index, v[index]);
			System.out.println();
		}
			
		int value = 33;
		
		int position = indexOf(v, value);
		System.out.print("position= " +position);
		

	}
	
	public static int indexOf(int[] v,int value) {
		int index = 0;
		while(v[index] != value && index < v.length)
			index++;
		if(index == v.length)
			index = -1;
			return index;
		
		
	}

}
