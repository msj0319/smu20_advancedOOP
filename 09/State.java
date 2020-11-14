//Transaction에 대한 내용을 interface화
public interface State {
    public void inputInteger(String ch);
    public void inputOperator(char ch);
    public void inputEqual(char ch);
}
