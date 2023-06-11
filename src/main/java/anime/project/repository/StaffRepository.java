package anime.project.repository;

import anime.project.domain.Character;
import anime.project.domain.Staff;

import java.util.List;

public interface StaffRepository {
    public void insert(Staff staff);
    public void update(Staff staff);
    public List<Staff> findByName(String name);

}
