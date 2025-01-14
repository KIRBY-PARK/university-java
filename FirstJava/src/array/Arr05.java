package array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자(char), 문자열(String)
        // String = char

        // 기본형 변수 vs 참조형 변수
        // 1. 기본형 변수는 '소문자로 시작함'
        // 2. 참조형 변수는 '대문자로 시작함'
        // - wrapper class에서 기본형 변수를 감싸줄 때(boxing), int -> Integer
        // 3. 기본형 변수는 값 자체를 저장
        // 4. 참조형 변수는 별도의 공간에 값을 저장 후 그 주소를 저장함 (= 주소형 변수)

        // char 보다 String을 훨씬 더 많이 사용함
        // wrapper class와도 상당히 비슷함. -> 기본형 변수가 가지고 있는 기능이 제한 -> 다양한 기능을 제공하는 Wrapper를 감쌈으로서 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength);

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substring(int fromIdx, int toIdx)
        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        // (4) equals (String str)
        String newStr = "ABCE";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // (5) toCharArray() : String -> char[];
        char[] strCharArray = str.toCharArray();

        // (6) 반대로 char[] -> String -> char
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}
