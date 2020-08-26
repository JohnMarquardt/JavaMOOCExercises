
public class HealthStation {
    private int weighingsPerformed = 0;

    public int weigh(Person person) {
        this.weighingsPerformed++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return weighingsPerformed;
    }
}
