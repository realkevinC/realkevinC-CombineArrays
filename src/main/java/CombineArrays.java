
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int[] combine = new int [arr1.length + arr2.length];
        int i = 0;

        // enhance for loop
        for (int num : arr1){
            combine[i] = num;
            i++;
        }
        for (int num : arr2){
            combine[i] = num;
            i++;
        }
        return combine;
    }
}
