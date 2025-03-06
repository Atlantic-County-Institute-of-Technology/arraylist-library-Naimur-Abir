import java.util.ArrayList;
import java.util.Random;

public class Library {
    private ArrayList<String> library;

    public Library(){
        this.library = new ArrayList<>();
    }

    public void addItem(String item){
        if(!library.isEmpty()){
            this.library.add(library.size() - 1, item);
        }
        else{
            this.library.add(item);
        }

    }
    public void removeItem(String item){
        this.library.remove(library.indexOf(item));
    }
    public String getNextItem(){
        String output = this.library.removeFirst();
        return output;
    }
    public void skipNextItem(){
        this.library.removeFirst();
    }
    public void sortAlphabet(){
        this.library.sort( (a, b) -> 1 * a.compareTo(b));;
    }
    public int find(String item){
        return this.library.indexOf(item);
    }

    public void shuffle(){
        int len = this.library.size() - 1;
        Random rand = new Random();
        for(int loop = 0; loop <= len; loop++){
            int rand_int = rand.nextInt(len);
            String temp = this.library.get(rand_int);
            this.library.set(rand_int, this.library.get(loop));
            this.library.set(loop, temp);
        }
    }

    public ArrayList<String> print() {
        return this.library;
    }
}
