import java.util.Scanner;

public class LicenseNumber {

    State noDigitinputState; //아무것도 들어오지 않은 상태
    State firstDigitInputState; //숫자는 다 들어간 상태
    State hangulInputState; //한글까지 다 들어간 상태
    State spaceInputState;
    State secondInputstate;
    State errorState;
    State endState;
    State state;

    //enum State { START, NUM1, HANGUL, SPACE, NUM2, END, ERROR };

    String licenseNumber = ""; // empty string
    int countDigitInNum1 = 0;
    int countDigitInNum2 = 0;
    int errorPos = 0;

    public LicenseNumber() {
        noDigitinputState = new StartState(this);
        firstDigitInputState = new Num1State(this);
        hangulInputState = new HangulState(this);
        spaceInputState = new SpaceState(this);
        secondInputstate = new Num2State(this);
        errorState = new ErrorState(this);
        endState = new EndState(this);
    }

    void setState(State state){
        this.state = state;
    }

    public int getErrorPos() {
        return errorPos;
    }

    /* verify 함수의 로직 대부분은 수정하지 않아도 됨 */
    public boolean verify(String str) {
        boolean succeeded = true;
        initialize();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                succeeded = state.inputDigit(ch);
            }
            else if (ch == ' ') {
                succeeded = state.inputSpace(ch);
            }
            else if (ch >= '가' && ch <= '힣') { // 입력된 글자가 한글이면
                succeeded = state.inputHangul(ch);
            }
            else { // 다른 글자가 입력되면 오류
                this.setState(this.errorState);
                errorPos = i;
                return false;
            }
            if (!succeeded) {
                errorPos = i;
                return false;
            }
        }
        if (state != this.endState) {  // FSM이 제대로 끝나지 않고 중간에 멈춤
            errorPos = str.length();
            return false;
        }
        return true;
    }

    private void initialize() {
        licenseNumber = ""; // empty string
        countDigitInNum1 = 0;
        countDigitInNum2 = 0;
        state = noDigitinputState;
        errorPos = 0;
    }
}
