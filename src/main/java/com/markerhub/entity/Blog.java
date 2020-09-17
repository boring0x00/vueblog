package com.markerhub.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

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
@TableName("m_blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    //数据库m_blog表主键id自增
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    //博客id
    private Long userId;

    //博客标题
    @NotBlank(message = "标题不能为空")
    private String title;

    //博客摘要
    @NotBlank(message = "摘要不能为空")
    private String description;

    //博客内容
    @NotBlank(message = "内容不能为空")
    private String content;

    //博客创建时间
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime created;

    //博客状态
    private Integer status;

    //博客类型
    private String type;

    //博客评论数量
    private Integer commentsCount;

    //博客查看次数
    private Integer viewsCount;

}
