public class Conversions {
   public static void main(String args[]) {
      String str = "1212";
      int num = Integer.parseInt(str);
      System.out.println(num);
      String st = Integer.toString(num);
      System.out.println(st);
      char ch = '5';
      int a = Character.getNumericValue(ch);
      int b = Integer.parseInt(String.valueOf(ch));
      System.out.println(a);
      System.out.println(b);
   }
}