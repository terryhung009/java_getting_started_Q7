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

        char[] endWord = new char[word2.length()];
        for(int k=0;k<word2.length();k++){
            endWord[k] = word2.charAt(k);
        }


        int z = 0;
        for(int l=endWord.length-1;l>=0;l--) {
            if (targetWord[targetWord.length - 1 - z] != endWord[l]) {
                return false;
            }
            z++;
        }

        return true;
    }

    /**思考方式：
     *建立變數j存入s1的長度-1 ->String s1最後的index值
     *從String s2與 String s1最後一個字元開始比對，如果字元不同就return false
     *比對到String s2 index值小於0，代表字串相同，return true
     *
     */
    public static boolean confirmEnding2(String s1,String s2){
        int j = s1.length()-1;
        for(int i =s2.length()-1;i>=0;i--){
            if(s2.charAt(i) != s1.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }






    public static void main(String[] args) {
        System.out.println(confirmEnding2("Bastian", "n"));
        System.out.println(confirmEnding2("Connor", "n"));
        System.out.println(confirmEnding2("Open sesame", "same"));
        System.out.println(confirmEnding2("Open sesame", "not"));

    }
}
