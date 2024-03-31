package com.example.travel_gacha_java.Repository;

import com.example.travel_gacha_java.Model.Gacha;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GachaRepository extends JpaRepository<Gacha, Integer> {
  @Query("SELECT g FROM Gacha g WHERE g.used = 0")
  List<Gacha> findAllUnusedActiveGachas();

}
