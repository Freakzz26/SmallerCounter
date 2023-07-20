import java.util.Scanner;

public class SmallerElements {
    static void checkCount(int arr[],int n)
    {
        int result[]=new int[n];
        int count=0;
        for (int i=0;i<n;i++)
        {
            count=0;
            for (int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
            result[i]=count;
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        checkCount(arr,n);
    }
}
