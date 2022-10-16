package Lec9_Strings;

public class CompresstheString {
	public static String getCompressedString(String str) {
		// Write your code here.
          String output=""+str.charAt(0);
        int count=1;
        for (int i=1;i<str.length();i++)
        {
            if (str.charAt(i) != str.charAt(i-1))
            {
                //System.out.println("Count of " + input.charAt(i-1) + " = " + count);
                if (count>1)
                {
                    output=output+Integer.toString(count);
                }
                output=output+str.charAt(i);
                count=1;
            }
            else
            {
                count=count+1;
            }            
            
        }
        
        if (count>1)
        {
            output=output+Integer.toString(count);
        }
        //System.out.println(output);
        return output;
        
        
	}

}