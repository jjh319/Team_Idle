package com.idle.shoppingmall.mapper;

import com.idle.shoppingmall.Entity.Comment_img;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CommentImgMapper {

    Long saveCommentImg(@Param("commentImg") Comment_img commentImg);
}