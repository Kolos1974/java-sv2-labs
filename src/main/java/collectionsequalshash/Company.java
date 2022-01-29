package collectionsequalshash;

import java.util.Objects;

public class Company {
    private String companyName;
    private String taxNumber;

    public Company(String companyName, String taxNumber) {
        this.companyName = companyName;
        this.taxNumber = taxNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(companyName, company.companyName) && Objects.equals(taxNumber, company.taxNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, taxNumber);
    }
}
