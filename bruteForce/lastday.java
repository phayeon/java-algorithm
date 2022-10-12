/*
마지막 날짜 문제
특정 달의 마지막 날을 알아내는 알고리즘을 작성하시오.
달력으로 프린트 될수 있는 경우는 모두 몇가지 경우가 있을까?
그달이 큰달인 경우 31일까지 있을 것이고,
작은달인경우 30일 혹은 28일, 29일까지 있을 것이니까 모두 4가지 경우가 있다..
그달이 며칠까지 있는지는 다음과 같다.
31 , 28 or 29 ,31, 30, 31, 30, 31, 31, 30, 31, 30, 31 (1~12월까지) 입니다.
여기서 2월달이 문제다.
바로 윤년 때문이다.
윤년을 계산해 내는 방법은 간단하다.
1. 기본적으로 4의 배수가 되는 해는 윤년입니다...
2. 다만 100의 배수가 되는 해는 윤년이 아닙니다...
3. 그중에서 또 400의 배수가 되는 해는 윤년입니다..
위 3가지 규칙을 만족하는 해는 윤년이 된다.
년과 일을 입력받아서
출력하는 예는 다음과 같다
*************
년 월 일
*************
2000 2 28
*************

*/

package bruteForce;
import java.util.*;
class lastday{
    public static void main(String[] args) {
        lastday last = new lastday();
        Scanner scanner = new Scanner(System.in);
        System.out.println("연도 : ");
        int year = scanner.nextInt();
        System.out.println("월 : ");
        int month = scanner.nextInt();
        System.out.println(last.solution(year, month));
    }

    String solution(int year, int month){
        String title = " ### 윤년 계산기 ### ";
        int day = 0;
        switch(month){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : day = 31; break;
            case 4 : case 6 : case 9 : case 11 : day = 30; break;
            case 2 : day = checkLeapYear(year); break;
            default: System.out.println("해당 월은 존재하지 않습니다."); break;
        }
        return String.format(
                "%s\n"
                +"*************\n"
                +"년 월 일\n"
                +"*************\n"
                +"%d %d %d\n"
                +"*************\n", title, year, month, day);
    }
    int checkLeapYear(int year){
        int day = 0;
        if(year % 400 == 0){day = 29;}
        else if(year % 100 == 0){day = 28;}
        else if(year % 4 == 0){day = 29;}
        else{day = 28;}
        return day;
    } 
}