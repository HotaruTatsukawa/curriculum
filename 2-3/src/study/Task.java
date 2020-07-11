package study;

// ① TaskクラスにCalculatorクラスを継承させなさい。
public class Task extends Calculator {

    /**
     * タスクの実行
     */
    public void doTask() {
        
        // ② Calculator.javaのすべてのオーバーロードメソッド「plus」に適当な引数を与え、Wikiの画像のよう出力されるようコーディングしなさい。
        // 尚、「どのクラスから呼び出しているか」を明確にするため、plus()には呼び出し元のキーワードを付与すること。
        super.plus(3);
        super.plus(9,2);
        super.plus(1,0,9);
    }
    
}