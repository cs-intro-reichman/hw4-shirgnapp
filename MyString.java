public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("EaSy PeAsY LeMoN SqUeEzy : " + lowerCase("EaSy PeAsY LeMoN SqUeEzy"));
       
        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // System.out.println(index1("resignation", "sign")); // true
    }
    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowString= "";
        if (str == "") {
            return "";
        }
        for(int i=0; i<str.length(); i++){
        if (str.charAt(i) == ' ') {
            lowString+= " ";
        }
        else {
           if ((int)(str.charAt(i)) < 91) {
                lowString += (char)(str.charAt(i) + 32);   
           }
           else
           lowString += str.charAt(i);
        }
        }
        return lowString;
    }
public static int index2(String str1, String str2) {
    for(int i=0; i< str1.length(); i++){
        for(int j=0; j<str2.length(); j++)
            if (str2.charAt(j) == str1.charAt(i)){
               return j;
        }    
    }
    return -1;
}  
public static boolean contains(String str1, String str2) {
    if (str2.length() > str1.length()) {
        return false;
    }
    if (str2 == "") {
        return true;
    }
    if (str1.length() == str2.length()) {
      for(int i=0; i<str1.length(); i++){
        if (str1.charAt(i) != str2.charAt(i)) {
            return false;
        }
        if (i == str1.length()-1) {
            return true;            
        }
      }
       }
    int firstindex = -1; 
      for(int i=0; i<str1.length(); i++){
        if (str1.charAt(i) == str2.charAt(0)) {
            firstindex = i;
            break;
        }
        if (firstindex == -1 && i == str1.length()-1) {
            return false;
        }
      }
      for(int j = 0; j < str2.length(); j++){ 
        if (str1.charAt(j + firstindex) != str2.charAt(j)) {
            return false;
        }
        if (str1.charAt(j+firstindex) == str2.charAt(j) && j == str2.length()-1) {
            return true;
        }
      }
      return false;
}
}


















