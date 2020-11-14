public class NoOperandInputState implements State{

    CalcV1 calcV1;

    public NoOperandInputState(CalcV1 calcV1){
        this.calcV1 = calcV1;
    }

    @Override
    public void inputInteger(String ch) {
        calcV1.operand1 = Integer.parseInt("" + ch);
        calcV1.setState(calcV1.getFirstOperandInputState());
    }

    @Override
    public void inputOperator(char ch) {}

    @Override
    public void inputEqual(char ch) {}
}
