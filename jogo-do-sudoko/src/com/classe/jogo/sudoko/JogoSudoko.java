package com.classe.jogo.sudoko;

import java.util.Scanner;

public class JogoSudoko {
	int count = 0;
	int count1 = 0;
	int count2 = 0;
	public int[][] sudoko = new int[3][3];
	public int[] cont = new int[9];
	
	public int[][] getSudoko() {
		return sudoko;
	}
	public void setSudoko(int[][] sudoko) {
		this.sudoko = sudoko;
	}
	
	
	public void entradasudoko() {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < sudoko.length; i++) {
			for (int j = 0; j < sudoko[i].length; j++) {
				System.out.printf("Digite o número [%d],[%d]:",i,j);
				sudoko[i][j] = in.nextInt();
				
			}
		}
		System.out.println(" ");
		for (int i = 0; i < sudoko.length; i++) {
			for (int j = 0; j < sudoko[i].length; j++) {
	    	System.out.printf(sudoko[i][j] + "| ");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		in.close();
	}
	
	public void somaLinha() {
		for (int i = 0; i < sudoko.length; i++) {
			for (int j = 0; j < sudoko[i].length; j++) {
				if(i == 0) {
					count+=sudoko[i][j];
				}
				if(j == 0) {
					count1+=sudoko[i][j];
				}
			}
		}
		System.out.println(count);
		System.out.println(count1);
	}
	public void somaCuluna() {
		for (int i = 0; i < sudoko.length; i++) {
			for (int j = 0; j < sudoko[i].length; j++) {
				if(j == 0) {
					count2+=sudoko[i][j];
				}
			}
		}
		System.out.println(count2);
		System.out.println(" ");
	}
	/*public void somaLinha1() {
		for (int i = 0; i < sudoko.length; i++) {
			for (int j = 0; j < sudoko[i].length; j++) {
				if(i == 1) {
					count1+=sudoko[i][j];
				}
			}
		}
		System.out.println(count1);
		System.out.println(" ");
	}
	public void somacoluna1() {
		for (int i = 0; i < sudoko.length; i++) {
			for (int j = 0; j < sudoko[i].length; j++) {
				if(j == 1) {
					count1+=sudoko[i][j];
				}
			}
		}
		System.out.println(count1);
		System.out.println(" ");
	}*/

}
