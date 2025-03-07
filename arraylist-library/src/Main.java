//Naimur Abir
//ArrayList Library
//3-6-2025
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Library musicPlaylist = new Library();
        musicPlaylist.addItem("Beat it");
        musicPlaylist.addItem("Not like us");
        musicPlaylist.addItem("God only knows");
        musicPlaylist.addItem("Creator");
        musicPlaylist.addItem("You Spin Me Round");
        musicPlaylist.addItem("Bling-Bang-Bang-Born");
        musicPlaylist.addItem("Dangerous");
        musicPlaylist.addItem("What Do They Know?");
        musicPlaylist.addItem("I Can Only Count To Four");

        boolean running = true;
        Scanner playerInput = new Scanner(System.in);

        while (running) {
            System.out.print(
                    """
                            Play - Plays the next song.
                            Skip - Skips the next song.
                            Add - Adds a new song to the end of the playlist.
                            Remove - Removes a song from the playlist, if it exists.
                            Sort - Sorts the playlist alphabetically.
                            Shuffle - Randomizes the playlist
                            Find - Returns the position of the song, or indicates that song does not exist.
                            Exit - Quits the program.
                            
                            What would you like to do?:\s"""
            );
            String input = playerInput.nextLine();         //grabs the player input

            switch (input) {
                case "Play", "play" -> {
                    if(!musicPlaylist.get_list().isEmpty()){
                        System.out.printf("%nNow playing - %s%n", musicPlaylist.getNextItem());
                    }
                    else{
                        System.out.println("\nThere is nothing in the playlist.");
                    }
                }
                case "Skip", "skip" -> {
                    if(!musicPlaylist.get_list().isEmpty()){
                        musicPlaylist.skipNextItem();
                    }
                    else{
                        System.out.println("\nThere is nothing in the playlist.");
                    }
                }
                case "Add", "add" -> {
                    System.out.print("\nWhat would you like to add?:");
                    playerInput = new Scanner(System.in);
                    input = playerInput.nextLine();
                    musicPlaylist.addItem(input);
                }
                case "Remove", "remove" -> {
                    if(!musicPlaylist.get_list().isEmpty()){
                        System.out.print("\nWhat would you like to remove?:");
                        playerInput = new Scanner(System.in);
                        input = playerInput.nextLine();
                        if (musicPlaylist.get_list().contains(input)) {
                            musicPlaylist.removeItem(input);
                        } else {
                            System.out.println("Song not in playlist.");
                        }
                    }
                    else{
                        System.out.println("\nThere is nothing in the playlist.");
                    }
                }
                case "Sort", "sort" -> musicPlaylist.sortAlphabet();
                case "Shuffle", "shuffle" -> musicPlaylist.shuffle();
                case "Find", "find" -> {
                    if(!musicPlaylist.get_list().isEmpty()) {
                        System.out.print("\nWhat would you like to find?: ");
                        playerInput = new Scanner(System.in);
                        input = playerInput.nextLine();
                        if (musicPlaylist.get_list().contains(input)) {
                            System.out.printf("%n%s is in position: %s%n", input, musicPlaylist.find(input) + 1);
                        } else {
                            System.out.println("Song not in playlist.");
                        }
                    }
                    else{
                        System.out.println("\nThere is nothing in the playlist.");
                    }
                }
                case "Exit", "exit" -> running = false;
                default -> System.out.println("Not proper input.");
            }
            System.out.println("\n" + musicPlaylist.get_list() + "\n");
        }
    }
}

