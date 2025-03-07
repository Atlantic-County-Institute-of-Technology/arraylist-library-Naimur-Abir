import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Library {
    private final ArrayList<String> library;

    public Library(){
        this.library = new ArrayList<>();
    }

    public void addItem(String item){
        this.library.add(item);
    }

    public void removeItem(String item){
        this.library.remove(library.indexOf(item));
    }

    public String getNextItem(){
        return this.library.removeFirst();
    }
    public void skipNextItem(){
        this.library.removeFirst();
    }

    public void sortAlphabet(){
        this.library.sort(Comparator.naturalOrder());;
    }

    public int find(String item){
        return this.library.indexOf(item);
    }

    public void shuffle(){
        int len = this.library.size() - 1;
        Random rand = new Random();
        for(int loop = 0; loop <= len; loop++){
            int rand_int = rand.nextInt(len);
            while(rand_int == loop){
                rand_int = rand.nextInt(len);
            }
            String temp = this.library.get(rand_int);
            this.library.set(rand_int, this.library.get(loop));
            this.library.set(loop, temp);
        }
    }

    public ArrayList<String> get_list() {
        return this.library;
    }
}
