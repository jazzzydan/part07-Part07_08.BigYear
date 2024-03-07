import java.util.ArrayList;

public class BirdList {
    private ArrayList<Bird> birdsList;

    public BirdList() {
        this.birdsList = new ArrayList<>();
    }

    public void addBird(Bird newBird) {
        this.birdsList.add(newBird);
    }

    public void addObservation(String birdName) {
        boolean found = false;
        for (Bird bird : this.birdsList) {
            String nameFromList = bird.getName();
            if (nameFromList.equals(birdName)) {
                int currentObservations = bird.getObservations();
                currentObservations++;
                bird.setObservations(currentObservations);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
    public void printAll() {
        for (Bird bird : this.birdsList) {
            System.out.println(bird.getName() + " (" + bird.getNameLatin() + ") " + bird.getObservations() + " observations");
        }
    }
    public void printOne(String birdName) {
        boolean found = false;
        for (Bird bird : this.birdsList) {
            String nameFromList = bird.getName();
            if (nameFromList.equals(birdName)) {
                System.out.println(bird.getName() + " (" + bird.getNameLatin() + ") " + bird.getObservations() + " observations");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }
}
