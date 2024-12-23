package pl.kurs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kurs.dao.GenericDao;
import pl.kurs.entity.Phone;

@Service
@RequiredArgsConstructor
public class PhoneService {
    private final GenericDao<Phone> genericDao;

    public void save(Phone phone) {
        if (isValidPhone(phone)) {
            genericDao.save(phone);
        } else {
            System.out.println("No field can be null!");
        }
    }

    public Phone findById(Long id) {
        return genericDao.findById(id);
    }

    private boolean isValidPhone(Phone phone) {
        return phone.getName() != null
                && phone.getModel() != null
                && phone.getPrice() != null
                && phone.getQuantity() != null
                && phone.getCondition() != null;
    }
}
