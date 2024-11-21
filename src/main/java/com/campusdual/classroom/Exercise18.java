package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static int[] createAndInitializeArray(int size){
		int[] array = new int[size];
		for (int i = 0; i<size; i++){
			array[i] = i+1;
		}
		return array;
	}

	public static void showInlineArray(int[] array){
		for (int i=0; i<array.length; i++){
			if(i > 0){
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int size = Utils.integer("Introduce el tamaño del array (numero natural): ");
		int[] array = createAndInitializeArray(size);

		System.out.println("Contenido del array: ");
		showInlineArray(array);
	}
}
