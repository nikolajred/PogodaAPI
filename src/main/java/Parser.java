import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Parser {
    private static Document getPage() throws IOException {
        String url = "http://www.pogoda.spb.ru/";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;

    }

    public static void main(String[] args) throws IOException {
        Document page = getPage();
        Element tableWth = page.select("table[class = wt]").first();
        System.out.println(tableWth);
        String date = "";
        System.out.println(date + " Погодные явления   t°C   Давл.   Отн. влажн.   Ветер");
    }
}
