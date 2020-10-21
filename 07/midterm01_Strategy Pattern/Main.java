public class Main {
    public static void main(String[] args) {
        //성적공개용 닉네임 : MACARONS
        final String HOUSE = "house.png"; // 원본 영상 파일 이름

        Image image = new Image(HOUSE);
        image.setImageConverter(new GreyImageConverter());
        image.performConvert();

        image.setImageConverter(new InverseImageConverter());
        image.performConvert();

        image.setImageConverter(new SepiaImageConverter());
        image.performConvert();
    }
}
