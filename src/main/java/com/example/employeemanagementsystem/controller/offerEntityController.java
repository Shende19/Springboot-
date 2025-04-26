package com.example.employeemanagementsystem.controller;


import com.example.employeemanagementsystem.entity.OfferEntity;
import com.example.employeemanagementsystem.service.offerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/offers")
public class offerEntityController {
  @Autowired
    offerService OfferService;

     @GetMapping("/offer-details")
    public List<OfferEntity> getOfferDetail()
    {
       return OfferService.getOfferServiceDetails();

    }
    @GetMapping("/offer-details-ID/{id}")
  public OfferEntity getOfferDetailsbyID(@PathVariable Long id)
    {
      return OfferService.getOfferbyID(id);
    }




    @PostMapping("/insert-offer-details")

  public ResponseEntity<String> insertOfferData(@RequestBody OfferEntity offerEntity )
    {
      OfferService.saveOfferData(offerEntity);
      return ResponseEntity.ok("Data Inserted Successfully");
    }


    @PutMapping("/update-offer")
    public ResponseEntity<String> updateData(@RequestBody OfferEntity offerUpdateEntity )
    {
      OfferService.updateOfferData(offerUpdateEntity);
      return ResponseEntity.ok("Data Updated Successfully");
    }

    @DeleteMapping("/delete-offer/{id}")
  public ResponseEntity<String> deleteOfferData(@PathVariable Long id)
    {
         OfferService.deleteServiceOfferData(id);
         return ResponseEntity.ok("data deleted sucessfully");

    }

    // for Native Query list object

  @GetMapping("/offer-status")
  public List<OfferEntity> getStatusOfferEntity()
  {
    return OfferService.getOfferStatus();
  }

  //Native Query by ID

  @GetMapping("/offer-details-by-Id")
  public OfferEntity getOfferEntityData(@RequestParam Long id)
  {
    return OfferService.getOfferServiceData(id);

  }

  // native query for finding all offername

  @GetMapping("/offerName")
  public List<OfferEntity> getAllOfferName()
  {
    return OfferService.getAllOfferNameData() ;
  }

}
