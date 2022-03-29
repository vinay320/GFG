//Function to find a continuous sub-array which adds up to a given number.
import java.util.ArrayList;
import java.util.Scanner;
public class GFG1 {
            static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
        {   ArrayList<Integer> arr1=new ArrayList<>();
            int sum=0;
            int start=1;
            for(int i=0;i<n;i++)
            {
                sum=sum+arr[i];
                while(sum>s)
                {
                    sum=sum-arr[start-1];
                    start++;
                }
                if(sum==s)
                {
                    arr1.add(start);
                    arr1.add(i+1);
                    return arr1;
                }

            }
            arr1.add(-1);
            return arr1;
        }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
        arr[i]=sc.nextInt();
        }
        System.out.println("Enter sum");
        int s=sc.nextInt();
        System.out.println(subarraySum(arr,n,s));
    }
    }

