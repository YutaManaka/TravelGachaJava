package com.example.travel_gacha_java.Controller;

import com.example.travel_gacha_java.Service.GachaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GachaController {
	@Autowired
	private GachaService gachaService;

	// form表示
	@GetMapping("/")
	public String index() {
		return "form";
	}

	// レコード作成
	@PostMapping("/create")
    public String createGacha(@RequestParam String name) {
        gachaService.saveGacha(name);
				return "form";
	}

	// 目的地を取得

	// 再度ガチャ

}
