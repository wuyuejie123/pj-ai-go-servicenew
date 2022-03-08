package com.ai.pjgo.common.utils;

import cn.hutool.core.util.IdUtil;

/**
 * @author hexinxiang
 * <br/>Date: 2022/3/2
 * <br/>Time: 12:59
 */

public class UidTool {

    /**
     * 获得32个长度的十六进制的UUID
     *
     * @return UUID
     */
    public static String get32UUID() {

        String s = IdUtil.simpleUUID();

        return s;


    }

}
