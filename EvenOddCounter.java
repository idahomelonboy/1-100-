public class EvenOddCounter {
  public static void main(String[] args) {
    int[] numbers = new int[100];  
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
    int sum = 0;  
    for (int num : numbers) {
      System.out.println(num);
      if (num % 2 == 0) {
        System.out.println(num + " is even.");
      } else {
        System.out.println(num + " is odd.");
      }
      sum += num;
    }
    System.out.println("Total sum of numbers from 1 to 100 is: " + sum);
  }
}