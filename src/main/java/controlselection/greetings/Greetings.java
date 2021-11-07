package controlselection.greetings;

import java.time.LocalDateTime;

public class Greetings {
    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        greetings.greetings(20, 20);

    }

    public void greetings(int hour, int minutes){
        if ((hour>=5) && ((hour<9) || ((hour==9) && (minutes==0)))) {
            System.out.println("Jó reggelt!");
        }
        else if ((((hour==9) && (minutes>0)) || (hour>9)) &&
        ((hour<18) || ((hour==18) && (minutes<=30)))) {
            System.out.println("Jó napot!");
        }
        else if ((((hour==18) && (minutes>30)) || (hour>18)) &&
        ((hour<20) || ((hour==20) && (minutes==0)))) {
            System.out.println("Jó estét!");
        }
        else  {
            System.out.println("Jó éjt!");
        }
    }

}
