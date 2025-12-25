package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Array arr=new Array();

        //int []numbers={1,2,3,4,5};
        int [] numbers2=new int[5];
        for (int i=0;i<numbers2.length;i++)
            numbers2[i]=scanner.nextInt();






        System.out.println(Arrays.toString(numbers2));
        for (int i=0;i<numbers2.length;i++){
            System.out.println("indes["+i+"]="+numbers2[i]);
        }
        int[][] data=new int[2][2];
        data[0][0]=2;
        data[0][1]=3;
        data[1][0]=4;
        data[1][1]=5;
        for (int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                System.out.println(data[i][j]);


    }}

