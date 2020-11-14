public class OperatorInputState implements State {

    CalcV1 calcV1;

    public OperatorInputState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void inputInteger(String ch) {
        calcV1.operand2 = Integer.parseInt("" + ch);
        calcV1.setState(calcV1.getSecondOperandInputState());
    }

    @Override
    public void inputOperator(char ch) {}

    @Override
    public void inputEqual(char ch) {}
}
