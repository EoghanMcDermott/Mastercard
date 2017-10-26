public class Main
{
    public static void main(String[] args)
    {
        //Demonstrating Task 1
        int[] array = {1,2,2,3,4};

        MostFrequentInt task1 = new MostFrequentInt();
        int freq =  task1.getMostFrequent(array);

        System.out.println("The most frequent integer is:   " + freq);

        //Demonstrating Task 2
        ReverseString task2 = new ReverseString();
        String forward = "Hello World";

        String iterative = task2.reverseIterative(forward);
        System.out.println(forward + " reversed iteratively is: " + iterative);

        String recursive = task2.reverseRecursive(forward);

        System.out.println(forward + " reversed recursively is: " + recursive);
    }
}
