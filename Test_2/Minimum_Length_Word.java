package Test_2;

public class Minimum_Length_Word {
    public static String minLengthWord(String str){
		
		// Write your code here
		String[] arr=str.split(" ");
        int i=0;
        int maxlength,minlength;
        maxlength=Integer.MIN_VALUE;
        minlength=Integer.MAX_VALUE;
        String largest,smallest;
        largest = smallest = "";
        for(i=0;i<arr.length;i++)
        {
            if(arr[i].length() < minlength){
                smallest=arr[i];
                minlength=arr[i].length();
            } 
            // if(arr[i].length() > maxlength) {
            //     largest=arr[i];
            //     maxlength=arr[i].length();
            // 
        }
    return smallest;}
}

