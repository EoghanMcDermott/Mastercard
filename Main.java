public class Main{

    public static void main(String[] args) {

        int[] array = {1,2,2,3,4};

        MostFrequentInt test = new MostFrequentInt();
        int freq =  test.getMostFrequent(array);

        System.out.println("The most frequent integer is:   " + freq);
    }

}
