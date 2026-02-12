public class LargestArray{
     public static void main(String[] args){
        int arr[] = {9,36,5,1,34,90};
        int res = arr[0];
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>res){
                res = arr[i];
            }

        }
        System.out.println(res);

     }
}