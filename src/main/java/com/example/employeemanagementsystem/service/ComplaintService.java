package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.entity.ComplaintEntity;
import com.example.employeemanagementsystem.repository.complaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class ComplaintService {
    @Autowired
   public complaintRepository complaintRepository;

    //create a new complaint using post method
    public ComplaintEntity raisedComplaint(ComplaintEntity complaintDetails) {

        complaintDetails.setStatus(ComplaintEntity.Status.OPEN);
        complaintDetails.setRaisedOn(LocalDateTime.now());
        return complaintRepository.save(complaintDetails);
    }
//get all complaint data using get mapping
    public ComplaintEntity viewAllComplaint(Long complaintId)
    {
        Optional<ComplaintEntity> viewAllComplaintDetails=complaintRepository.findById(complaintId);
        return viewAllComplaintDetails.orElse(null);
    }

    //update complaintEntity
    public ComplaintEntity updateComplaint(ComplaintEntity ComplaintEntity)
    {
       return  complaintRepository.save(ComplaintEntity);

    }

    // update  complaintEntity using ID
    public ComplaintEntity updateComplaintStatus(Long complaintId, ComplaintEntity.Status newStatus) {
        ComplaintEntity complaint = complaintRepository.findById(complaintId)
                .orElseThrow(() -> new RuntimeException("Complaint not found with ID: " + complaintId));

        complaint.setStatus(newStatus);

        // If status is set to RESOLVED, set resolvedOn time
        if (newStatus == ComplaintEntity.Status.RESOLVED) {
            complaint.setResolvedOn(LocalDateTime.now());
        }

        return complaintRepository.save(complaint);
    }

        //get complaint data based on their status

        public Map<ComplaintEntity.Status, Long> getComplaintStatusCount() {
            Map<ComplaintEntity.Status, Long> statusCountMap = new HashMap<>();
            for (ComplaintEntity.Status s : ComplaintEntity.Status.values()) {
                statusCountMap.put(s, complaintRepository.countByStatus(s));
            }
            return  statusCountMap;

        }

}
