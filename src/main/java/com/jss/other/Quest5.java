package com.jss.other;

/**
 * Created by Jack on 03.11.2016.
 */
public class Quest5 {
    {
        System.out.print("1");
    }

    static {
        System.out.print("2"); // будет выведено
    }

    Quest5() {
        System.out.print("3");
    }

    public static void main(String[] args) {
        System.out.print("4"); // будетвыведено
    }

    //решение отает номер 4) 24;

}

