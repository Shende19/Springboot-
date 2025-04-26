package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.OfferEntity;
import com.example.employeemanagementsystem.repository.offerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class offerService {
  //get mapping code
  @Autowired
    offerRepo OfferRepo;

    public List<OfferEntity> getOfferServiceDetails()
    {
        return OfferRepo.findAll();

    }

    public OfferEntity getOfferbyID(Long id)
    {
      Optional<OfferEntity> offerData=OfferRepo.findById(id);
      if (offerData.isPresent())
      {
        return offerData.get();
      }
      else
      {
        return null;
      }
    }


//post mapping

    public void saveOfferData(OfferEntity saveOfferEntity)
    {
      OfferRepo.save(saveOfferEntity);
    }
//put mappping

    public void updateOfferData(OfferEntity updateOfferEntity)
    {
      OfferRepo.save(updateOfferEntity);

    }

    // delete mapping
    public OfferEntity deleteServiceOfferData(Long id)
    {
      Optional<OfferEntity> offerDataDelete=OfferRepo.findById(id);

       if(offerDataDelete.isPresent())
       {
         return offerDataDelete.get();
       }
       else
       {
         return null;
       }

    }

    //Native Query
  public List<OfferEntity> getOfferStatus()
  {
      List<OfferEntity> offerList=new ArrayList<>();
      List<Object[]> statusObj = OfferRepo.getOfferStatus();
      for(Object[] obj:statusObj)
      {
          OfferEntity offerObj=new OfferEntity();
          offerObj.setOfferName(obj[0].toString());
          offerObj.setStatus(obj[1].toString());
          offerList.add(offerObj);


      }
     return offerList;
  }
  //Native Query for all offerName

    public List<OfferEntity> getAllOfferNameData()
    {
        List<OfferEntity> list=new ArrayList<>();
        List<Object[]> passwordObj=OfferRepo.getAllOfferName();
        for(Object[] obj:passwordObj)
        {
            OfferEntity offer=new OfferEntity();
            offer.setOfferName(obj[0].toString());
            list.add(offer);

        }
        return list;
    }

  //Native Query using ID

    public OfferEntity getOfferServiceData(Long id)
    {
        return OfferRepo.getOfferEntityById(id);
    }

}
