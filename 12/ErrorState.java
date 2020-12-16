public class ErrorState implements State {
    LicenseNumber ln;
    public ErrorState(LicenseNumber licenseNumber) {
        this.ln = licenseNumber;
    }
    @Override
    public boolean inputDigit(char ch) {
        return false;
    }

    @Override
    public boolean inputHangul(char ch) {
        return false;
    }

    @Override
    public boolean inputSpace(char ch) {
        return false;
    }
}
