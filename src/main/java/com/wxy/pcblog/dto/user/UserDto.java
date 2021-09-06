package com.wxy.pcblog.dto.user;

import com.sun.istack.internal.NotNull;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author: wuxueyong
 * @Description:
 * @date: 2021/9/6 13:12
 */
@Data
public class UserDto implements Serializable {
    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "密码")
    @NotNull
    private String password;

    @ApiModelProperty(value = "手机号")
    private Long phone;

    @ApiModelProperty(value = "微信openid")
    private String wechatOpenId;


    @ApiModelProperty(value = "性别")
    private Integer sex;

    @ApiModelProperty(value = "用户昵称")
    @NotNull
    private String nickname;

    @ApiModelProperty(value = "账号")
    @NotNull
    private String userCode;

}
