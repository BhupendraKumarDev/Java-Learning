public class CharATmethod {

        public static void printLetters(String str){
            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i)+" ");
            }
        }
        public static void main(String[] args){
        String firstName = "bhupendra";
        String lastName = "kumar";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}
