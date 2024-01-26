
public class DSA {
    public static void main(String[] args) {
        int target = 10;
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = binary(target,num);
        if(result==-1){
            System.out.println("result not found");
        }else{
            System.out.println(result);
        }
    }
    public static int binary(int target,int[]num){
        int start=0;
        int end= num.length-1;

        while(start<=end)
        {
            int mid =start+(end-start)/2;
            int midval =num[mid];
            if(midval==target)
            {
                return mid;
            } else if(midval<target){
                start=mid+1;
            } else if (midval>target) {
                end=mid-1;
            }
        }
        return -1;
    }
}