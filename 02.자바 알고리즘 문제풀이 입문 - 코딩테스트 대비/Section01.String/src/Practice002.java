import java.util.Scanner;

public class Practice002 {

    /**
     *  2024. 12. 31.
     *
     *  2. 대소문자 변환
     *
     *  [ 설명 ]
     *  대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
     *
     *  [ 입력 ]
     *  첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
     *  문자열은 영어 알파벳으로만 구성되어 있습니다.
     *
     *  [ 예시 입력 01 ]
     *  StuDY
     *
     *  [ 예시 출력 02 ]
     *  sTUdy
     */
    public static void main(String[] args) {
        Practice002 practice = new Practice002();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(practice.solution01(str));
        System.out.println(practice.solution02(str));
    }

    public String solution01(String str) {
        String answer = "";

        for(char ch : str.toCharArray()) {
            answer += Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
        }

        return answer;
    }

    /**
     * [ 참고 ]
     * ASCII
     * LowerCase : 65 ~ 90 (+32)
     * UpperCase : 97 ~ 122 (-32)
     */
    public String solution02(String str) {
        String answer = "";

        for(char ch : str.toCharArray()) {
            if(ch >= 97 && ch <= 122) answer += (char) (ch - 32);
            else answer += (char) (ch + 32);
        }

        return answer;
    }
}

