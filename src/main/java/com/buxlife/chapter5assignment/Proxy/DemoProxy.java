package com.buxlife.chapter5assignment.Proxy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class DemoProxy {

    public static void main(String[] args){
        Message message = new MessageProxy("Secret");
        message.showMessage();
        message.showMessage();

    }
}
