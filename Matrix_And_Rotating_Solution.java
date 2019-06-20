import java.util.Arrays;
import java.util.*;

// To check if String has repeating character!
public class Matrix_And_Rotating_Solution {
	// We can also set the length as the length of input string to decrease space
	static int [] [] image_matrix;
	
	public static void main(String[] args) {
		
		matrix_setting(3, 2);
		matrix_showing(image_matrix);
		
		
		matrix_rotating("right",180);
		matrix_showing(image_matrix);
	}
	
	public static void matrix_setting(int x, int y) {
		// Set all record to random number
		image_matrix = new int [x] [y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				image_matrix[i][j] = (int)(Math.random()*10);
			}
		}
	}
	
	private static void matrix_rotating(String direction, int angle) {
		// TODO Auto-generated method stub
		int x = image_matrix.length;
		int y = image_matrix[0].length;
		
		if(angle < 0) {angle = (Math.abs(angle)%360)+180;}
		
		int type = (angle/90)%4;
		if(type== 0) {}
		else if(type== 2){
			int [] [] temp_matrix = new int [x] [y];
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					temp_matrix[x-1-i][y-1-j] = image_matrix[i][j];
				}
			}
			image_matrix = temp_matrix;
		}
		else if(type== 1){
			int [] [] temp_matrix = new int [y] [x];
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					temp_matrix[j][x-1-i] = image_matrix[i][j];
				}
			}
			image_matrix = temp_matrix;
		}
		else {
			int [] [] temp_matrix = new int [y] [x];
			for(int i=0;i<x;i++) {
				for(int j=0;j<y;j++) {
					temp_matrix[y-1-j][i] = image_matrix[i][j];
				}
			}
			image_matrix = temp_matrix;
		}
		
		
	}
	
	private static void matrix_showing(int[][] image_matrix_) {
		// TODO Auto-generated method stub
		int x = image_matrix_.length;
		int y = image_matrix_[0].length;
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				System.out.print(image_matrix_[i][j]);
			}
			System.out.print("\n");
		}	
		System.out.println("====================");
	}
}
