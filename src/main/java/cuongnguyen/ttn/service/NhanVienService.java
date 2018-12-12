package cuongnguyen.ttn.service;

import cuongnguyen.ttn.bean.NhanVien;
import cuongnguyen.ttn.commons.conveter.EntitytoPojo;
import cuongnguyen.ttn.dao.NhanVienDao;
import cuongnguyen.ttn.entity.NhanVienEntity;
import cuongnguyen.ttn.pojo.NhanVienPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService implements NhanVienServiceImpl {
    @Autowired
    private NhanVienDao nhanVienDao;

    @Autowired
    private EntitytoPojo entitytoPojo;
    public NhanVienPojo getNhanVienId(Integer id){
        NhanVienEntity nhanVienEntity = nhanVienDao.getNhanVien(id);
        NhanVienPojo nhanVienPojo = entitytoPojo.conveterNhanVien(nhanVienEntity);
       return nhanVienPojo;
    }
}
