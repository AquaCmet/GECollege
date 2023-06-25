package kensyu_20230525;
// Stateパターン
// DBの値によって次の処理をするようなイメージ
// A処理して→A処理が条件によって終了したら→B処理するなど
// しっかり切り替えるイメージ・切り替えかたは自由



interface State {
	void oneDayAction(StateContext stateContext);
}

// 平日
class Weekday implements State {
	private int count = 0;
	String name = "";
	public void oneDayAction(StateContext stateContext) {
		switch (count) {
		case 0 : 
			name = "月曜日";
			break;
		case 1 : 
			name = "火曜日";
			break;	
		case 2 : 
			name = "水曜日";
			break;	
		case 3 : 
			name = "木曜日";
			break;	
		case 4 : 
			name = "金曜日";
			break;
		default:
			name = "";
			break;
		}
		System.out.println(name+"：仕事");

		// コンテキストをStateBに遷移する
		if(++count >= 5) {
			stateContext.setState(new Holiday());
		}
	}
}

// 休日
class Holiday implements State {
	private int count = 0;
	public void oneDayAction(StateContext stateContext){ 
		System.out.println("休み");

		// StateBのwriteName()が2度呼び出された後にコンテキストをStateAに遷移する
		if (++count > 1) { 
			stateContext.setState(new Weekday()); 
		}
	}
}

class StateContext {
	private State myState;
	public StateContext() {
		// 平日
		setState(new Weekday());
	}

	// 切り替え
	public void setState(State newState) {
		this.myState = newState;
	}

	// 
	public void oneDayAction() {
		this.myState.oneDayAction(this);
	}
}
class TestClientState {
	public static void main(String[] args) {
		StateContext sc = new StateContext();
		sc.oneDayAction();
		sc.oneDayAction();
		sc.oneDayAction();
		sc.oneDayAction();
		sc.oneDayAction();
		sc.oneDayAction();
		sc.oneDayAction();
		sc.oneDayAction();
		sc.oneDayAction();
	}
}