package pl.kurs.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.kurs.dao.GenericDao;
import pl.kurs.entity.Workers;

@Service
@RequiredArgsConstructor
public class WorkersService {
    private final GenericDao<Workers> genericDao;

    public void save(Workers workers) {
        if (isValidWorker(workers)) {
            genericDao.save(workers);
        } else {
            System.out.println("No field can be null!");
        }
    }

    public Workers findById(Long id) {
        return genericDao.findById(id);
    }

    private boolean isValidWorker(Workers workers) {
        return workers.getFirstName() != null
                && workers.getLastName() != null
                && workers.getSalary() != null
                && workers.getPosition() != null;
    }
}
