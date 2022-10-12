/*
키와 몸무게를 입력받아서 비만도를 측정하는 프로그램을 완성하시오.
BMI 지수를 구하는 공식은 다음과 같다.
BMI지수 = 몸무게(70kg) / (키(1.7m) * 키(1.7m))

BMI 지수에 따른 결과는 다음과 같다.
고도 비만 : 35 이상
중(重)도 비만 (2단계 비만) : 30 - 34.9
경도 비만 (1단계 비만) : 25 - 29.9
과체중 : 23 - 24.9
정상 : 18.5 - 22.9
저체중 : 18.5 미만


이름, 키, 몸무게를 입력받으면 다음과 같이 출력되도록 하시오.

### 비만도 계산 ###
***************************
이름 키(cm) 몸무게(kg) 비만도
***************************
홍길동 170 79 정상
***************************
*/

package bruteForce;
import java.util.*;

class Bmi{
    public static void main(String[] args) {
    Bmi bmi = new Bmi();
    Scanner scanner = new Scanner(System.in);
        System.out.println("이름 : ");
        String name = scanner.next();
        System.out.println("키(cm) : ");
        float cm = scanner.nextFloat();
        System.out.println("몸무게(kg) : ");
        float kg = scanner.nextFloat();
        System.out.println(bmi.solution(name, kg, cm));
    }
    String solution(String name, float kg, float cm){
        String title = "### 비만도 계산 ###";
        float m = cm/100;
        float bmi = kg/(m*m);
        String answer = "";
        if(bmi>=35){answer = "고도 비만";}
        else if(bmi>=30){answer = "중(重)도 비만 (2단계 비만)";}
        else if(bmi>=25){answer = "경도 비만 (1단계 비만)";}
        else if(bmi>=23){answer = "과체중";}
        else if(bmi>=18.5){answer = "정상";}
        else{answer = "저체중";}
        return String.format(
            "%s\n***************************\n"
            +"이름 키(cm) 몸무게(kg) 비만도\n"
            +"***************************\n"
            +"%s %.1f %.1f %.1f %s\n"
            +"***************************"
            , title, name, cm, kg, bmi, answer);
    }
}