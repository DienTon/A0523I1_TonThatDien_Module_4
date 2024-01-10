package com.example.xay_dung_ung_dung_nghe_nhac.repository;

import com.example.xay_dung_ung_dung_nghe_nhac.model.Music;

import java.util.List;

public interface IMusicRepository {
List<Music> FinAll();
void addMusic(Music music);
void removeMusic(Music music);
void updateMusic(Music music);
}
