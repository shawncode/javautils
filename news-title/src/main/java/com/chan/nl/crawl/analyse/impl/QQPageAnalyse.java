package com.chan.nl.crawl.analyse.impl;

import com.chan.nl.crawl.analyse.PageAnalyse;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shisong on 17/5/15.
 */
public class QQPageAnalyse implements PageAnalyse {
    public List<String> analyse(String html) {
        List<String> ret = new ArrayList<String>();
        Document doc = Jsoup.parse(html);
        Elements tables = doc.getElementsByTag("table");
        for (Element element : tables) {
            try {
                Elements contents = element.getElementsByTag("td");
                for (Element td : contents) {
                    try {
                        Element news;
                        news = td.select("a.lcu333").first();
                        String url = news.attr("href");
                        String title = news.text();
                        ret.add(title);
                    } catch (Exception e) {
                        continue;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }
        return ret;
    }
}
