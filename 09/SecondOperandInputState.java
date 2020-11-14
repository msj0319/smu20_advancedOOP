public class SecondOperandInputState implements State {

    CalcV1 calcV1;

    public SecondOperandInputState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void inputInteger(String ch) {
        //피연산자가 들어온 상태에서 새로 입력하면 그 값으로 초기화
        calcV1.operand2 = Integer.parseInt("" + ch);
    }

    @Override
    public void inputOperator(char ch) {}

    @Override
    public void inputEqual(char ch) {
        if (ch == '=') {
            //calcV1.printOutResult();
            switch (calcV1.operator) {
                case '+':
                    System.out.printf("%d + %d = %d\n", calcV1.operand1, calcV1.operand2, calcV1.operand1 + calcV1.operand2);
                    break;

                case '-':
                    System.out.printf("%d - %d = %d\n", calcV1.operand1, calcV1.operand2, calcV1.operand1 - calcV1.operand2);
                    break;

                case '*':
                    System.out.printf("%d * %d = %d\n", calcV1.operand1, calcV1.operand2, calcV1.operand1 * calcV1.operand2);
                    break;

                case '/':
                    System.out.printf("%d / %d = %d\n", calcV1.operand1, calcV1.operand2, calcV1.operand1 / calcV1.operand2);
                    break;
            }
            calcV1.setState(calcV1.getNoOperandInputState());
        }
    }
}
