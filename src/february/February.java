package february;

public class February {

    public String reverseText(String text){
        String finishedText = "";
        if(text.length() > 0){
            finishedText = text.substring(text.length()-1);
            finishedText += reverseText(text.substring(0, text.length()-1));
        }
        return finishedText;
    }
}
