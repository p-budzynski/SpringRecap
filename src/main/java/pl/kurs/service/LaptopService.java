package pl.kurs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kurs.dao.GenericDao;
import pl.kurs.entity.Laptop;

@Service
@RequiredArgsConstructor
public class LaptopService {
    private final GenericDao<Laptop> genericDao;

    public void save(Laptop laptop) {
        if (isValidLaptop(laptop)) {
            genericDao.save(laptop);
        } else {
            System.out.println("No field can be null!");
        }
    }

    public Laptop findById(Long id) {
        return genericDao.findById(id);
    }

    private boolean isValidLaptop(Laptop laptop) {
        return laptop.getName() != null
                && laptop.getModel() != null
                && laptop.getPrice() != null
                && laptop.getQuantity() != null
                && laptop.getCondition() != null;
    }
}
