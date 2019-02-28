package com.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MarketCapitalizationRank {
	
	
	
	
	public static void main(String[] args) {
		Document doc;
		try {
			doc = Jsoup.connect("http://www.mrktcap.com/").get(); //���� ����
			Elements mainDiv = doc.select("table.table"); //���̺�
			Elements countries= mainDiv.select("td"); //�� ���̺� tr ����
			System.out.println("�� ���� ��� �ð��Ѿ� ����");
			for(int i=5;i<countries.size();i++) { // 0��� 1�� �ص� ������ �ڵ��ΰ���?
				String country = countries.get(i).select("span").text();
				System.out.println(country);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
