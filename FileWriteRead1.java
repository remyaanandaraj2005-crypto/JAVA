// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteRead1 {
   public FileWriteRead1() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);

      try {
         FileWriter var2 = new FileWriter("sample.txt");
         System.out.println("Enter text (type END to stop):");

         while(true) {
            String var3 = var1.nextLine();
            if (var3.equalsIgnoreCase("END")) {
               var2.close();
               BufferedReader var6 = new BufferedReader(new FileReader("sample.txt"));
               System.out.println("\nFile Contents:");

               String var4;
               while((var4 = var6.readLine()) != null) {
                  System.out.println(var4);
               }

               var6.close();
               break;
            }

            var2.write(var3 + "\n");
         }
      } catch (IOException var5) {
         System.out.println("Error: " + var5.getMessage());
      }

      var1.close();
   }
}
