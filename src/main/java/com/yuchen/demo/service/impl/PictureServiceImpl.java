package com.yuchen.demo.service.impl;

import com.yuchen.demo.mapper.PictureMapper;
import com.yuchen.demo.pojo.Picture;
import com.yuchen.demo.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: 清峰
 * @date: 2020/9/23 20:01
 * @code: 愿世间永无Bug!
 * @description:
 */
@Service
@Transactional
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureMapper pictureMapper;

    @Override
    public List<Picture> listPictures() {
       return pictureMapper.listPictures();
    }

    @Override
    public int savePicture(Picture picture) {
        return pictureMapper.savePicture(picture);
    }

    @Override
    public Picture getPictureById(Long id) {
        return pictureMapper.getPictureById(id);
    }

    @Override
    public int updatePicture(Picture picture) {
        return pictureMapper.updatePicture(picture);
    }

    @Override
    public void deletePicture(Long id) {
        pictureMapper.deletePicture(id);
    }
}
