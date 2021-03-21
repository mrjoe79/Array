package array;

public class EnhancedForLoop {
    public static void main(String[] args) {
        String[] strArray = {"Java", "Android", "C", "Javascript", "Python"};

 //       for(String lang : strArray) {
 //           System.out.println(lang);

          for(int i=0; i< strArray.length; i++){
              System.out.println(strArray[i]);
        }
    }
}
