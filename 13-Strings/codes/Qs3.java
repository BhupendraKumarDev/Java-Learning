public class Qs3 {
    public static void main(String[] args){
        /* 
            Qs : For a given set of String, print the largest string.
            "apple", "mango", "banana"
        */

        String fruits[] = {"aaple", "mango", "banana"};
        String largest = fruits[0];

        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
