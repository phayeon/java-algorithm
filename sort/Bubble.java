package sort;
import java.util.*;

class Bubble{
    public static void main(String[] args) {
        new Bubble().solution();
    }
    void solution(){
        
        int randomNumber = (int)(Math.random()*10)+1;
        /* Math.random() 은 기본적으로 double 값을 반환함 */
        /* (int) 를 추가해 반환 값 타입 변경 → '캐스팅' 이라고 함 */
        System.out.println("랜덤 넘버 : "+randomNumber);
        /* " "+ → randomNumber.solution 간소화(추상화) */
    }
}