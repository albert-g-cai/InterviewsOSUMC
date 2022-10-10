package interview;

public class Problem002 {
    public static String merge(String s1, String s2)
    {
        System.out.println(s2+":"+s1);
        StringBuilder mergedString = new StringBuilder();
        if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                mergedString.append(s2.charAt(i));
                mergedString.append(s1.charAt(i));
            }
            for (int i = s1.length(); i < s2.length(); i++) {
                mergedString.append(s2.charAt(i));
            }
        }else if(s1.length() > s2.length()){
            for (int i = 0; i < s2.length(); i++) {
                mergedString.append(s1.charAt(i));
                mergedString.append(s2.charAt(i));
            }
            for (int i = s2.length(); i < s1.length(); i++) {
                mergedString.append(s1.charAt(i));
            }
        }else if(s1.length() == s2.length()){
            for (int i = 0; i < s2.length(); i++) {
                mergedString.append(s1.charAt(i));
                mergedString.append(s2.charAt(i));
            }
        }
        return mergedString.toString();
    }
    public static void main(String[] args)
    {
//        Input: string 1: "lobster"
//        string 2: "like"
//        Output: "lloibkseter"
//        String s1 = "lobster";
//        String s2 = "like";

//        Input: string 1: "hello"
//        string 2: "lobster"
//        Output: "lhoeblsltoer"
//        String s1 = "hello";
//        String s2 = "lobster";

//        Input: string 1: "gourmet""
//        string 2: "lobster"
//        Output: "glooubrsmteetr"
//        String s1 = "hello";
//        String s2 = "lobster";

        String s1 = "gourmet";
        String s2 = "lobster";

        System.out.println(merge(s1, s2));
    }
}
//Problem 1
//        Given two strings, merge them in an alternate way, i.e. the final string¡¯s first character is
//        the first character of the longer string, the second character of the final string is the first
//        character of the shorter string and so on. Once you reach end of the shorter string, if the
//        longer string has remaining characters then append those characters to final string. If
//        the length of both strings are equal, then the final string¡¯s first character is the first
//        character of the first string.
//        Examples:
//        Input: string 1: "lobster"
//        string 2: "like"
//        Output: "lloibkseter"
//        Explanation: The answer contains characters from alternate strings, and once
//        the second shorter string ends the remaining of the first longer string is added to the
//final string
//        Input: string 1: "hello"
//        string 2: "lobster"
//        Output: lhoeblsltoer
//        Input: string 1: "gourmet"
//        string 2: "lobster"
//        Output: glooubrsmteetr
////////////////////////////////////////////////////////////////////////////
//Test results:
//lobster:gourmet
//        glooubrsmteetr
//        Process finished with exit code 0
////////////////////////////////////////////////////////////////////////////