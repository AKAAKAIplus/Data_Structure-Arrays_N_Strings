public class Hashing {
    static int INITIAL_SIZE = 30;
    static HashItem[] items = new HashItem[INITIAL_SIZE];
    static HashItem temp;

    public static void main(String[] args) {
        //Utilize the direct access hash fuction
        System.out.println("Utilize the direct access hash fuction");
        for(int i=0; i<30; i++) {
            final String key = String.valueOf(i);
            put(key, String.valueOf((int)(Integer.valueOf(key)+Math.random()*5000+1)) , 0) ;
        }
        printTable();


        items = new HashItem[INITIAL_SIZE];
        //Utilize the division hash fuction
        System.out.println("Utilize the division hash fuction");
        for(int i=0; i<30; i++) {
            final String key = String.valueOf(i);
            put(key, String.valueOf((int)(Integer.valueOf(key)+Math.random()*5000+1)), 1) ;
        }
        printTable();


        items = new HashItem[INITIAL_SIZE];
        //Utilize the multiplication hash fuction
        System.out.println("Utilize the multiplication hash fuction");
        for(int i=0; i<30; i++) {
            final String key = String.valueOf(i);
            put(key, String.valueOf((int)(Integer.valueOf(key)+Math.random()*5000+1)), 2) ;
        }
        printTable();
    }

    public static void put(String key, String value, int mode) {
            int hash = getHashFromFunction(key,mode);
            final HashItem hashItem = new HashItem(key, value);
            if(items[hash] == null) {
                items[hash] = hashItem;
            }
            // If there is already an item at current hash.
            else {
                temp = items[hash];
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = hashItem;
            }
        }
    
    
    private static int getHashFromFunction(String key, int mode) {
        //Direct access hash fuction
        if(mode == 0){
            return Integer.valueOf(key);
        }
        //Division hash fuction
        else if(mode == 1){
            return key.hashCode() % INITIAL_SIZE;
        }
        //Multiplication hash fuction
        else if(mode == 2){
            // double( m * ( A * key mod 1) )

            // Set A is 0.314
            double temp_num = 0.314*Double.valueOf(key);
            temp_num = temp_num - (long)temp_num;
            double output = temp_num * (double)INITIAL_SIZE;
            output = (int)output;
            
            return (int)output;
        }
        else{
            return Integer.valueOf(key);
        }
    }


    public static void printTable(){
        for (HashItem item : items) {
            if(item == null) {
                System.out.println("THIS ONE IS EMPTY!");
            }
            else{
                temp = item;
                do{
                    System.out.print(temp.set+"-->");
                    temp = temp.next;
                } while(temp != null);
                System.out.println("END");
            }
        }
        
    }

    public static class HashItem {
        String key;
        String value;
        String set;
        
        HashItem next;

        public HashItem(String key, String value) {
            this.set = "["+key+","+value+"]";
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    
}

    