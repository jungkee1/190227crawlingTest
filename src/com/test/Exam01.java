package com.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Exam01 {
	
	public static void main(String[] args) {
		Document doc; //jsoup
		try {
			doc = Jsoup.connect("http://m.exchange.daum.net/mobile/exchange/exchangeMain.daum").get(); //connect��� �Լ��� �̿��� �ش� �ּҷ� ���Ӿ�~!
			Elements asiamain = doc.select("div#exchangeDiv"); //�ش� ��ũ���� �ܾ�� ������ ���̵� ã�ƿ� dive ������ ���̵� exchangeDiv��
			Elements dt = asiamain.select("dt");
			Elements dd = asiamain.select("dd");
			
			for(int i=0;i<dt.size();i++) {
				String title = dt.get(i).text();
				String price = dd.get(i).select("span.price").text(); //span �ؿ� class�̸� price
				String point = dd.get(i).select("span.point").text();
				String rate = dd.get(i).select("span.rate").text();
				System.out.println(title +"\t" + price); // \t = tab ��ŭ ����
				System.out.println(point +"\t" + rate);
			}
			
			System.out.println("-----------------------");
			
			
			
//			Elements asiaBody = doc.select("div#asiaBody");
//			Elements tr = asiaBody.select("tr");
//			for(int i=0;i<tr.size();i++) {
//				String name = tr.get(i).select("td.name").text();
//				String idx = tr.get(i).select("td.idx").text();
//				String idx_fluc = tr.get(i).select("td.idx_fluc cDn").text();
//				String rate_fluc = tr.get(i).select("td.rate_fluc cDn").text();
//				System.out.println(name + "\t" + idx + "\t" + idx_fluc + "\t" + rate_fluc );
//
//			}
			
			Elements asiaBody = doc.select("div#asiaBody");
			Elements tr = asiaBody.select("tr");
			for(int i=0;i<tr.size();i++) {
				System.out.println(tr.get(i).select("tr").text());
			}
			
			System.out.println("----------�ߵ�����----------");
			
			Elements jungDong = doc.select("div#mideastBody");
			Elements jungDongTr = jungDong.select("tr.link");
			for(int i=0;i<jungDongTr.size();i++) {
				String name = jungDongTr.get(i).select("td.name").text();
				String idx = jungDongTr.get(i).select("td.idx").text();
				System.out.println(name + "\t" + idx);
			}
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
