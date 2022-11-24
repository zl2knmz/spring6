package com.liang.spring6.client;

import com.liang.spring6.web.UserAction;

/**
 * @author zl
 * @date 2022/11/24 20:48
 */
public class Test001 {
    public static void main(String[] args) {
        UserAction userAction = new UserAction();
        userAction.deleteUserRequest();
    }
}
