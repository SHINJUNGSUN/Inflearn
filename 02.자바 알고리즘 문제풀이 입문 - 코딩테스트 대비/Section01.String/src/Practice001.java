import java.util.Scanner;

public class Practice001 {

    /**
     *  2024. 12. 30.
     *
     *  1. 문자 찾기
     *
     *  [ 설명 ]
     *  한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
     *  대소문자를 구분하지 않습니다.
     *  문자열의 길이는 100을 넘지 않습니다.
     *
     *  [ 입력 ]
     *  첫번째 줄에 문자열이 주어지고, 두번째 줄에 문자가 주어진다.
     *  문자열은 영어 알파벳으로만 구성되어 있습니다.
     *
     *  [ 예시 입력 01 ]
     *  Computercooler
     *  c
     *
     *  [ 예시 출력 02 ]
     *  2
     */
    public static void main(String[] args) {
        Practice001 practice = new Practice001();

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(practice.solution01(str, ch));
        System.out.println(practice.solution02(str, ch));
    }

    public int solution01(String str, char ch) {
        int answer = 0;

        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) answer++;
        }

        return answer;
    }

    public int solution02(String str, char ch) {
        int answer = 0;

        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);

        for(char item : str.toCharArray()) {
            if(item == ch) answer++;
        }

        return answer;
    }
}
