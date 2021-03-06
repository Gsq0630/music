package org.lanqiao.service;

import org.lanqiao.entity.Album;
import org.lanqiao.mapper.AlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService{
    @Autowired
    AlbumMapper albumMapper;

    @Override
    public List<Album> selectBySingerId(Integer singerId) {
        return albumMapper.selectBySingerId(singerId);
    }

    public List<Album> selectAlbumByInput(String input) {
        return albumMapper.selectAlbumByInput(input);
    }

    @Override
    public List<Album> select15Album() {
        return albumMapper.select15Album();
    }
}