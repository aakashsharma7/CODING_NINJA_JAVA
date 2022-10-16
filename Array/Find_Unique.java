package Array;

public class Find_Unique{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j;
            for( j = 0; j < n; j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        break;
                    }
                }
            }
            if(j==n){
                 //means we checks i for every j and 
                 //found no match for that i value, 
                 //showing that arr[i] is unique
                return arr[i];
            }
            
        }
        return Integer.MAX_VALUE;
    }
    public static void main(String[] args){
        int arr[] = {23,56,78,56,23};
        System.out.println(findUnique(arr));
    }
}