package com.buxlife.chapter5assignment.Proxy;

import java.util.Date;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class Proxy {

    SensitiveInfo sensitiveInfo;

    public Proxy(){
        System.out.println("Creating proxy at: " + new Date());

    }

    public void displaySensitiveInformation(){
        if (sensitiveInfo == null){
            sensitiveInfo = new SensitiveInfo();
        }
        sensitiveInfo.getInformation();
    }
}
