package kensyu_20230427;
//package org.wikipedia.patterns.strategy;

//MainApp test application
class MainApp {
 public static void main(String[] args) {
	 Gathering gathering;

     // 異なるアルゴリズムに従う3つのコンテキスト。
     gathering = new Gathering(new MorningGthering());
     gathering.greeting();

     gathering.switchInstance(new NoonGathering());
     gathering.greeting();

     gathering.switchInstance(new EveningGathering());
     gathering.greeting();
 }
}

//具体的な戦略を実装するクラスは、このインターフェイスを実装する。
//コンテキストクラスは、具体的な戦略を呼び出すためにこのインターフェイスを使用する。
interface Greeting {
 void greeting();
}

//Strategy インターフェイスを用いたアルゴリズムの実装。
class MorningGthering implements Greeting {
 public void greeting() {
     System.out.println("朝礼");
 }
}

class NoonGathering implements Greeting  {
 public void greeting() {
     System.out.println("昼例");
 }
}

class EveningGathering implements Greeting {
 public void greeting() {
     System.out.println("夕礼");
 }
}

//ConcreteStrategy を指定して作成され、Strategy オブジェクトへの参照を保持する。
class Gathering {
	Greeting greeting;

 // Constructor
 public Gathering(Greeting greeting) {
     this.greeting = greeting;
 }

 public void switchInstance(Greeting greeting) {
     this.greeting = greeting;
 } 

 public void greeting() {
     this.greeting.greeting();
 }
}

// 業務的にStrategy使うには
// プレーンテキスト 1行読み込むメソッドは共通
// Uploadしたものから、読み込むパターンを変える
// Excelパタン、CSVパタン等