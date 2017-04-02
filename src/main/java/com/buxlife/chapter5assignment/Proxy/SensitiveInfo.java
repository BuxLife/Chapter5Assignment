package com.buxlife.chapter5assignment.Proxy;

/**
 * Created by Bux_Life on 2017/04/02.
 */
public class SensitiveInfo extends Info{

    public SensitiveInfo(){
        try{
            Thread.sleep(4000);     //wait 4 seconds.
        }catch (InterruptedException exc)
        {
            exc.printStackTrace();
        }
    }
}
