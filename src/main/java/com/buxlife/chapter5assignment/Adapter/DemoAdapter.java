package com.buxlife.chapter5assignment.Adapter;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoAdapter {

    public static void main(String[] args)
    {
        //Example of Class Adapter, implements inheritance
        System.out.println("Class Adapter Test");
        MessageInfo classMessageInfo = new MessageClassReceiver();
        classMessageInfo.setMessage(" Hello Stranger");
        classMessageInfo.setSender(" Pocahaunted");
        displayMessage(classMessageInfo);


        //Example of Object Adapter, implements composition
        System.out.println("\nObject Adapter Test");
        MessageInfo objectMessageInfo = new MessageObjectReceiver();
        objectMessageInfo.setMessage("Ah we meet again");
        objectMessageInfo.setSender("John Smet");
        displayMessage(objectMessageInfo);
    }

    public static void displayMessage(MessageInfo info){

        System.out.println("Message: " + info.getMessage());
        System.out.println("Sender: " + info.getSender());

    }
}
