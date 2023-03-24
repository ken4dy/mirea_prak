package park1;
public class Cycles {
    public static void main(String[] args) {
        int []arr=new int[]{1,3,5,6,7,10};
        int sum=0;
        //cycle for
        for (int j : arr) {
            sum = j + sum;
        }
        System.out.println("Sum(for)="+sum);
        //cycle while
        int i=0;
        sum =0;
        while(i<arr.length){
            sum=arr[i]+sum;
            i++;
        }
        System.out.println("Sum(while)="+sum);
        //cycle do while
        i =0;
        sum=0;
        do{
            sum=arr[i]+sum;
            i++;
        }while(i<arr.length);
        System.out.println("Sum(do while)="+sum);
    }
}