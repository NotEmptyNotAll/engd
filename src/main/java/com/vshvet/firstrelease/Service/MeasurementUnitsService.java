package com.vshvet.firstrelease.Service;

import com.vshvet.firstrelease.DAO.MeasurementUnitsDao;
import com.vshvet.firstrelease.payload.Response.MeasurementUnitsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MeasurementUnitsService {

    @Autowired
    private MeasurementUnitsDao measurementUnitsDao;


    // get the units of calculation and create an answer from them
    public List<MeasurementUnitsResponse> getAllUnits() {
        measurementUnitsDao.openCurrentSessionwithTransaction();
        List<MeasurementUnitsResponse> responses = new ArrayList<MeasurementUnitsResponse>() {{
            measurementUnitsDao.getAll().forEach(units -> {
                add(new MeasurementUnitsResponse(units));
            });
        }};
        measurementUnitsDao.closeCurrentSessionwithTransaction();
        return responses;
    }
}
