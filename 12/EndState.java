public class EndState implements State{
    LicenseNumber ln;
    public EndState(LicenseNumber licenseNumber) {
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
        ln.setState(ln.errorState);
        return false;
    }
}
