package com.example.travel_gacha_java.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.travel_gacha_java.Model.Gacha;
import com.example.travel_gacha_java.Repository.GachaRepository;

import java.util.List;

import javax.persistence.EntityManager;

@Service
public class GachaService {
  @Autowired
  private GachaRepository gachaRepository;
  private EntityManager em;

  public Gacha saveGacha(String requestingName) {
    Gacha g = new Gacha();
    g.setName(requestingName);
    g.setUsed(0);
    return gachaRepository.save(g);
  }

  public String getDestination() {
    List<Gacha> results = this.em
    .createQuery("from Gacha where used = :used", Gacha.class)
    .setParameter("used", 0)
    .getResultList();

    return "";
  }
}
