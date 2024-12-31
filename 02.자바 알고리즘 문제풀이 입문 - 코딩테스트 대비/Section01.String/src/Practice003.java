import java.util.Scanner;

public class Practice003 {

    /**
     *  2024. 12. 31.
     *
     *  3. 문장 속 단어
     *
     *  [ 설명 ]
     *  한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
     *  문장속의 각 단어는 공백으로 구분됩니다.
     *
     *  [ 입력 ]
     *  첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
     *  첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
     *
     *  [ 예시 입력 01 ]
     *  it is time to study
     *
     *  [ 예시 출력 02 ]
     *  study
     */
    public static void main(String[] args) {
        Practice003 practice = new Practice003();

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(practice.solution01(str));
        System.out.println(practice.solution02(str));
    }

    public String solution01(String str) {
        String answer = "";

        for(String word : str.split(" ")) {
            if(answer.length() < word.length()) answer = word;
        }

        return answer;
    }

    public String solution02(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;

        while((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);

            if(tmp.length() > max) {
                max = tmp.length();
                answer = tmp;
            }

            str = str.substring(pos + 1);
        }

        if(str.length() > max) answer = str;

        return answer;
    }
}

