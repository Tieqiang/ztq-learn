package com.ztq.webstart;

import javax.swing.*;
import java.awt.*;

/**
 * Created by heren on 2014/7/23.
 */
public class MyWebStart {

    public static void main(String args[]){
        JFrame jFrame = new JFrame("WebStart sample");
        JLabel jLabel = new JLabel("hello world ,hello webstart") ;
        JPanel panel = new JPanel();
        panel.add(jLabel) ;

        jFrame.add(panel);
        jFrame.setSize(300,400);
        jFrame.setLocation(300,200);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
