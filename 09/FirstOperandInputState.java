public class FirstOperandInputState implements State {

    CalcV1 calcV1;

    public FirstOperandInputState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void inputInteger(String ch) {
        //피연산자가 들어온 상태에서 새로 입력하면 그 값으로 초기화
        calcV1.operand1 = Integer.parseInt("" + ch);
    }

    @Override
    public void inputOperator(char ch) {
        //첫번째 연산자가 들어오면,
        calcV1.setState(calcV1.getOperatorInputState());
        calcV1.operator = ch;
    }

    @Override
    public void inputEqual(char ch) {}
}
