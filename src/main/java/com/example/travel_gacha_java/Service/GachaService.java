package com.example.travel_gacha_java.Service;

import com.example.travel_gacha_java.Model.Gacha;
import com.example.travel_gacha_java.Repository.GachaRepository;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GachaService {
  @Autowired
  private GachaRepository gachaRepository;

  public Gacha saveGacha(String requestingName) {
    // 目的地を登録
    Gacha g = new Gacha();
    g.setName(requestingName);
    g.setUsed(0);
    return gachaRepository.save(g);
  }

  public String getDestination() {
    // 目的地名をランダムに取得
    List<Gacha> destinations = gachaRepository.findAllUnusedActiveGachas();
    // 候補がない場合は空文字を返す
    if (destinations.size() == 0) {
      return "";
    }
    Random random = new Random();
    int randomIndex = random.nextInt(destinations.size());
    Gacha result = destinations.get(randomIndex);

    // 表示する目的地をused=1に更新
    result.setUsed(1);
    gachaRepository.save(result);

    // 目的地名を返す
    return result.getName();
  }
}
