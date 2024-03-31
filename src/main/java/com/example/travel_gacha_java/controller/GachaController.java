package com.example.travel_gacha_java.controller;

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
	@GetMapping("/destination")
	public String getDestination() {
		String destination_name = gachaService.getDestination();

		// 未使用レコードがない場合、エラーページへ遷移
		if (destination_name == "") {
			return "error";
		}
		return "destination";
	}
}
