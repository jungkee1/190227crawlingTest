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
//			Elements numSpan = lottoDiv.select("span.ball"); //������� �̹� ������ ���ִϱ�
//			for(int i=0;i<numSpan.size();i++) {
//				String num = numSpan.get(i).text(); // ���⼭�� �׳� �ٷ� get�ϸ� ��
//				System.out.println(num);
//			}
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//5���� ��� �ɶ� (��� ���� �±� ��닚��) first�� �ؼ� ��� �����ϴ�
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
//			doc = Jsoup.connect("https://m.dhlottery.co.kr/common.do?method=main").get(); //���� ����
//			Elements lottoTitle = doc.select("div.section_title");	//ȸ�� ��ȣ�ִ� ���� ����(�� �� �ִ� �ִ�)
//			Elements roundE = lottoTitle.select("strong#lottoDrwNo"); // ȸ�� ��ȣ ����
//			Elements lottoDiv = doc.select("div.prizeresult"); //��� ȸ�� ��ȣ�� �ִ� �������� 
//			Elements num = lottoDiv.select("div.num"); //��ȣ ����
//			
//			Element lottoDiv1 = doc.select("div.prizeresult").first(); //���� ���� ���ؼ� 1������
//			Elements num1 = lottoDiv1.select("div.num"); //1���� �ζǹ�ȣ 7�� 
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
		
		//�����κ�
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
		
		//��ȭ��� ����(��ü)
//		Document doc;
//		try {
//			doc = Jsoup.connect("https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=%EC%98%81%ED%99%94").get(); //���� ����
//			Elements div1 = doc.select("ol.type_plural div.info_tit"); //������ ol �ڵ� ã�Ƽ� �� �ٷ� ������ div���� ���� �ؼ�  ���� �̰�
//			Elements div2 = doc.select("dd.score em.rate"); // ������ dd.score ���� em.rate �����ؼ� ���� �̰�
//			for(int i=0;i<div1.size();i++) { // div ���� ��ŭ ������ ���� ������
//				String title = div1.get(i).text();
//				String rate = div2.get(i).text();
//				System.out.println(title + " //����: "+ rate);
//			}	
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//��ȭ��� ����(5����)
		Document doc;

			try {
				doc = Jsoup.connect("https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=%EC%98%81%ED%99%94").get();
				Elements div1 = doc.select("ol.type_plural li").not("li.hide");
				Elements div2 = div1.select("div.info_tit");
				Elements div3 = doc.select("dd.score em.rate"); // ������ dd.score ���� em.rate �����ؼ� ���� �̰�
				for(int i=0;i<div2.size();i++) { // div ���� ��ŭ ������ ���� ������
					String title = div2.get(i).text();
					String rate = div3.get(i).text();
					System.out.println(title +" //���� "+ rate);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //���� ����
			

		
	}

}
