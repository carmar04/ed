package org.institutoserpis.ed;

import java.util.ArrayList;
import java.util.List;

public class Vector {

	public static void main(String[] args) {
/**		int[] v = new int [] {9, 15, 7, 12, 6};
		
		for(int index=0; index<5;index++) {
			System.out.printf("v[%s]=%s ", index, v[index]);
			System.out.println();
		}
			
		int value = 33;
		
		int position = indexOf(v, value);
		System.out.print("position= " +position);
		int min = min(v);
		System.out.println(" min= "+ min);**/
		
		int n = Integer.MAX_VALUE;
		System.out.println("n (Integer.MAXVALUE) = "+n);

		List<Integer> notas = new ArrayList<>();
		notas.add(5);
		notas.add(9);
		notas.add(31);
		notas.add(45);
		
		for (Integer nota : notas) //nota=notas[0], notas[1]...
			System.out.println("nota=" + nota);
	}
	
	public static int indexOf(int[] v,int value) {		
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
/**	public static int binarySearch(int[]v,int a) {

		for(int r = 0, l = v.length-1;r<l;r++, l--) {
		
		
			if(a == v[r]) {
				return v[r];
			}else if(a == v[l]){
				return v[l];
			}else{
				System.out.print("No se ha encontrado el "+a+" en el array");
				return -a;
			}
		}**/
		public static int binarySearch(int[] v, int value) {
            int left = 0;
            int right = v.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (value < v[mid]) right = mid - 1;
                else if (value > v[mid]) left = mid + 1;
                else return mid;
            }
            return -1;
        }
		//Persona persona = new Persona();
		//for( i : persona) {
		
			

}
