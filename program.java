import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;
import java.text.SimpleDateFormat;
// package sample.pojo.data;
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
        Date d = new Date();
        SimpleDateFormat simpDate;
        simpDate = new SimpleDateFormat("kk:mm:ss");
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
            case "whats the date and time":
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
                int volume3 = in.nextInt();
                System.out.println("Sure decreasing the volume to "+volume3);
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
            case "whats the time":
                System.out.println(simpDate.format(d));
                break;
            case "pay my electricity bill":
                System.out.println("Sure paying your current bill");
                break;
            case "find my phone":
                System.out.println("Sure finding your phone");
                break;
            /*case "hows the weather":
                System.out.println("");
                break;
             */ // not yet done
            case "how are you":
                System.out.println("Hi "+name+", I am fine. How can I help you?");
                String helpyou;
                helpyou = in.nextLine();
                if (helpyou.equals("turn on the light")){
                System.out.println("Sure turning on the light");
            }
            if (helpyou.equals("whats the date and time")){
                System.out.println("The date and time is " + dtf.format(now));
            }
            if (helpyou.equals("good morning")){
                System.out.println("Good morning " + name);
                System.out.println("Turning on the light");
            }
            if (helpyou.equals("good night")){
                System.out.println("What time do you want me to keep the alarm");
                String time1;
                time1 = in.nextLine();
                System.out.println("Okay keeping the alarm at " + time1);
                System.out.println("Turning off the light");
                System.out.println("Sleep tight " + name);
            }
            if (helpyou.equals("play")){
                System.out.println("playing");
            }
            if (helpyou.equals("hi")){
                System.out.println("Hi how can i help you " + name);
                System.out.println("you can say 'help' to get some help from me");
            }
            if (helpyou.equals("help")){
                System.out.println("Say 'turn on the light'");
                System.out.println("You can also ask me the date and time");
            }
            if (helpyou.equals("nothing")) {
                System.out.println("Okay");
            }
            if (helpyou.equals("increase the volume")) {
                System.out.println("Increasing the volume");
            }
            if (helpyou.equals("decrease the volume")) {
                System.out.println("Decreasing the volume");
            }
            if (helpyou.equals("decrease the volume to")) {
                System.out.println("To?");
                int volume1 = in.nextInt();
                System.out.println("Sure decreasing the volume to " + volume1);
            }
            if (helpyou.equals("increase the volume to")) {
                System.out.println("To?");
                int volume2 = in.nextInt();
                System.out.println("Increasing the volume to " + volume2);
            }
            /*if (helpyou.equals("Tell me the news")){
                System.out.println("The news for today is");
                }*/ // Under work
            if (helpyou.equals("turn off the light")) {
                System.out.println("Turning off the light");
            }
            if (helpyou.equals("change the colour of the light to")) {
                System.out.println("Which colour do you want me to change the colour of the light to?");
                String colour1;
                colour1 = in.nextLine();
                System.out.println("Changing the light to " + colour1);
            }
            if (helpyou.equals("cast to")) {
                System.out.println("Which device do you want me to cast it to?");
                String device1;
                device1 = in.nextLine();
                System.out.println("Sure casting to " + device1);
            }
            if (helpyou.equals("im out")) {
                System.out.println("Turning off the light");
                System.out.println("You can say 'im back' when you return back home");
            }
                if (helpyou.equals("im back")) {
                    System.out.println("Nice to meet you " + name);
                    System.out.println("Turning on the light");
                }
                if (helpyou.equals("emergency")) {
                    System.out.println("What's your emergency? (police, fire station, ambulance)");
                    String service1;
                    service1 = in.nextLine();
                    System.out.println("Sure calling the " + service1);
                }
                if (helpyou.equals("add to the basket")) {
                    System.out.println("What do you want me to add to the basket " + name);
                    String groceries1;
                    groceries1 = in.nextLine();
                    System.out.println("Adding " + groceries1 + " to your basket");
                }
                if (helpyou.equals("calculate")) {
                    System.out.println("Do you want to add(1), subtract(2), multiply(3) or divide(4)");
                    System.out.println("Enter any two values to");
                    int choose1 = in.nextInt();
                    float a1 = in.nextInt();
                    float b1 = in.nextInt();
                    if (choose1 == 1)
                        System.out.println(a1 + b1);
                    if (choose1 == 2)
                        System.out.println(a1 - b1);
                    if (choose1 == 3)
                        System.out.println(a1 * b1);
                    if (choose1 == 4)
                        System.out.println(a1 / b1);
                }
                if (helpyou.equals("whats the time")) {
                    System.out.println(simpDate.format(d));
                }
                if (helpyou.equals("pay my electricity bill")) {
                    System.out.println("Sure paying your current bill");
                }
                if (helpyou.equals("find my phone")) {
                    System.out.println("Sure finding your phone");
                }
            /*if (helpyou.equals("hows the weather")){
                System.out.println("");
                }
             */ // not yet done
                if (helpyou.equals("whats your name")){
                    System.out.println("I am google your personal assistant");
                }
                if (helpyou.equals("whats my name")){
                    System.out.println("Your name is "+name);
                }
            if (helpyou.equals("make me a coffee")) {
                System.out.println("Sure making you a coffee");
            }
                break;
            case "whats your name":
                System.out.println("I am google your personal assistant");
                break;
            case "whats my name":
                System.out.println("Your name is "+name);
                break;
            case "make me a coffee":
                System.out.println("Sure making you a coffee");
                break;
            default:
                System.out.println("How can I help you");
        }
    }
}
// Program not yet done
