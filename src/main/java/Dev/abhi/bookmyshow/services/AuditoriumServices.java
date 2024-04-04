package Dev.abhi.bookmyshow.services;

import Dev.abhi.bookmyshow.models.Auditoriums;

import Dev.abhi.bookmyshow.models.Theaters;
import Dev.abhi.bookmyshow.repostitories.AuditoriumsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class AuditoriumServices {
    @Autowired
    private AuditoriumsRepository auditoriumsRepository;
    @Autowired
    private TheaterServices theaterServices;



    public Auditoriums saveAuditorium(String name, int Capacity, int TheaterId) {
        Auditoriums auditoriums = new Auditoriums();
        auditoriums.setName(name);
        auditoriums.setCapecity(Capacity);
        auditoriums.setId(TheaterId);
        Auditoriums saveAuditorium = auditoriumsRepository.save(auditoriums);

        Theaters theaters = theaterServices.getTheaterById(TheaterId);
        List<Auditoriums> auditoriumsList = theaters.getAudis();
        auditoriumsList.add(saveAuditorium);
        theaters.setAudis(auditoriumsList);
        return saveAuditorium;
    }

    public AuditoriumServices(AuditoriumsRepository auditoriumsRepository) {
        this.auditoriumsRepository = auditoriumsRepository;
    }

    public Auditoriums saveAuditoriumsByName(String auditName) {
        Auditoriums auditoriums = new Auditoriums();
        auditoriums.setName(auditName);
        return auditoriumsRepository.save(auditoriums);
    }

    public Auditoriums saveAuditoriumsByName(Auditoriums auditoriums) {
        return auditoriumsRepository.save(auditoriums);
    }

    public Auditoriums saveAuditById(int AuditId) {
        Auditoriums auditoriums = new Auditoriums();
        auditoriums.setId(auditoriums.getId());
        return auditoriumsRepository.save(auditoriums);
    }

    public Auditoriums saveAuditById(Auditoriums auditoriums) {
        return auditoriumsRepository.save(auditoriums);
    }

    public boolean deleteById(int AuditId) {
        auditoriumsRepository.deleteById(AuditId);
        System.out.println(AuditId + " is deleted ");
        return true;
    }
}
