package com.wxy.pcblog.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wuxueyong
 * @since 2021-08-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 唯一id
     */
    private Long id;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private Long phone;

    /**
     * 微信openid
     */
    private String wechatOpenId;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 删除标识
     */
    private Integer deleteSign;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户账号
     */
    private String userCode;


}
