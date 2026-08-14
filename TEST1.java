public class TEST1 {
    public static void main(String[] args) {
        String str1= "string Examples";
        int length = str1.length(); 
        char ch= str1.charAt(5);
        int indf= str1.indexOf("s");
        int indf1= str1.lastIndexOf("s");
        String str2 = str1.toUpperCase();
        String str3 = str1.toLowerCase();
        String str4= str1.replace("g","h");
        System.out.println("Total length of String Str1 = "+ length);
        System.out.println("character at the index of 5 in String Strl = " + ch);
        System.out.println("Printing the first index of S from Strl= " + indf);
        System.out.println("Printing the last index of S from Str1= " + indf1);
        System.out.println("Printing the uppercase of Strl= "+ str2);
        System.out.println("Printing the lowercase of Strl= "+ str3);
        System.out.println("Replacing the character and printing of Str1= "+ str4); 
    }
}