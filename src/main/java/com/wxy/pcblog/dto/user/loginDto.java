package com.wxy.pcblog.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: wuxueyong
 * @Description:
 * @date: 2021/9/3 11:08
 */
@Data
public class loginDto implements Serializable {
    @ApiModelProperty(value = "用户账号")
    private String userCode;

    @ApiModelProperty(value = "登录密码")
    private String password;
}
