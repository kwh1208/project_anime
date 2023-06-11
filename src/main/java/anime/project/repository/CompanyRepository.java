package anime.project.repository;

import anime.project.domain.Company;

public interface CompanyRepository {
    public void insert(Company company);
    public void update(Company company);
    public void findByName(String name);
}
