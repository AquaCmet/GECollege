package kensyu_20230615;

// 抽象クラス　共通処理
abstract class StringLister {
    protected abstract String formatHeader();
    protected abstract String formatItem(String item);
    protected abstract String formatFooter();
    public final String display(String[] items) {
        StringBuilder result = new StringBuilder(this.formatHeader());
        for (String item : items) {
            result.append(this.formatItem(item));
        }
        result.append(this.formatFooter());
        return result.toString();
    }
}

// 具象クラス　子クラスは個別の処理
class PlainTextStringLister extends StringLister {
    protected String formatHeader() {
        return "";
    }
    protected String formatItem(String item) {
        return " - " + item + "\r\n";
    }
    protected String formatFooter() {
        return "";
    }
}

class HtmlStringLister extends StringLister {
    protected String formatHeader() {
        return "<ul>\r\n";
    }
    protected String formatItem(String item) {
        return "  <li>" + item + "</li>\r\n";
    }
    protected String formatFooter() {
        return "<ul>\r\n";
    }
}
class CsvStringLister extends StringLister {
    protected String formatHeader() {
        return "";
    }
    protected String formatItem(String item) {
        return "" + item + ",";
    }
    protected String formatFooter() {
        return "";
    }
}
public class TemplateMethodTest {
    public static void main(String[] argv) {
        String[] items = {"First", "Second", "Third"};
        StringLister l1 = new PlainTextStringLister();
        StringLister l2 = new HtmlStringLister();
        StringLister l3 = new CsvStringLister();
        System.out.println(l1.display(items));
        System.out.println(l2.display(items));
        System.out.println(l3.display(items));
    }
}
// 共通処理はスーパークラスに
// 具象クラスは、個別の処理を行う
// 実装例として、検索処理などちょいちょい使う
// そんなもんぐらい
// コンテキスト（ログイン情報）を渡して、検索処理を
// 後は具象クラスで、使える権限の画面などを引っ張ってくるなどをする
// 触れる機会は多いデザインパターン