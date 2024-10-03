package com.demo.Service;

import com.demo.Repository.MobileRepository;
import com.demo.entity.Mobile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobileService {
    MobileRepository mbRep;

    public MobileService(MobileRepository mbRep){
        this.mbRep =mbRep;
    }

    public Mobile insertMobile(Mobile m) {
        Mobile mr=mbRep.save(m);
        return mr;
    }

    public List<Mobile> getAllData() {
        List<Mobile> mg=mbRep.findAll();
        return mg;

    }

    public String upDateMobile(Long srNo, Mobile mu) {
        Mobile mk=mbRep.findById(srNo).get();
        mk.setSrNo(mu.getSrNo());
        mk.setBrand(mu.getBrand());
        mk.setCost(mu.getCost());
        mk.setColor(mu.getColor());
        mbRep.save(mk);
        return "object is Updated";
    }

    public Optional<Mobile> getdata(Long srNo) {
        Optional<Mobile> mk=mbRep.findById(srNo);
        return mk;
    }

    public void delMobiledata(Long srNo) {
        mbRep.deleteById(srNo);
    }
}

