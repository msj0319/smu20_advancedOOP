import java.util.HashMap;
import java.util.Map;

public class WordProcessor {
    private ISpellChecker spellChecker;
    private final Map<String,DocConverter> docConverters = new HashMap<>();
    private final String fileName;

    //파일 이름(작업할 파일 이름)을 입력 받아 저장
    public WordProcessor(String fileName) {
        this.fileName = fileName;
    }
    //문서 변환 객체를 Map에 추가(키는 확장자, 값은 DocConverter)
    public void addDocConverter(DocConverter converter) {
        docConverters.put(converter.getExtension(),converter);
    }

    //특정 확장자 형태로 파일 변환 저장
    public void convertDocTo(String ext) {
        if(docConverters.containsKey(ext)) {
            DocConverter docValue = docConverters.get(ext);
            docValue.save(fileName);
        }
        else
            System.out.println(ext + "파일 형식을 지원하는 DocConverter가 없습니다");
    }

    //SpellChecker 객체 지정
    public void setSpellChecker(ISpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    //등록된 SpellChecker 객체의 check() 함수 호출
    public void checkSpelling() {
        spellChecker.check();
    }
}
