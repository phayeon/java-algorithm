/*
국어. 영어, 수학점수를 입력받아서 학점을 출력하는 프로그램을 완성하시오.
각 과목 점수는 0 ~ 100 사이이다.
평균에 따라 다음과 같이 학점이 결정된다
90이상은 A학점
80이상은 B학점
70이상은 C학점
60이상은 D학점
50이상은 E학점
그 이하는 F학점

출력되는 결과는 다음과 같다.

### 성적표 ###
********************************
이름 국어 영어 수학 총점 평균 학점
*******************************
홍길동 90 90 92 272 90.6 A
********************************
*/

package bruteForce;

import java.util.Scanner;

class Grade{
    public static void main(String[] args) {
        Grade grade = new Grade();
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("국어 : ");
        int a = scanner.nextInt();
        System.out.println("영어 : ");
        int b = scanner.nextInt();
        System.out.println("수학 : ");
        int c = scanner.nextInt();
        System.out.println("과학 : ");
        int d = scanner.nextInt();
        System.out.println(grade.solution(name,a,b,c,d));
    }
    String solution(String name,int a,int b,int c,int d){
        String title = " ### 성적표 ###";
        int total = a+b+c+d;
        float avg = total/4;
        String gra = "";
        if(avg >= 90){gra = "A";}
        else if(avg >= 80){gra = "B";}
        else if(avg >= 70){gra = "C";}
        else if(avg >= 60){gra = "D";}
        else if(avg >= 50){gra = "E";}
        else{gra = "F";}
        return String.format(
            "%s\n********************************\n"
            +"이름 국어 영어 수학 과학 총점 평균 학점\n"
            +"*******************************\n"
            +"%s %d %d %d %d %d %.1f %s\n"
            +"*******************************"
            ,title, name, a, b, c, d, total, avg, gra);
    }
}
