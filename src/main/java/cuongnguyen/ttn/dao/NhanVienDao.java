package cuongnguyen.ttn.dao;

import cuongnguyen.ttn.entity.NhanVienEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NhanVienDao {
    @Autowired
    SessionFactory sessionFactory;


    public  NhanVienEntity getNhanVien(Integer id){
        Session session = sessionFactory.getCurrentSession().getSession();
        return (NhanVienEntity) session.createQuery("FROM NhanVienEntity WHERE id = id").getResultList();
    }
}
