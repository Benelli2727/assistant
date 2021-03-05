import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
// This is a assistant program

public class program {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy:HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String name;
        name = "Arjun";
        String input;
        input = in.nextLine();
        switch(input.toLowerCase()){
            case "hey google":
                System.out.println("Hi how can I help you");
                break;
            default:
                System.out.println("How can I help you");
        }
        String input1;
        input1 = in.nextLine();
        switch(input1.toLowerCase()) {
            case "turn on the light":
                System.out.println("Sure turning on the light");
                break;
            case "What's the date and time":
                System.out.println("The date and time is " + dtf.format(now));
                break;
            case "good morning":
                System.out.println("Good morning " + name);
                System.out.println("Turning on the light");
                break;
            case "good night":
                System.out.println("What time do you want me to keep the alarm");
                String time;
                time = in.nextLine();
                System.out.println("Okay keeping the alarm at " + time);
                System.out.println("Turning off the light");
                System.out.println("Sleep tight " + name);
                break;
            case "play":// Not yet done
                System.out.println("playing");
                break;
            case "hi":
                System.out.println("Hi how can i help you " + name);
                System.out.println("you can say 'help' to get some help from me");
                break;
            case "help":
                System.out.println("Say 'turn on the light'");
                System.out.println("You can also ask me the date and time");
                break;
            /*case "set timer":
                System.out.println("How much time do you want the timer to be? (in minutes)");
                int timer = in.nextInt();
                int sum = 0;
                sum = timer * 60;
                for (int i=0; i<=timer; i++){
                    System.out.println(i);
                }
                System.out.println("It's time");
                break;*/ // Under work
            case "increase the volume":
                System.out.println("Increasing the volume");
                break;
            case "decrease the volume":
                System.out.println("Decreasing the volume");
                break;
            case "decrease the volume to":
                System.out.println("To?");
                int volume1 = in.nextInt();
                System.out.println("Sure decreasing the volume to "+volume1);
                break;
            case "increase the volume to":
                System.out.println("To?");
                int volume = in.nextInt();
                System.out.println("Increasing the volume to "+volume);
                break;
            /*case "Tell me the news":
                System.out.println("The news for today is");
                break;*/ // Under work
            case "turn off the light":
                System.out.println("Turning off the light");
                break;
            case "change the colour of the light to":
                System.out.println("Which colour do you want me to change the colour of the light to?");
                String colour;
                colour = in.nextLine();
                System.out.println("Changing the light to "+colour);
                break;
            case "cast to":
                System.out.println("Which device do you want me to cast it to?");
                String device;
                device = in.nextLine();
                System.out.println("Sure casting to "+device);
                break;
            case "im out":
                System.out.println("Turning off the light");
                System.out.println("You can say 'im back' when you return back home");
                break;
            case "im back":
                System.out.println("Nice to meet you "+name);
                System.out.println("Turning on the light");
                break;
            case "emergency":
                System.out.println("What's your emergency? (police, fire station, ambulance)");
                String service;
                service = in.nextLine();
                System.out.println("Sure calling the "+service);
                break;
            case "add to the basket":
                System.out.println("What do you want me to add to the basket "+name);
                String groceries;
                groceries = in.nextLine();
                System.out.println("Adding "+groceries+" to your basket");
                break;
            case "calculate":
                System.out.println("Do you want to add(1), subtract(2), multiply(3) or divide(4)");
                System.out.println("Enter any two values to");
                int choose = in.nextInt();
                float a = in.nextInt();
                float b = in.nextInt();
                if (choose==1)
                    System.out.println(a+b);
                if (choose==2)
                    System.out.println(a-b);
                if (choose==3)
                    System.out.println(a*b);
                if (choose==4)
                    System.out.println(a/b);
                break;
            default:
                System.out.println("How can I help you");
        }
    }
}
// Program not yet done
class abc{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name;
        name = in.nextLine();
        switch(name.toLowerCase()){

        }
    }
}
