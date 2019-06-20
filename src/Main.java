import java.util.Scanner;

public class Main
{
    public static void main(String [] args)
    {
       Scanner keyboard = new Scanner(System.in);

        //option 1
        String history2="";
        String [] presidents= new String[]{"Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush",
                "Clinton", "Bush",
            "Obama"};

        for(int i = presidents.length-1; i >= 0; i--)
        {
            history2 = history2 + " " + presidents[i];
//            System.out.println(history2);

        }
        System.out.println("total list: ");
            System.out.println(history2);

        //option 2
        String history="";
        String userInput="";
        String[] president2 = new String[10];

        System.out.println("Type in the last 10 presidents: ");

        for(int i = president2.length-1; i >= 0; i--)
        {
            president2[i] = keyboard.next();
//            history= history + president2[i];
        }
        for (int i=0; i < president2.length; i++){
            history = history + " " + president2[i];
        }

        System.out.println(history);








    }
}
