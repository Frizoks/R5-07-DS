public class Q5
{
    public static void main(String[] args)
  {
        if(args.length == 0)
        {
            System.out.println("Veuillez fournir un nombre en paramètre.");
            return;
        }
        
        try {
            int n = Integer.parseInt(args[0]);
            for (int i = n; i >= 1; i--)
            {
                for (int j = 1; j <= i; j++)
                {
                    System.out.print("x");
                }
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Le paramètre doit être un nombre entier.");
        }
    }
}
