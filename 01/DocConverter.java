public abstract class DocConverter {
    private String ext;

    public DocConverter(String extension) {
        ext = extension;
    }

    public String getExtension() {
        return ext;
    }

    public abstract void save(String fileName);
}

class DocxDocConverter extends DocConverter {
    //부모 클래스의 생성자를 호출 해서 자신이 변환 하는 파일 포맷의 확장자 등록
    public DocxDocConverter() {
        super("docx");
    }
    @Override
    public void save(String fileName) {
        System.out.println(fileName + "." + getExtension() + "로 변환해서 저장합니다.");
    }
}
class PdfDocConverter extends DocConverter {
    public PdfDocConverter() {
        super("pdf");
    }
    @Override
    public void save(String fileName) {
        System.out.println(fileName + "." + getExtension() + "로 변환해서 저장합니다.");
    }

}
class OdfDocConverter extends DocConverter {
    public OdfDocConverter() {
        super("odf");
    }
    @Override
    public void save(String fileName) {
        System.out.println(fileName + "." + getExtension() + "로 변환해서 저장합니다.");
    }

}

