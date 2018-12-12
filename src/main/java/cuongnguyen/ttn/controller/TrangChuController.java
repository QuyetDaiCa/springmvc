package cuongnguyen.ttn.controller;

import cuongnguyen.ttn.bean.NhanVien;
import cuongnguyen.ttn.entity.NhanVienEntity;
import cuongnguyen.ttn.service.NhanVienService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/")
public class TrangChuController {
    @Autowired
    NhanVienService nhanVienService;
    @GetMapping()
    @Transactional
    public String getrTrangChu(){
        return "trangchu";
    }

}
