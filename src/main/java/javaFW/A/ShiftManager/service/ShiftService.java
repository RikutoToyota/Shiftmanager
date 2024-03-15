package javaFW.A.ShiftManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaFW.A.ShiftManager.model.ShiftModel;
import javaFW.A.ShiftManager.repository.ShiftRepository;

@Service
public class ShiftService {

    @Autowired
    private ShiftRepository shiftRepository;

    public List<ShiftModel> getAllShifts() {
        return shiftRepository.findAll();
    }

    public ShiftModel getShiftById(Long shiftId) {
        return shiftRepository.findById(shiftId).orElse(null);
    }

    public ShiftModel createShift(ShiftModel shift) {
        return shiftRepository.save(shift);
    }

    public ShiftModel updateShift(Long shiftId, ShiftModel updatedShift) {
        ShiftModel existingShift = shiftRepository.findById(shiftId).orElse(null);

        if (existingShift != null) {
            existingShift.setShiftStart(updatedShift.getShiftStart());
            existingShift.setShiftEnd(updatedShift.getShiftEnd());
            existingShift.setUserId(updatedShift.getUserId());
            existingShift.setDate(updatedShift.getDate());

            return shiftRepository.save(existingShift);
        } else {
            return null;
        }
    }

    public void deleteShift(Long shiftId) {
        shiftRepository.deleteById(shiftId);
    }
}
