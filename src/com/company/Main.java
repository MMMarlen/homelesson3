package com.company;

public class Main {

    public static void main(String[] args) {
	String[]names = new String[4];
	names[0] = "bek";
	names[1] = "aidar";
	names[2] = "ildar";
	names[3] = "пользователь";
        for (int i = 0; i < 4; i++) {

            switch (names[i]){
            case "bek":
                System.out.println(" доброе утра " + names[0]);
                break;
                case "aidar":
                    System.out.println("добрый день " + names[1]);
                    break;
                case "ildar":
                    System.out.println("добрый вечер " + names[2]);
                    break;
                case "пользователь":
                    System.out.println("salam " + names[3]);
                    break;
                default:
                    System.out.println("ups....");
break;
            }
        }

    }
}
