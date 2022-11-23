import java.util.ArrayList;

public class Main {

    /**思考方式：將迴圈將每個字元加入char array targetWord與
     * char array endWord ，從最後一個字元比對endWord與targetWord array，
     * 比到endWord的長度，如果不同就return false，比對到最後都相同，return true
     *
     */
    public static boolean confirmEnding1(String word1,String word2){

        char[] targetWord = new char[word1.length()];
        for (int i = 0;i<word1.length();i++){
            targetWord[i] = word1.charAt(i);
        }
        for(char b : targetWord){
            System.out.print(b+ " ");
        }
        System.out.println("");

        char[] endWord = new char[word2.length()];
        for(int k=0;k<word2.length();k++){
            endWord[k] = word2.charAt(k);
        }
        for(char a : endWord){
            System.out.print(a+ " ");
        }
        System.out.println("");

        int z = 0;
        for(int l=endWord.length-1;l>=0;l--) {
            if (targetWord[targetWord.length - 1 - z] != endWord[l]) {
                return false;
            }
            z++;
        }

        return true;
    }
    /**   思考方式：
     *
     */
//    public static boolean confirmEnding2(String word1,String word2) {
//        retrun true;
//    }

    /**   思考方式：使用ArrayList，迴圈將每個字元加入元素
     *
     */

    public static boolean confirmEnding3(String word1,String word2) {


        ArrayList<Character> array = new ArrayList<Character>();

        ArrayList<Character> endWord = new ArrayList<Character>();
        for(int k = 0 ;k < word2.length() ;k++){
            endWord.add(word2.charAt(k));
        }

        ArrayList<Character> targetWord = new ArrayList<Character>();
        for(int i =0;i<word1.length();i++){
            targetWord.add(word1.charAt(i));

        }




//        System.out.println(targetWord.get(targetWord.size()-1));
        if(targetWord.get(targetWord.size()-1).equals(endWord.get(endWord.size()-1))){
            return true;
        }
        return false;
    }





    public static void main(String[] args) {
        System.out.println(confirmEnding1("Bastian", "n"));
        System.out.println(confirmEnding1("Connor", "n"));
        System.out.println(confirmEnding1("Open sesame", "same"));
        System.out.println(confirmEnding1("Open sesame", "not"));

    }
}
