import java.util.Scanner;

 class Solution {

   public static void main(String ss[]) {
       Scanner scanner = new Scanner(System.in);
       int size = scanner.nextInt();
       String firstNames[] = new String[size];
       String lastNames[] = new String[size];
       for (int i = 0; i < size; i++) {
           firstNames[i] = scanner.next().toLowerCase();
       }
       for (int i = 0; i < size; i++) {
           lastNames[i] = scanner.next().toLowerCase();
       }
       scanner.close();

       // Sort in ascending order
       sortAescending(firstNames);
       for (String i : firstNames) {
           System.out.println(i);
       }

       // Sort in descending order
       sortDescending(lastNames);
       for (String i : lastNames) {
           System.out.println(i);
       }
   }

   private static void sortDescending(String[] lastNames) {
       int n = lastNames.length;
       for (int j = 1; j < n; j++) {
           String key = lastNames[j];
           int i = j - 1;
           while ((i > -1) && (lastNames[i].compareTo(key) < 0)) {
               lastNames[i + 1] = lastNames[i];
               i--;
           }
           lastNames[i + 1] = key;
       }
   }

   private static void sortAescending(String[] firstNames) {
       int n = firstNames.length;
       for (int j = 1; j < n; j++) {
           String key = firstNames[j];
           int i = j - 1;
           while ((i > -1) && (firstNames[i].compareTo(key) >= 0)) {
               firstNames[i + 1] = firstNames[i];
               i--;
           }
           firstNames[i + 1] = key;
       }

   }
}

