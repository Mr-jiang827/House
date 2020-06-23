package com.housedemo.houseapi.three;

import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import com.housedemo.houseapi.except.SmsException;

public class SmsCore {

    private static String key="LTAI4G8iFHWRrH2hHJB7P28Z";
    private static String keysecret="Hr2ketL6ovOghiEPOBDTd3vbbwi3dE";
    //发送短信验证码
    public static boolean sendRCode(String phone,int code) throws SmsException {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou",
                key, keysecret);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setSysMethod(MethodType.POST);
        request.setSysDomain("dysmsapi.aliyuncs.com");
        request.setSysVersion("2017-05-25");
        request.setSysAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "veryGood");
        request.putQueryParameter("TemplateCode", "SMS_193515815");
        request.putQueryParameter("TemplateParam", "{\"code\":"+code+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw  new SmsException("阿里云短信异常");
        }
    }

}
