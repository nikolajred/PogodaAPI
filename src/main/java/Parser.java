import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    private static Document getPage() throws IOException {
        String url = "https://meteo.ua/150/harkov/";
        Document page = Jsoup.parse(new URL(url), 5000);
        return page;

    }

    public static void main(String[] args) throws IOException {
        String date = "";
        System.out.println(date + "  t°C      Ощущается как   Вероятн.осадков     Давление, мм рт.ст.     Влажность, %    Ветер, м/с");

        Document page = getPage();
        Element allWth = page.select("div[class=week_weather]").first();
        Elements names = allWth.select("a[class = wwt_cont]");
        System.out.println(names);
        //System.out.println(allWth);
    }

}
