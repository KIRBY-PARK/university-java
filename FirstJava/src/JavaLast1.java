public class JavaLast1 {
    public static void main(String[] args) {
        // 작은 크기의 타입이 큰 크기의 타입과 '계산'될 때
        // 자동으로 큰 크기의 타입으로 형 변환이 된다.

        int intNumber = 10;
        double doubleNumber = 5.5;
        double result = intNumber + doubleNumber;

        System.out.println("Plus => " + result);

        // 1) 정수로 나누기
        int iResult = intNumber / 4; // 2.5로 예상했지만 소수점을 버리고 2라는 값이 나옴

        // 2) 실수로 나누기
        double dResult = intNumber / 4.0;

        System.out.println(iResult + " / " + dResult);
    }
}
