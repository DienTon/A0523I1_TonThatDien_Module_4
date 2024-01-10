package com.example.xay_dung_ung_dung_nghe_nhac.service;

import com.example.xay_dung_ung_dung_nghe_nhac.model.Music;
import com.example.xay_dung_ung_dung_nghe_nhac.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public List<Music> FinAll() {
        return musicRepository.FinAll();
    }

    @Override
    public void addMusic(Music music) {
        musicRepository.addMusic(music);
    }

    @Override
    public void removeMusic(Music music) {
        musicRepository.removeMusic(music);
    }

    @Override
    public void updateMusic(Music music) {

    }
}
