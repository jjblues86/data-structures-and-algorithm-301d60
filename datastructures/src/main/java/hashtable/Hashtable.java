package hashtable;

public class Hashtable {

    private Node[] hashtable;

    public Hashtable(int size){
        hashtable = new Node[size];
    }

    private int hashKey(String key) {
        int arrayIndex = 0;
        char[] characters = key.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            arrayIndex += characters[i];
        }
        return arrayIndex * 599 % hashtable.length;
    }

    public void add(String key, String value){
        int hash = hashKey(key);
        System.out.println("hash = " + hash);
        if(this.hashtable[hash] == null){
            hashtable[hash] = new Node(key, value);

            //this checks to see if the entry already exist in a position
        } else {
            Node temp = hashtable[hash];
            hashtable[hash] = new Node(key, value);
            hashtable[hash].setNext(temp);
        }
    }

    public String get(String key){
        int hash = hashKey(key);
        if(this.hashtable[hash] != null){
            return hashtable[hash].getValue();
        }

        return null;
    }

    public boolean contains(String key){
        int hash = hashKey(key);
        return hashtable[hash] != null;
    }
}
