// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//입력
//첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//출력
//첫째 줄에 다음 세 가지 중 하나를 출력한다.
//A가 B보다 큰 경우에는 '>'를 출력한다.
//A가 B보다 작은 경우에는 '<'를 출력한다.
//A와 B가 같은 경우에는 '=='를 출력한다.
// 백준 1330번 자바문제
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        // StringTokenzier st = new StringTokenzier(문자열, 구분자, true/false);
        //                                           str   " "
        // BufferReader class의 method인 readLine()은 줄(Line) 단위로 읽음 read + Line
        // 문자 하나하나로 읽고 싶을 때 StringTokenizer >> 1 2를 1+공백+2가 아니라 1과 공백으로 구분된 2 두 가지로 읽겠단 뜻임
        // String(문자) + Tokenziner(토큰화하다) 토큰은 분리된 무언가를 의미하는 단어임
        int A = Integer.parseInt(st.nextToken()); // String 형태로 받은 값을 정수화 시키는 method
        int B = Integer.parseInt(st.nextToken());
        // 위 두 줄의 코드가 실행되면 문자열로 입력한 (비록 숫자일지언정) 값이 정수로 변환되고 서로의 대소관계를 파악할 수 있게 된다
        // System.out.println("st =" + Integer.parseInt(st.nextToken()));
        System.out.println(A>B ? "> " : ((A<B) ? "<" : "=="));
        // 그렇게 문자열의 형태로 입력 받아 정수로 변환한 두 값의 대소 관계를 비교한 후 println = 출력함
        // n은 10보다 크다 >>>> n>10
        // n이 10보다 크면 11이고 아니면 9이다 >>>> n > 10 ? 11 : 9
    }
}