package com.company;
import java.util.*;

public class Dialogs {

    public static Scanner scanner = new Scanner(System.in);

    public static String prompt(String question){
        System.out.println(question);
        return scanner.nextLine();
    }

    public static int promptInt(String question, int min, int max){
        var answer = min - 1;
        while(answer < min || answer > max){
            try {
                answer = Integer.parseInt(prompt(question));
            }
            catch(Exception ignore){}
        }
        return answer;
    }

    public static String promptChoice(String question, String ...choices){
        question += " (" + String.join(", ", choices) + ")";
        var choicesList = new ArrayList<String>(Arrays.asList(choices));
        var answer = "";
        while(!choicesList.contains(answer)){
            answer = prompt(question);
        }
        return answer;
    }



}
