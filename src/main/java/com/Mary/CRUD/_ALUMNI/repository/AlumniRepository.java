package com.Mary.CRUD._ALUMNI.repository;

import com.Mary.CRUD._ALUMNI.entity.AlumniEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumniRepository  extends JpaRepository <AlumniEntity,Long > {
    //All crud database methods

}
