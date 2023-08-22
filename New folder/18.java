public class StringManipulation {
    public static void main(String[] args) {
        
        String originalText = "Hello, World! Hello, Universe!";
        String replacedText = originalText.replaceAll("Hello", "Hi");
        System.out.println("replaceAll: " + replacedText);
        String originalText2 = "Hello, World! Hello, Universe!";
        String replacedText2 = originalText2.replaceFirst("Hello", "Hi");
        System.out.println("replaceFirst: " + replacedText2);

        String sentence = "This is a sample sentence.";
        String[] words = sentence.split(" ");
        System.out.println("split:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
