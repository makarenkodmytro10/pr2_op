// Абстрактний клас учасника обслуговування
public abstract class ServiceParticipant {
    protected String name;

    public ServiceParticipant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}