package samplePrograms;

public class Armstrong
{
    public static void main(String[] args) 
     {
        int n, a, sum = 0;
        System.out.print("Armstrong numbers from 100 to 1000:");
        for(int i = 100; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                a = n % 10;
                sum = sum + (a * a * a);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}