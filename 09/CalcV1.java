import java.util.Scanner;

public class CalcV1 {

    //상태 레퍼런스
    State noOperandInputState;
    State firstOperandInputState;
    State operatorInputState;
    State secondOperandInputState;
    State state;

    Scanner scanner;
    String inputStr;

    int operand1; // 첫 번째 피 연산자값 저장
    int operand2; // 두 번째 피 연산자값 저장
    char operator; // 사칙 연산자 저장

    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        noOperandInputState = new NoOperandInputState(this);
        firstOperandInputState = new FirstOperandInputState(this);
        operatorInputState = new OperatorInputState(this);
        secondOperandInputState = new SecondOperandInputState(this);

        state = noOperandInputState; //상태 초기화
    }

    String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }

    //상태 가져오기
    public State getNoOperandInputState() {
        return noOperandInputState;
    }
    public State getFirstOperandInputState(){
        return firstOperandInputState;
    }
    public State getOperatorInputState() {
        return operatorInputState;
    }
    public State getSecondOperandInputState() {
        return secondOperandInputState;
    }

    //상태 세팅
    void setState(State state) {
        this.state = state;
    }

    void processNumber(String ch) {
        state.inputInteger(ch);
    }

    void processOperator(char ch){
        state.inputOperator(ch);
        state.inputEqual(ch);
    }

    /* 프로그램의 주 로직을 담당하는 함수
       사용자 입력을 기다렸다가 q 또는 Q가 입력되면 종료
       그렇지 않으면 정수가 입력되었는지 혹은 연산자가 입력되었는지에 따라 processNumber 또는 processOperator 함수를 호출
     */
    boolean run() {
        inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
         // q를 입력하면 프로그램 종료
        if (ch == 'q' || ch == 'Q') {
            return false;
        }
        /* 정수가 입력되었을 때 처리 */
        else if (ch >= '0' && ch <= '9') {
            processNumber(inputStr);
        }
        /* 사칙 연산자 혹은 = 연산자 처리 */
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') {
            processOperator(ch);
        }
        return true;
    }

}
