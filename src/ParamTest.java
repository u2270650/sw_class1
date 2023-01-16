public class ParamTest {
     public static void main(String args[]) {
               int val;
               StringBuilder s1, s2;
               val = 10;

               s1 = new StringBuilder("apples");
               s2 = new StringBuilder("pears");

               System.out.println("val is " + val);
               System.out.println("s1 is "  + s1);
               System.out.println("s2 is " + s2);
               System.out.println("Calling modify ..");

               // All parameters passed by value
               modify(val, s1, s2);
               System.out.println("returned from modify");
               System.out.println("val is " + val);
               System.out.println("s1 is " + s1);
               System.out.println("s2 is " + s2);
          }
          public static void modify(int a, StringBuilder r1, StringBuilder r2) {
               System.out.println("in modify ...");
               a = 0;
               r1 = null;
               r2.append(" taste good");
               // or add using string builder
              // StringBuilder sb1 = new StringBuilder(" additional string from stringbuilder ");
              // r2 += sb1;
               System.out.println("a is " + a);
               System.out.println("r1 is "  + r1);
               System.out.println("r2 is " + r2);
          }
}