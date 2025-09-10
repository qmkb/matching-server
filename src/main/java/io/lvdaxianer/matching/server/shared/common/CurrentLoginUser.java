package io.lvdaxianer.matching.server.shared.common;

import io.lvdaxianer.matching.server.shared.model.LoginUser;

import java.util.Optional;

/**
 * 表示当前登录的用户
 * @author lvdaxianer
 */
public class CurrentLoginUser
{
    private final static ThreadLocal<LoginUser> CURRENT_LOGIN_USER = new InheritableThreadLocal<>();

    /**
     * 获取当前登录用户
     * @author lvdaxianer
     * @return 拿到的登录信息
     */
    public static LoginUser get() {
        return Optional.ofNullable(CURRENT_LOGIN_USER.get())
                .orElse(LoginUser.builder().username("admin").account("admin").isAdmin(true).build());
    }

    /**
     * 设置当前登录用户
     * @author lvdaxianer
     * @param loginUser 登录信息
     */
    public static void set(LoginUser loginUser) {
        CURRENT_LOGIN_USER.set(loginUser);
    }
}
