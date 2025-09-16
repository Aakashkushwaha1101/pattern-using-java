package Pattern;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num= scn.nextInt();

        for (int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print('*');

            }
            System.out.println();
        }
    }
}
