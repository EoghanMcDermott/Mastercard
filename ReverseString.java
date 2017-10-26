public class ReverseString {

    public String reverseIterative(String input)//O(N)
    {
        String reverse = "";
        for(int i=input.length();i>0;i--)
        {
            reverse += input.substring(i-1,i); //adding last letter each time
        }
        return reverse;
    }


    public String reverseRecursive(String input)//O(N)
    {
        if(input.length() == 0)//base case
            return input;
        else
            return reverseRecursive(input.substring(1)) + input.substring(0,1);
    }
}
