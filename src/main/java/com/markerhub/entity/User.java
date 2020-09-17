package com.markerhub.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author climbteam
 * @since 2020-05-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_user")
public class User implements Serializable {

    //序列化id
    private static final long serialVersionUID = 1L;

    //用户id
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //用户昵称
    @NotBlank(message = "昵称不能为空")
    private String username;

    //用户头像
    private String avatar;

    //用户邮箱
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

    //用户密码
    private String password;

    //用户状态
    private Integer status;

    //用户创建时间
    private LocalDateTime created;

    //用户最后一次登陆时间
    private LocalDateTime lastLogin;


}
