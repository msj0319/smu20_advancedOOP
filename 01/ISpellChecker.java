public interface ISpellChecker {
    void check();
}
class EngSpellChecker implements ISpellChecker {
    @Override
    public void check() {
        System.out.println("Checking English Spelling...");
    }
}
