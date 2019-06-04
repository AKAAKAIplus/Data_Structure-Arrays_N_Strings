import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        //建立一個ArrayList物件
        ArrayList arrayList = new ArrayList();
        arrayList.add("Hello");
        arrayList.add("你好");
        
        for(int i=0; i<arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}