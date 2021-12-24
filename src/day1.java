import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class day1 {
  public static void main (String[] args)  {
    File day1File = new File("/Users/gideonprempeh/IdeaProjects/p4/src/mypaper.txt");
    int [] arr = new int[10000];
    try {
      Scanner scanner = new Scanner(day1File);
      int a = 0;
      while ((scanner.hasNextInt()))   {
        arr[a++] = scanner.nextInt();
      }
      int [] first = new int[3];
      int [] second = new int[3];
      int incre = 0;
      int incre2 = 0;
      for (int i = 0; i < arr.length-1; i++) {
        int j = i + 1;
        if(arr[j] > arr[i]){
          incre++;
        }
      }
      for (int s = 0; s < arr.length; s++) {
        for (int l = 0; l < 3; l++) {
          first[l] = arr[l];
          second[l] = arr[l + 1];
        }
        int sum = 0;
        int sum2 = 0;
        for (int value : first) {
          sum += value;
        }
        for (int value : second) {
          sum2 += value;
        }
        if(sum2 > sum){
          incre2++;
        }
        arr = Arrays.copyOfRange(arr, 1, arr.length);
        }
      System.out.println(incre);
      System.out.println(incre2);
    }catch (IOException e) {
    }
  }
}
