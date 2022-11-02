package com.prefix;

/**
 *  Given a list of words, return the shortest unique prefix of each word.
 *  For example, the list ["dog", "cat", "apple", "apricot", fish"]
 *  Would return          ["d", "c", "app", "apr", "f"]
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] arr = {"dog", "cat", "apple", "apricot", "fish"};
        String[] newArr = new String[arr.length];
        System.out.printf("\nOriginal list:\t");
        for (String item: arr) {
            System.out.printf("%s\t", item);
        }

        newArr = returnPrefixes(arr);

        System.out.printf("\nNew List:\t");
        for (String item: newArr) {
            System.out.printf("%s\t", item);
        }
        System.out.println();

        
    }

    public static String[] returnPrefixes (String[] arr) {
        // Creat new array to return list of prefixes
        String[] prefixArray = new String[arr.length];

        // iterate through each word in array
        for (int i = 0; i < arr.length; i++) {
            // Initialize temp vars
            String temp = "";
            int letterIndex = 0;
            // Add first letter to prefix
            temp += arr[i].charAt(0);

            // Iterate and crosscheck remaining words
            // Using arr[i] length to iterate by letter
            for (int j = 0; j < arr.length; j++) {
                // If words match, skip
                if (arr[i] == arr[j]) { continue; }
                // If charAt matches add letter
                else if (arr[i].charAt(letterIndex) == arr[j].charAt(letterIndex)) {
                    // Add letter
                    temp += arr[i].charAt(letterIndex + 1);
                    // Increment index
                    letterIndex++;
                    // Decrement j to repeat word
                    j--;
                }
                else { continue; }

            }

            prefixArray[i] = temp;

        }

        return prefixArray;
    }
}
