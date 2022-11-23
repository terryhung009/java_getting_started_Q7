import java.util.ArrayList;

public class Main {

    public static boolean confirmEnding(String a,String b){

        /**   solution 1
         *      使用ArrayList
         */

//        ArrayList<Character> arr = new ArrayList<Character>();
//        for(int k=0;k<b.length();k++){
//            arr.add(b.charAt(k));
//        }
//
//        ArrayList<Character> word = new ArrayList<Character>();
//        for(int i =0;i<a.length();i++){
//            word.add(a.charAt(i));
//
//        }
////        System.out.println(word.get(word.size()-1));
//        if(word.get(word.size()-1).equals(arr.get(arr.size()-1))){
//                return true;
//        }
//        return false;

        /**    solution 2
         *      使用Array
         *
         */


        char[] word = new char[a.length()];
        for (int i = 0;i<a.length();i++){
            word[i] = a.charAt(i);
        }

        char[] arr = new char[b.length()];
        for(int k=0;k<b.length();k++){
            arr[k] = b.charAt(k);
        }


        if(word[word.length-1] == arr[arr.length-1]){
            return true;
        }
        return false;






    }





    public static void main(String[] args) {
        System.out.println(confirmEnding("Bastian", "n"));
        System.out.println(confirmEnding("Connor", "n"));
        System.out.println(confirmEnding("Open sesame", "same"));
    }
}
