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
		int min = min(v);
		System.out.println(" min= "+ min);

	}
	
	public static int indexOf(int[] v,int value) {
//		int index = 0;
//		while(index < v.length && v[index] != value)//cuidado con la condición
//			index++;
//		if(index == v.length)
//			index = -1;
//			return index;
//		
//		for(int index = 0;index < v.length;index++)
//			if(v[index] == value)
//				return index;
//	return -1;
		
		int index = 0;
		while( index < v.length && v[index] != value)
			index++;
		return index < v.length ? index : -1;
	}
	public static int min(int[] v) {
	         int iMenor = v[0];
	         for(int numero=1;numero<v.length;numero++){
	             if(v[numero]<iMenor)
	                 iMenor = v[numero];
	         }
	         return iMenor;
	}
}
