package io.lvdaxianer.matching.server.shared.model;


import lombok.Builder;
import lombok.Data;

/**
 * 表示登录的用户
 * @author lvdaxianer
 */
@Builder
@Data
public class LoginUser
{
    private String username;
    private String account;
    private Boolean isAdmin;
}
