package BinarySearchAlgo;

public class GreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c', 'e', 'g', 'j'};
        char letter = 'c';
        System.out.println(greatestLetter(letters, letter));
    }

    static char greatestLetter(char[] letters, char letter) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(letter < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
