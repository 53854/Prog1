package Exan;

class Trompete extends Musikinstrument
{
   public static String standardGeraeusch = "Quietsch";
   public Trompete()
   {
      System.out.println("Trompete");
   }

   public void macheGeraeusch()
   {
      super.macheGeraeusch();
      System.out.println("Troeoet ");
   }
}
