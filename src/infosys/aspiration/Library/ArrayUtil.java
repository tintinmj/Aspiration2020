/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.Library;

import java.util.Scanner;

/**
 *
 * @author Tintinmj
 */
public final class ArrayUtil {
    
    private static Scanner input = new Scanner(System.in); 
    
    public static void input1DArray(int []array) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        
    }
    
    public static void input2DArray(int [][]array) {
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextInt();
            }
        }
        
    }
    
}
