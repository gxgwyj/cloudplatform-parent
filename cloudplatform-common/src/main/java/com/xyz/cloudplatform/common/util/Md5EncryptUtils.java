package com.xyz.cloudplatform.common.util;

import java.security.MessageDigest;
/**
 * Created by Administrator on 2017/7/20.
 */
public class Md5EncryptUtils {

    //16进制字符
    private final static char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd','e', 'f'};
    /**
     * md5加密算法
     *
     * @param str
     * @return
     */
    public static String encryptMd5(String str){
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            digest.update(str.getBytes());
            byte[] bs = digest.digest();
            char[] array = encodeHex(bs);
            return new String(array);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    private static char[] encodeHex(byte[] bytes) {
        char chars[] = new char[32];
        for (int i = 0; i < chars.length; i = i + 2) {
            byte b = bytes[i / 2];
            chars[i] = HEX_CHARS[(b >>> 0x4) & 0xf];
            chars[i + 1] = HEX_CHARS[b & 0xf];
        }
        return chars;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(encryptMd5(str));
    }



}
