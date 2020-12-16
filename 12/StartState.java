public class StartState implements State{

    LicenseNumber ln;
    public StartState(LicenseNumber licenseNumber) {
        this.ln = licenseNumber;
    }
    @Override
    public boolean inputDigit(char ch) {
        ln.licenseNumber += ch;
        ln.countDigitInNum1++; // 글자 개수를 한 개 늘림
        ln.setState(ln.firstDigitInputState);
        return true;
    }

    @Override
    public boolean inputHangul(char ch) {
        ln.setState(ln.errorState);
        return false;
    }

    @Override
    public boolean inputSpace(char ch) {
        ln.setState(ln.errorState);
        return false;
    }
}
