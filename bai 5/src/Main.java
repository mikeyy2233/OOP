import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        String newName = "";

        if ( Character.isLetter(name.charAt(0)) ) {
            newName += Character.toUpperCase(name.charAt( 0));
        }

        for(int i=1;i<=name.length()-1;i++)
        {
            if (name.charAt(i-1) == ' ' && Character.isLetter(name.charAt(i)) ) {
                newName += Character.toUpperCase(name.charAt(i ));

            }
            else
                newName += name.charAt(i);
        }
        System.out.print(newName);
        scanner.close();
    }
}