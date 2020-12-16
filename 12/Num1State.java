public class Num1State implements State{
    LicenseNumber ln;
    public Num1State(LicenseNumber licenseNumber) {
        this.ln = licenseNumber;
    }
    @Override
    public boolean inputDigit(char ch) {
        if (ln.countDigitInNum1 >= 3) { // 이미 입력된 숫자 개수가 3개 이상이면 오류
            ln.setState(ln.errorState);
            return false;
        }
        else {
            ln.licenseNumber += ch;
            ln.countDigitInNum1++;
        }
        return true;
    }

    @Override
    public boolean inputHangul(char ch) {
        if (ln.countDigitInNum1 >= 2) { // 기존 입력 숫자가 2개 이상일 때
            ln.licenseNumber += ch;
            ln.setState(ln.hangulInputState);
        }
        else {
            ln.setState(ln.errorState);
            return false;
        }
        return true;
    }

    @Override
    public boolean inputSpace(char ch) {
        ln.setState(ln.errorState);
        return false;
    }
}
