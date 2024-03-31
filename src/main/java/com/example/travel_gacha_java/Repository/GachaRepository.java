package com.example.travel_gacha_java.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.travel_gacha_java.Model.Gacha;

@Repository
public interface GachaRepository extends JpaRepository<Gacha, Integer> {

}
