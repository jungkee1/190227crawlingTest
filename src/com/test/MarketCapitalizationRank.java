package com.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MarketCapitalizationRank {
	
	
	
	
	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("http://www.mrktcap.com/").get(); //문서 접근
			Elements mainDiv = doc.select("table.table"); //테이블
			Elements countries= mainDiv.select("td"); //각 테이블 tr 따기
			System.out.println("전 세계 기업 시가총액 순위");
			for(int i=5;i<countries.size();i++) { // 0대신 1로 해도 괜찮은 코드인가요?
				String country = countries.get(i).select("span").text();
				System.out.println(country);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
