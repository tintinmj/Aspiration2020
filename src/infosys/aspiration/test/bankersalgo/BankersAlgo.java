/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys.aspiration.test.bankersalgo;

import infosys.aspiration.Library.ArrayUtil;
import java.util.Scanner;

/**
 *
 * @author Tintinmj
 */
public class BankersAlgo {
    private static int noOfResources;
    private static int noOfProcess;
    private static int []availableResource;
    private static int [][]allocatedResource;
    private static int [][]maximumResource;
    
    public static void setDimension(int noOfProcess, int noOfResources) {
        BankersAlgo.noOfProcess = noOfProcess;
        BankersAlgo.noOfResources = noOfResources;
    }
    
    private boolean getStateHelper() {
        for (int i = 0; i < noOfProcess; i++) {
            for (int j = 0; j < noOfResources; j++) {
                int need = maximumResource[i][j] - allocatedResource[i][j];
                if (need > availableResource[j])
                    return false;
                availableResource[j] -= need;
                availableResource[j] += maximumResource[i][j];
             }
        }
        return true;
    }
    
    public int getState(int alcatedResrc[][], int maxRes[][], int avl[]) {
        if (getStateHelper()) {
            return 0;
        }
        else
            return 1;
    }
    
    public static void main(String[] args) {
        BankersAlgo bAlgo = new BankersAlgo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of processes and no of resources : ");
        setDimension(sc.nextInt(), sc.nextInt());
        
        //----
        availableResource = new int[noOfResources];
        System.out.println("Enter no of available[] resources : ");
        ArrayUtil.input1DArray(availableResource);
        
        //----
	allocatedResource = new int[noOfProcess][noOfResources];
        System.out.println("Enter no of allocated[][] resources : ");
        ArrayUtil.input2DArray(allocatedResource);

	//----
        maximumResource = new int[noOfProcess][noOfResources];
        System.out.println("Enter no of maximum[][] resources : ");
        ArrayUtil.input2DArray(maximumResource);
        
        //----
        if (bAlgo.getState(allocatedResource, 
                           maximumResource, 
                           availableResource) == 0) {
            System.out.println("Successful means safe");
        }
        else
            System.out.println("Un-Successful means not safe");
    }
}
