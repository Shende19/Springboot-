package com.example.employeemanagementsystem.controller;

import com.example.employeemanagementsystem.entity.ComplaintEntity;
import com.example.employeemanagementsystem.entity.designationEntity;
import com.example.employeemanagementsystem.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/ManagementSystem")
public class ComplaintController {

    @Autowired
 public ComplaintService  ComplaintService;

    //Raise complaint using post mapping
    @PostMapping("/complaints")
    public ResponseEntity<ComplaintEntity> raisedComplaintDetails(@RequestBody ComplaintEntity complaintEntity )
    {
        ComplaintEntity complaint=ComplaintService.raisedComplaint(complaintEntity);
        return ResponseEntity.ok(complaint);
    }

    // view all complaint using get mapping

    @GetMapping("/complaints/{id}")

    public ComplaintEntity viewAllComplaint(@PathVariable("id") Long complaintId)
    {
        return ComplaintService.viewAllComplaint(complaintId);
    }

    // update status using put mapping
    @PutMapping("/complaints")
    public ResponseEntity<ComplaintEntity> updateComplaintStatus(@RequestBody ComplaintEntity complaintEntity )
    {
        ComplaintEntity updateComplaint=ComplaintService.updateComplaint(complaintEntity);
        return ResponseEntity.ok(updateComplaint);
    }

    @PutMapping("/complaints/{id}/status")
    public ResponseEntity<ComplaintEntity> updateStatus(@PathVariable("id") Long complaintId, @RequestParam ComplaintEntity.Status status) {

        ComplaintEntity updatedComplaint = ComplaintService.updateComplaintStatus(complaintId, status);
        return ResponseEntity.ok(updatedComplaint);
    }

    // get complaint data and their status
    @GetMapping("/status-count")
    public ResponseEntity<Map<ComplaintEntity.Status, Long>> getStatusCount() {
        Map<ComplaintEntity.Status, Long> statusCount = ComplaintService.getComplaintStatusCount();
        return ResponseEntity.ok(statusCount);

    }


}
