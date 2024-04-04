package Dev.abhi.bookmyshow.Controllre;

import Dev.abhi.bookmyshow.dtos.AuditoriumRequestDtos;
import Dev.abhi.bookmyshow.models.Auditoriums;
import Dev.abhi.bookmyshow.services.AuditoriumServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuditoriumController {
    @Autowired
    private AuditoriumServices auditoriumServices;

//    public ResponseEntity MakeAutit(
//            @RequestBody AuditoriumRequestDtos auditoriumRequestDtos) {
//        return ResponseEntity.ok(auditoriumServices.saveAuditorium(auditoriumRequestDtos.getName(), auditoriumRequestDtos.getAuditId(),
//                auditoriumRequestDtos.getCapacity())
//        );
//    }

    @PostMapping("/Audit")
    public ResponseEntity createAuditorium(@RequestBody AuditoriumRequestDtos auditoriumRequestDtos) {
        try {
            String AudiName = auditoriumRequestDtos.getName();
            if (AudiName == null || AudiName.isEmpty() || AudiName.isBlank()) {
                throw new Exception("Auditorium name is not added correctly");
            }
            Auditoriums saveAudit = auditoriumServices.saveAuditoriumsByName(AudiName);
            return ResponseEntity.ok(saveAudit);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //   @DeleteMapping("/Audit{id}")
//    public ResponseEntity deleteAudit(@PathVariable ("id")int AuditId){
//       boolean isDelete=auditoriumServices.deleteById(AuditId);
//       return ResponseEntity.ok(isDelete);
//   }
    @DeleteMapping("/Audit{id}")
    public ResponseEntity deleteAudit(@PathVariable("id") int AuditId) {
        boolean isDeleted = auditoriumServices.deleteById(AuditId);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Audit/{name}")
    public ResponseEntity getAuditByName(@PathVariable("name") String AuditName) {
        Auditoriums savedAuditorium = auditoriumServices.saveAuditoriumsByName(AuditName);
        if (savedAuditorium != null) {
            ResponseEntity.ok(savedAuditorium);
        } else {
            return ResponseEntity.notFound().build();
        }
        return null;
    }
}
