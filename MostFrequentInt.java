public class MostFrequentInt { //O(N^2) so not great

    public int getMostFrequent(int[] input)
    {
        int mostFrequentCount = 0;
        int mostFrequentInt = input[0]; //default value

        for (int i=0;i<input.length-1;i++)
        {
            int count = 0;

            for (int j=1;j<input.length;j++)
            {
                if (input[i] == input[j])//match found
                    count++;
            }
            if (count > mostFrequentCount)//new best result found
            {
                mostFrequentInt = input[i];
                mostFrequentCount = count;
            }
        }
        return mostFrequentInt;
    }
}
