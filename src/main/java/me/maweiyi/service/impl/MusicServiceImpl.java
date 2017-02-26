package me.maweiyi.service.impl;

import me.maweiyi.domain.Music;
import me.maweiyi.mapper.MusicMapper;
import me.maweiyi.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by MWY
 * Date: 2/26/17
 * Time: 20:27
 */

@Service
public class MusicServiceImpl implements MusicService {
    
    @Autowired
    MusicMapper musicMapper;
    
    @Override
    public Music getMusicById(Integer id) {
        return musicMapper.getMusicById(id);
    }
}
