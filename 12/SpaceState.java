public class SpaceState implements State{
    LicenseNumber ln;
    public SpaceState(LicenseNumber licenseNumber) {
        this.ln = licenseNumber;
    }
    @Override
    public boolean inputDigit(char ch) {
        ln.licenseNumber += ch;
        ln.countDigitInNum2++;
        ln.setState(ln.secondInputstate);
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
