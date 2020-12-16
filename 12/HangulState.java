public class HangulState implements State {
    LicenseNumber ln;
    public HangulState(LicenseNumber licenseNumber) {
        this.ln = licenseNumber;

    }
    @Override
    public boolean inputDigit(char ch) {
        ln.setState(ln.errorState);
        return false;
    }

    @Override
    public boolean inputHangul(char ch) {
        ln.setState(ln.errorState);
        return false;
    }

    @Override
    public boolean inputSpace(char ch) {
        ln.licenseNumber += ch;
        ln.setState(ln.spaceInputState);
        return true;
    }
}
