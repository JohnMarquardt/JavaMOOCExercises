import java.util.ArrayList;

public class Room {
    private ArrayList<Person> person;
    
    public Room() {
        this.person = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.person.add(person);
    }
    
    public boolean isEmpty() {
        if (this.person.isEmpty()) {
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons() {
        return person;
    }
    
    public Person shortest() {
        if (this.person.isEmpty()) {
            return null;
        }
        Person shortestPerson = person.get(0);
        int shortest = person.get(0).getHeight();
        
        for (Person a: person) {
            int currentHeight = a.getHeight();
            if (currentHeight < shortest) {
                shortest = currentHeight;
                shortestPerson = a;
            }
        }
        return shortestPerson;
    }
    
    public Person take() {
        if (this.person.isEmpty()) {
            return null;
        }
        Person shortestPerson = person.get(0);
        int shortest = person.get(0).getHeight();
        
        for (Person a: person) {
            int currentHeight = a.getHeight();
            if (currentHeight < shortest) {
                shortest = currentHeight;
                shortestPerson = a;
                
            }
        }
        person.remove(shortestPerson);
        return shortestPerson;
    }
    
}
