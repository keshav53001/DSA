public class DSA {
    public static void main(String[] args) {
        int[]arr={1,5,2,4,7,8,8,4,7,9,6};
        DSA obj=new DSA();
        obj.pattern(6,arr);
    }
public void pattern(int target,int[] arr ){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("the index of "+target+" is "+i);
            }
        }
    }
}