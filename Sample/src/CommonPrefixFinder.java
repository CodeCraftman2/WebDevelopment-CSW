public class CommonPrefixFinder {

    public static String commonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return ""; // Return an empty string if the array is null or empty
        }

        // Take the first string as the reference for comparison
        String prefix = strings[0];

        // Iterate through the array starting from the second string
        for (int i = 1; i < strings.length; i++) {
            // Compare characters of the current string with the prefix
            int j = 0;
            while (j < prefix.length() && j < strings[i].length() && prefix.charAt(j) == strings[i].charAt(j)) {
                j++;
            }

            // Update the prefix to the common part
            prefix = prefix.substring(0, j);

            // If the prefix becomes empty, no common prefix exists
            if (prefix.isEmpty()) {
                break;
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] A = {"Flower", "Flow", "Flight"};
        String result = commonPrefix(A);
        System.out.println("The largest common prefix is: " + result);
    }
}
