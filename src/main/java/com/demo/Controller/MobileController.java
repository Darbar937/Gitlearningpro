package com.demo.Controller;

import com.demo.Service.MobileService;
import com.demo.entity.Mobile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/mobile")
public class MobileController {
    MobileService mbSer;
    public  MobileController(  MobileService mbSer){
        this.mbSer=mbSer;
    }

    @PostMapping
    public ResponseEntity<Mobile>inserMobile(@RequestBody Mobile m){
        Mobile mb=mbSer.insertMobile(m);
        return new ResponseEntity<>(mb, HttpStatus.OK);
    }
    @GetMapping
    public List<Mobile>getMobile(){
        List<Mobile> m=mbSer.getAllData();
        return  m;
    }
    @PutMapping("/{srNo}")
    public ResponseEntity<String>updateMobile(@PathVariable Long srNo,
                                              @RequestBody Mobile mu){
        String updateEntity=mbSer.upDateMobile(srNo,mu);
        return new ResponseEntity<>(updateEntity,HttpStatus.OK);

    }
    @GetMapping("/{srNo}")
    public Optional<Mobile>getByMobile(@PathVariable Long srNo) {
        Optional<Mobile> m = mbSer.getdata(srNo);
        return m;
    }
    @DeleteMapping("/{srNo}")
    public String delmobile(@PathVariable Long srNo){
        mbSer.delMobiledata(srNo);
        return "object is deleted path";
    }
}
