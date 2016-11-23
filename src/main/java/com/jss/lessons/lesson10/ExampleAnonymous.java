package com.jss.lessons.lesson10;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jack on 22.11.2016.
 */
public class ExampleAnonymous {

//    public static int incint(int i) {
//        return i++;
//    }

    public void method() {

        final int[] count = {2};


        JButton button = new JButton();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                count[0]++;
                System.out.println(count[0]);

            }
        });

    }
}
