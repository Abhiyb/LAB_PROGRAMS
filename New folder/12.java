public class StringManipulation {
    public static void main(String[] args) {
        String name = "John Doe";
        int length = name.length();
        System.out.println("Length of the name: " + length);

        boolean containsA = name.contains("a");
        System.out.println("Does the name contain 'a'? " + containsA);

        if (containsA) {
            
            int count = 0;
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'a') {
                    count++;
                }
            }
            System.out.println("Number of occurrences of 'a': " + count);
          
            System.out.print("Locations of occurrences of 'a': ");
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'a') {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
