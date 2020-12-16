public class Num2State implements State {
    LicenseNumber ln;
    public Num2State(LicenseNumber licenseNumber) {
        this.ln = licenseNumber;
    }
    @Override
    public boolean inputDigit(char ch) {
        ln.licenseNumber += ch;
        ln.countDigitInNum2++;
        if (ln.countDigitInNum2 == 4) {
            ln.setState(ln.endState);
        }
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
