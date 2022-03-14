package com.company;

public class Extras extends BasicMessage{
    String TextMessage;


    public Extras(int IDSource, int IDTarget, int SYNC, String textMessage) {
        super(IDSource, IDTarget, SYNC);
        TextMessage = textMessage;
    }


    public String getTextMessage() {
        return TextMessage;
    }

    public void setTextMessage(String textMessage) {
        TextMessage = textMessage;
    }
}
