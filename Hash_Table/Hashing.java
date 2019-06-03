public class Hashing {
    static int INITIAL_SIZE = 16;
    static HashItem[] items = new HashItem[INITIAL_SIZE];
    static HashItem temp;

    public static void main(String[] args) {
        for(int i=0; i<30; i++) {
            final String key = String.valueOf(i);
            put(key, String.valueOf((int)(Integer.valueOf(key)+Math.random()*5000+1))) ;
        }

        printT();
    }

    public static void put(String key, String value) {
            int hash = getHash(key);
            final HashItem hashItem = new HashItem(key, value);
            if(items[hash] == null) {
                items[hash] = hashItem;
            }
            // If there is already an item at current hash
            // position, add item to the linked list.
            else {
                temp = items[hash];
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = hashItem;
            }
        }
    
    private static int getHash(String key) {
        // piggy backing on java string
        // hashcode implementation.
        return key.hashCode() % INITIAL_SIZE;
    }


    public static void printT(){
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
            // Linked list of same hash items.
            HashItem next;

            public HashItem(String key, String value) {
                this.set = "["+key+","+value+"]";
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

    
}

    