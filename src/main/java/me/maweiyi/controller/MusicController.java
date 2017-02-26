package me.maweiyi.controller;

import me.maweiyi.domain.Music;
import me.maweiyi.service.impl.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by MWY
 * Date: 2/26/17
 * Time: 20:47
 */
@Controller
public class MusicController {
    
    @Autowired
    MusicServiceImpl musicService;
    
    @RequestMapping("/music")
    @ResponseBody
    public Music music() {
        Music music = musicService.getMusicById(1);
        return music;
        
    }
}
