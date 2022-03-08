package com.ai.pjgo.common.utils;

import cn.hutool.crypto.digest.MD5;

/**
 * @author hexinxiang
 * <br/>Date: 2022/3/2
 * <br/>Time: 7:55
 */

public class PasswordUtils {

    private final static String saltValue="(*&*^%&^&%/com.yyesw.student.dao.student.tools.utils";

    private final static String edCode="utf8";
    /**
     * 密码加密保护类
     * @param pass
     * @return
     */
    public static String passToMd5Str(String pass){

        return  MD5.create().digestHex(pass+saltValue,edCode);
    }

    public static void main(String[] args) {
        System.out.println(passToMd5Str("1234"));
    }
}
