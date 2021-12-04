package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate dateOfRegistry;
    private final String registryNumber;

    public Monument(String name, String address, LocalDate  startDate, String startId) {
        if (isEmpty(name) || isEmpty(address) || isEmpty(startId)) {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }

        this.name = name;
        this.address = address;
        this.dateOfRegistry = startDate;
        this.registryNumber = startId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDateOfRegistry() {
        return dateOfRegistry;
    }

    public String getRegistryNumber() {
        return registryNumber;
    }

    private boolean isEmpty(String text){
        if (text==null || text.isBlank()){
            return true;
        }
        return false;
    }

}
