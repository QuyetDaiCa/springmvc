package cuongnguyen.ttn.commons.conveter;

import cuongnguyen.ttn.entity.NhanVienEntity;
import cuongnguyen.ttn.pojo.NhanVienPojo;
import org.springframework.stereotype.Component;

@Component
public class EntitytoPojo {
    public NhanVienPojo conveterNhanVien(NhanVienEntity nhanVienEntity){
        NhanVienPojo nhanVienPojo = new NhanVienPojo();
        nhanVienPojo.setId(nhanVienEntity.getId());
        nhanVienPojo.setTenNhanVien(nhanVienEntity.getTenNhanVien());
        nhanVienPojo.setDiaChi(nhanVienEntity.getDiaChi());
        return nhanVienPojo;
    }
}
