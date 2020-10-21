public class Main {
    public static void main(String[] args) {
        //성적공개용 닉네임 : MACARONS

        //i_g_house.png
        IColorConverter iColorConverter = new OriginalColorConverter();
        iColorConverter = new GreyImageConverter(iColorConverter);
        iColorConverter = new InverseImageConverter(iColorConverter);

        Image image = new Image(iColorConverter);
        image.performConvert();

        //i_s_house.png
        iColorConverter = new OriginalColorConverter();
        iColorConverter = new SepiaImageConverter(iColorConverter);
        iColorConverter = new InverseImageConverter(iColorConverter);

        image.setImageConverter(iColorConverter);
        image.performConvert();

        //s_i_house.png
        iColorConverter = new OriginalColorConverter();
        iColorConverter = new InverseImageConverter(iColorConverter);
        iColorConverter = new SepiaImageConverter(iColorConverter);

        image.setImageConverter(iColorConverter);
        image.performConvert();

        //그레이
        IColorConverter iColorConverter1 = new OriginalColorConverter();
        image.setImageConverter(new GreyImageConverter(iColorConverter1));
        image.performConvert();

        //세피아
        image.setImageConverter(new SepiaImageConverter(iColorConverter1));
        image.performConvert();

        //반전
        image.setImageConverter(new InverseImageConverter(iColorConverter1));
        image.performConvert();




    }
}
