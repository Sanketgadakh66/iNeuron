package in.ineuron.practise;


public class DuplicateInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 3};
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] != -1) {
                for (int j = i + 1; j < length; j++) {
                    if (array[i] == array[j]) {
                        System.out.println("Duplicate element: " + array[i]);
                        array[j] = -1;
                    }
                }
            }
        }
    }
}

