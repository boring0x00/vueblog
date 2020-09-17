package com.markerhub.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.markerhub.common.lang.Result;
import com.markerhub.entity.Comment;
import com.markerhub.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author climbteam
 * @since 2020-09-16
 */
@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    //发表评论 Post请求
    @PostMapping("/save")
    public Result leaveComment(@Validated @RequestBody Comment comment){
        comment.setCreated(LocalDateTime.now());
        commentService.save(comment);
        return Result.succ(null);
    }

    //评论获取请求 Get请求
    @GetMapping("/{bid}")
    public Result showComment(@PathVariable("bid")Long blogId){
        QueryWrapper<Comment> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("blog_id",blogId);
        List<Comment> commentList=commentService.list(queryWrapper);
        return Result.succ(commentList);
    }

    //评论删除  Delete请求(待完成)
    @DeleteMapping("/delete")
    public Result deleteComment(@RequestParam("cid") Long commentId,@RequestParam("uid")Long userId){
        return Result.succ(null);
    }

    //评论修改 Put请求(待完成)
    @PutMapping("/editor")
    public Result editorComment(@Validated @RequestBody Comment comment){

        return Result.succ(null);
    }
}
