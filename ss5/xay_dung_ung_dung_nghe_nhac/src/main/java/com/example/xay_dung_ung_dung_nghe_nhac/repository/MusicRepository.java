package com.example.xay_dung_ung_dung_nghe_nhac.repository;

import com.example.xay_dung_ung_dung_nghe_nhac.model.Music;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Music> FinAll() {
        String sql = "SELECT m FROM Music m";
        TypedQuery<Music> query = entityManager.createQuery(sql, Music.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public void addMusic(Music music) {
        entityManager.persist(music);
    }

    @Override
    public void removeMusic(Music music) {
        entityManager.remove(music);
    }

    @Override
    public void updateMusic(Music music) {

    }
}
