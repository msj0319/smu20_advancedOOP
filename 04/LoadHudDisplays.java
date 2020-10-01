import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;

public class LoadHudDisplays implements LoadDisplayInterface {
    String fileName;
    public LoadHudDisplays(String filename) {
        fileName = filename;
    }
    public ArrayList<String> load() {
        ArrayList<String> list = new ArrayList<>();
        try{
            //입력버퍼 생성
            BufferedReader readme = new BufferedReader(new InputStreamReader(new FileInputStream(fileName))); //입력 스트림 생성 및 파일 객체 생성
            String line = readme.readLine();
            while(line != null) {
                list.add(line);
                line = readme.readLine();
            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
