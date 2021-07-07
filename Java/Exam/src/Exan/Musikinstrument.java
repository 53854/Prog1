package Exan;

abstract class Musikinstrument
{
   public static String standardGeraeusch = "Dong";
   public Musikinstrument()
   {
      System.out.println("Musikinstrument:");
   }

   public void macheStandardGeraeusch()
   {
      System.out.println("Standard-Geraeusch: " + standardGeraeusch);
   }

   public void macheGeraeusch()
   {
      System.out.print("Geraeusch: ");
   }
}
