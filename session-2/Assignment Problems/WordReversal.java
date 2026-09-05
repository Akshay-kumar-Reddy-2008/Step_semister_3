public class WordReversal {

    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            StringBuilder reverse = new StringBuilder(word);
            result += reverse.reverse().toString() + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        String sentence = "hello club";
        System.out.println(reverseEachWord(sentence));
    }
}