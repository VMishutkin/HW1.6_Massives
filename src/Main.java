import java.util.Random;

public class Main {
    public static void main(String[] args) {
         int[] buhBook = generateRandomArray();

        //Задача 1
         int monthSum = 0;
        for (int i = 0; i < buhBook.length; i++) {
            monthSum +=buhBook[i];
        }
        System.out.println("Сумма трат за месяц составила "+ monthSum +" рублей");
        //Задача 2
        int minSpend = buhBook[0];
        int maxSpend = buhBook[0];
        for (int i = 1; i < buhBook.length; i++) {
            if (minSpend>buhBook[i]){
                minSpend=buhBook[i];
            }
            if (maxSpend<buhBook[i]){
                maxSpend = buhBook[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+ minSpend+" рублей. Максимальная сумма трат за день составила "+maxSpend+" рублей.");
        //Задача 3
        double avarageSpend = (double) monthSum / buhBook.length ;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей %n",avarageSpend);
        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < (reverseFullName.length /2) ; i++) {
            char tempChar = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length-1-i];
            reverseFullName[reverseFullName.length-1-i] = tempChar;
        }
        System.out.println(reverseFullName);
      }

      public static int[] generateRandomArray(){
        Random random = new Random();
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000) + 100_000 ;
        }
        return array;
    }

}