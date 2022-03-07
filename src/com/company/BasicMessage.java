package com.company;

import java.awt.*;
import javax.swing.*;


public class BasicMessage extends Frame {
    int IDSource;
    int IDTarget;
    int SYNC; //מסמלת את תחילת ההודעה החדשה

    public BasicMessage(int IDSource, int IDTarget, int SYNC) {
        this.IDSource = IDSource;
        this.IDTarget = IDTarget;
        this.SYNC = SYNC;
    }
    public void setBasicMessage(int s, int t)
    {
        IDSource = s ;
        IDTarget = t ;
    }

    public BasicMessage()
    {
        setSize(400,400);
        setLayout(new FlowLayout());
        Button b1 = new Button("Enter");
        add (b1);
        setVisible(true);
        //JTextField ();
    }

    private void JTextField(String no) {

    }
}
