package com.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class lottoTest {
	public static void main(String[] args) {
//		Document doc;
//		try {
//			doc = Jsoup.connect("https://m.dhlottery.co.kr/gameResult.do?method=byWin").get();
//			Elements lottoDiv = doc.select("div.bx_lotto_winnum");
//			Elements numSpan = lottoDiv.select("span.ball"); //여기까지 이미 접근을 해주니깐
//			for(int i=0;i<numSpan.size();i++) {
//				String num = numSpan.get(i).text(); // 여기서는 그냥 바로 get하면 됨
//				System.out.println(num);
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//5개가 출력 될때 (모두 같은 태그 사용떄문) first만 해서 출력 가능하다
//		Document doc;
//		try {
//			doc = Jsoup.connect("https://m.dhlottery.co.kr/common.do?method=main").get();
//			Element lottoDiv = doc.select("div.prizeresult").first();
//			Elements num = lottoDiv.select("div.num");
//			for(int i=0;i<num.size();i++) {
//				String winNum = num.get(i).text();
//				System.out.println(winNum);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Document doc;
//		try {
//			doc = Jsoup.connect("https://m.dhlottery.co.kr/common.do?method=main").get(); //문서 접근
//			Elements lottoTitle = doc.select("div.section_title");	//회차 번호있는 영역 접근(볼 수 있는 최대)
//			Elements roundE = lottoTitle.select("strong#lottoDrwNo"); // 회차 번호 따기
//			Elements lottoDiv = doc.select("div.prizeresult"); //모든 회차 번호들 있는 영역접근 
//			Elements num = lottoDiv.select("div.num"); //번호 따기
//			
//			Element lottoDiv1 = doc.select("div.prizeresult").first(); //갯수 제어 위해서 1개만땀
//			Elements num1 = lottoDiv1.select("div.num"); //1개의 로또번호 7개 
//			
//			for(int i=0;i<roundE.size();i++) {
//				String round = roundE.get(i).text();
//				System.out.print(round + "\t");
//				for(int j=0;j<num1.size();j++) {
//					String winNum = num.get(j).text();
//					System.out.print(winNum + "\t");
//				}
//				System.out.println("\n");
//			}
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//과제부분
//		Document doc;
//		try {
//			doc = Jsoup.connect("https://www.daum.net/").get();
//			Elements container1 = doc.select("div.realtime_part");
//			Elements values = container1.select("li");
//			for(int i=0;i<values.size();i++) {
//				String value = values.get(i).select("span span.ir_wa").first().text();
//				String name =  values.get(i).select("span.txt_issue").first().text();
//				System.out.println(value + name);
//
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//영화명과 평점(전체)
//		Document doc;
//		try {
//			doc = Jsoup.connect("https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=%EC%98%81%ED%99%94").get(); //문서 연결
//			Elements div1 = doc.select("ol.type_plural div.info_tit"); //문서내 ol 코드 찾아서 그 바로 하위에 div까지 선택 해서  제목 뽑고
//			Elements div2 = doc.select("dd.score em.rate"); // 문서내 dd.score 하위 em.rate 접근해서 별점 뽑고
//			for(int i=0;i<div1.size();i++) { // div 갯수 만큼 돌려서 글자 따내기
//				String title = div1.get(i).text();
//				String rate = div2.get(i).text();
//				System.out.println(title + " //평점: "+ rate);
//			}	
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//영화명과 평점(5개만)
		Document doc;

			try {
				doc = Jsoup.connect("https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=%EC%98%81%ED%99%94").get();
				Elements div1 = doc.select("ol.type_plural li").not("li.hide");
				Elements div2 = div1.select("div.info_tit");
				Elements div3 = doc.select("dd.score em.rate"); // 문서내 dd.score 하위 em.rate 접근해서 별점 뽑고
				for(int i=0;i<div2.size();i++) { // div 갯수 만큼 돌려서 글자 따내기
					String title = div2.get(i).text();
					String rate = div3.get(i).text();
					System.out.println(title +" //평점 "+ rate);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //문서 연결
			

		
	}

}
