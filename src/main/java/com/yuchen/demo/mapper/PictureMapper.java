package com.yuchen.demo.mapper;

import com.yuchen.demo.pojo.Picture;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: 清峰
 * @date: 2020/9/23 20:01
 * @code: 愿世间永无Bug!
 * @description:
 */
@Repository
public interface PictureMapper {

    List<Picture> listPictures();

    int savePicture(Picture picture);

    Picture getPictureById(Long id);

    int updatePicture(Picture picture);

    void deletePicture(Long id);
}
