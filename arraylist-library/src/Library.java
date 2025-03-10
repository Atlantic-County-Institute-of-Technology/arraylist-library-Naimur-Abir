import java.util.ArrayList;
import java.util.Comparator;    //used instead of sort
import java.util.Random;

public class Library {
    private final ArrayList<String> library;

    public Library(){            //basic constuctor for the libarary class
        this.library = new ArrayList<>();
    }

    public void addItem(String item){        //adds a string to the list based on the arguments
        this.library.add(item);
    }

    public void removeItem(String item){     //removes an item from the list based on the arguments
        this.library.remove(library.indexOf(item));
    }

    public String getNextItem(){              //removes the first value in the list at index zero and returns it, this function was added by intelliJ
        return this.library.removeFirst();
    }
    public void skipNextItem(){                //removes the first value in the list at index zero but doesn't return anything, this function was added by intelliJ
        this.library.removeFirst();
    }

    public void sortAlphabet(){                //sorts the list alphabetically comparator object was added by intelliJ
        this.library.sort(Comparator.naturalOrder());;
    }

    public int find(String item){              //finds the index of a string object and returns it
        return this.library.indexOf(item);
    }

    public void shuffle(){                      //shuffles the deck by getting the current index and swapping it with a random one except for itself
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

    public ArrayList<String> get_list() {      //Function to get the list for printing and other purposes 
        return this.library;
    }
}
