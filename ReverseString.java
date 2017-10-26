public class ReverseString {

    public String reverseIterative(String input)
    {
        String reverse = "";
        for(int i = input.length();i>0;i--)
        {
            reverse += input.substring(i-1,i);
        }
        return reverse;
    }


    public String reverseRecursive(String input, int stringLength)
    {
        return "";
    }
}
