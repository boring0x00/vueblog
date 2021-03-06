package com.markerhub.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author climbteam
 * @since 2020-09-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_comment")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 评论 id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论用户 id
     */
    private Long userId;

    /**
     * 评论用户名
     */
    private String username;

    /**
     * 文章  id
     */
    private Long blogId;

    /**
     * 评论 内容
     */
    private String detail;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime created;

    /**
     * 被回复评论用户 id
     */
    private Long toUserId;

    /**
     * 被回复评论用户名
     */
    private String toUsername;
}
