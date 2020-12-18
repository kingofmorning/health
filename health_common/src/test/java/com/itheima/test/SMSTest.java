package com.itheima.test;

import com.aliyuncs.exceptions.ClientException;
import com.itheima.utils.SMSUtils;
import com.itheima.utils.ValidateCodeUtils;
import org.junit.Test;

public class SMSTest {


    @Test
    public void sendmessage(){

        try {
            SMSUtils.sendShortMessage("SMS_202547192","13255109681","1234");
        } catch (ClientException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        try {
            SMSUtils.sendShortMessage("SMS_202552075","13255109681","1234");
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getCode(){
        Integer integer = ValidateCodeUtils.generateValidateCode(4);
        System.out.println(integer);

        System.out.println("------------------------------------------------");
        String string = ValidateCodeUtils.generateValidateCode4String(8);

        System.out.println(string);
    }
}
