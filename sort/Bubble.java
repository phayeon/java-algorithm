/* 랜덤 숫자 */

package sort;
import java.util.*;

class Bubble{
    public static void main(String[] args) {
        new Bubble().solution();
    }
    void solution(){
        int[] arr = createArray();
        arr = sortArray(arr);
        printArray(arr);
    }
    int createRandomNumber(){
        return (int)(Math.random()*100)+1; /* 시작 값 1, 끝 값 100 */
    }
    int[] createArray(){
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = createRandomNumber();
        }
        return arr;
    }
    int[] sortArray(int[] arr){
        return arr;
    }
    void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+"\t");
        }
    }
}